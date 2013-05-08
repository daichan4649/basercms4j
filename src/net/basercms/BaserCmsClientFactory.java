package net.basercms;

public class BaserCmsClientFactory {

    public enum ServerType {
        XMLRPC,
        MOCK;
    }

    public static BaserCmsClient getInstance(BaserCmsSettings settings) {
        return getInstance(ServerType.MOCK, settings);
    }

    public static BaserCmsClient getInstance(ServerType type, BaserCmsSettings settings) {
        //        switch (type) {
        //        case XMLRPC:
        //            return new BaserCmsClientImpl(settings);
        //        case MOCK:
        //            return new BaserCmsClientMock(settings);
        //        }
        throw new RuntimeException();
    }
}
