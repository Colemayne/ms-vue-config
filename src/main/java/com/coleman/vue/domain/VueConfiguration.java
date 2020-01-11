package com.coleman.vue.domain;

import org.springframework.stereotype.Component;

@Component
public class VueConfiguration {

    private String url;
    private String realm;
    private String clientId;
    private String onLoad;
    private String promiseType;

    public VueConfiguration() {
    }

    public VueConfiguration(String url, String realm, String clientId, String onLoad, String promiseType) {
        this.url = url;
        this.realm = realm;
        this.clientId = clientId;
        this.onLoad = onLoad;
        this.promiseType = promiseType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOnLoad() {
        return onLoad;
    }

    public void setOnLoad(String onLoad) {
        this.onLoad = onLoad;
    }

    public String getPromiseType() {
        return promiseType;
    }

    public void setPromiseType(String promiseType) {
        this.promiseType = promiseType;
    }
}
