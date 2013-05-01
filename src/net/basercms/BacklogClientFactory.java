package net.basercms;

public class BacklogClientFactory {

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
        //            return new BacklogClientImpl(settings);
        //        case MOCK:
        //            return new BacklogClientMock(settings);
        //        }
        throw new RuntimeException();
    }
}
