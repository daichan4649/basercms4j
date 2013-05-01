package net.basercms;

import java.net.Authenticator;
import java.util.List;

import net.basercms.xmlrpc.ProxySettings;
import net.basercms.xmlrpc.XmlRpcUtil;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcTransport;

public class BaserCmsClientImpl implements BaserCmsClient {

    private XmlRpcClientConfigImpl config;
    private XmlRpcClient client;
    @SuppressWarnings("unused")
    private XmlRpcTransport transport;
    @SuppressWarnings("unused")
    private boolean useProxy;

    public BaserCmsClientImpl(BaserCmsSettings settings) {
        initClient(settings);
    }

    private void initClient(BaserCmsSettings settings) {
        String userName = settings.getUserName();
        String password = settings.getPassword();
        String spaceUrl = settings.getSpaceUrl();
        config = XmlRpcUtil.createXmlRpcConfig(userName, password, spaceUrl);
        client = XmlRpcUtil.createXmlRpcClient(config);

        if (settings.isUseProxy()) {
            ProxySettings proxySettings = settings.getProxySettings();
            transport = XmlRpcUtil.createXmlRpcTransport(client, proxySettings);
            useProxy = true;
            if (settings.getProxySettings().isProxyAuthenticate()) {
                Authenticator.setDefault(XmlRpcUtil.getAuthenticator(proxySettings));
            }
        }
    }

    @Override
    public void newPage(Page page) {
        // TODO Auto-generated method stub
    }

    @Override
    public void uploadFile() {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Category> getCategories() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Tag> getTags() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page getPage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Page> getPages() {
        // TODO Auto-generated method stub
        return null;
    }
}
