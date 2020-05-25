package com.example.architecturedemo.mvc;

/**
 * Created by yangyong on 20-5-25.
 */

public class Controller {
    private ModelData mModelData;
    public Controller() {
        mModelData = new ModelData();
    }

    //control: 逻辑判断,并做些逻辑
    public void getLevel(String account,IShowResultCallback callback) {
        if(account.equals(mModelData.retSqlAccount())) {
            callback.showGetAccountSuccess(account);
        } else {
            callback.showGetAccountError();
        }
    }
}
