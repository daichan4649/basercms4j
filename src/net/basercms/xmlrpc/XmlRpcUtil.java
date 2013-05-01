package net.basercms.xmlrpc;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory;
import org.apache.xmlrpc.client.XmlRpcTransport;

public class XmlRpcUtil {

    public static XmlRpcClientConfigImpl createXmlRpcConfig(String userName, String password, String url) {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setBasicUserName(userName);
        config.setBasicPassword(password);
        try {
            config.setServerURL(new URL(url));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return config;
    }

    public static XmlRpcClient createXmlRpcClient(XmlRpcClientConfigImpl config) {
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        return client;
    }

    public static XmlRpcTransport createXmlRpcTransport(XmlRpcClient client, ProxySettings proxySettings) {
        Proxy proxy = createProxy(proxySettings);

        XmlRpcSun15HttpTransportFactory transportFactory = new XmlRpcSun15HttpTransportFactory(client);
        transportFactory.setProxy(proxy);
        XmlRpcTransport transport = transportFactory.getTransport();
        return transport;
    }

    private static Proxy createProxy(ProxySettings proxySettings) {
        SocketAddress socketAddress = new InetSocketAddress(proxySettings.getProxyUrl(), proxySettings.getProxyPort());
        Proxy proxy = new Proxy(Type.HTTP, socketAddress);
        return proxy;
    }

    public static Authenticator getAuthenticator(final ProxySettings proxySettings) {
        return new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                String userName = proxySettings.getProxyUserName();
                String password = proxySettings.getProxyPassword();
                return new PasswordAuthentication(userName, password.toCharArray());
            }
        };
    }
}
