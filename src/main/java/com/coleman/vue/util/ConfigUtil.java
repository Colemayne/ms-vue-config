package com.coleman.vue.util;

import com.coleman.vue.domain.VueConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigUtil {

    @Value("${url}")
    private String url;
    @Value("${realm}")
    private String realm;
    @Value("${clientId}")
    private String clientId;
    @Value("${onLoad}")
    private String onLoad;
    @Value("${promiseType}")
    private String promiseType;

    public VueConfiguration getVueConfig() {
        return new VueConfiguration(url,realm,clientId,onLoad,promiseType);
    }
}
