package net.basercms;

import java.util.List;

public interface BaserCmsClient {
    enum ApiType {
        /** 記事の作成 */
        NEW_PAGE("bc.newPage"),
        /** ファイルアップロード */
        UPLOAD_FILE("bc.uploadFile"),
        /** カテゴリ一覧取得 */
        GET_CATEGORIES("bc.getCategories"),
        /** タグ取得 */
        GET_TAGS("bc.getTags"),
        /** 記事取得 */
        GET_PAGE("bc.getPage"),
        /** 記事一覧取得 */
        GET_PAGES("bc.getPages");

        private String methodName;

        private ApiType(String methodName) {
            this.methodName = methodName;
        }

        public String getMethodName() {
            return methodName;
        }
    }

    void newPage(Page page);

    void uploadFile();

    List<Category> getCategories();

    List<Tag> getTags();

    Page getPage();

    List<Page> getPages();
}
