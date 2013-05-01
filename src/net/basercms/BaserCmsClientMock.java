package net.basercms;

import java.util.List;

public class BaserCmsClientMock implements BaserCmsClient {

    public BaserCmsClientMock(BaserCmsSettings settings) {
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
