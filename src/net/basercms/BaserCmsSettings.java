package net.basercms;

import net.basercms.xmlrpc.ProxySettings;

public class BaserCmsSettings {
    private String userName;
    private String password;
    private String spaceId;
    private ProxySettings proxySettings;

    public BaserCmsSettings(String userName, String password, String spaceId) {
        this.userName = userName;
        this.password = password;
        this.spaceId = spaceId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSpaceUrl() {
        return BaserCmsUtil.createSpaceUrl(spaceId);
    }

    public ProxySettings getProxySettings() {
        return proxySettings;
    }

    public void setProxySettings(ProxySettings proxySettings) {
        this.proxySettings = proxySettings;
    }

    public boolean isUseProxy() {
        return proxySettings != null;
    }
}
