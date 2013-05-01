package net.basercms.xmlrpc;

public class ProxySettings {
    private String proxyUrl;
    private int proxyPort;
    private boolean proxyAuthenticate;
    private String proxyUserName;
    private String proxyPassword;

    public String getProxyUrl() {
        return proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public boolean isProxyAuthenticate() {
        return proxyAuthenticate;
    }

    public void setProxyAuthenticate(boolean authenticate) {
        this.proxyAuthenticate = authenticate;
    }

    public String getProxyUserName() {
        return proxyUserName;
    }

    public void setProxyUserName(String proxyUserName) {
        this.proxyUserName = proxyUserName;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }
}