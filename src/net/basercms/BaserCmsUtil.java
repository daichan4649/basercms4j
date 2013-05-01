package net.basercms;

public class BaserCmsUtil {

    public static String createSpaceUrl(String spaceId) {
        //TODO 仕様決めから(backlogだとこんなかんじ)
        // https://[スペースID].backlog.jp/XML-RPC
        StringBuilder url = new StringBuilder();
        url.append("https://");
        url.append(spaceId);
        url.append(".backlog.jp/XML-RPC");
        return url.toString();
    }
}
