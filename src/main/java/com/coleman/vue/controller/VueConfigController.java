package com.coleman.vue.controller;

import com.coleman.vue.domain.VueConfiguration;
import com.coleman.vue.util.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/vue/v1")
public class VueConfigController {

    @Autowired
    private ConfigUtil configUtil;

    @RequestMapping(path = "/alive", method = RequestMethod.GET)
    public ResponseEntity<String> alive() {
        return ResponseEntity.ok().body("Alive");
    }

    @RequestMapping(path = "/config", method = RequestMethod.GET)
    public ResponseEntity<VueConfiguration> getConfig() {
          return ResponseEntity.ok().body(configUtil.getVueConfig());
    }

}
