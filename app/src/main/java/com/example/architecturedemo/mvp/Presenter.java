package com.example.architecturedemo.mvp;

/**
 * Created by yangyong on 20-5-25.
 */

public class Presenter {
    private ModelData mModelData;
    private IMvpView mIMvpView;

    public Presenter(IMvpView iMvpView) {
        mModelData = new ModelData();
        this.mIMvpView = iMvpView;
    }

    //control: 逻辑判断,并做些逻辑
    public void getLevel(String account) {
        if(account.equals(mModelData.retSqlAccount())) {
            mIMvpView.showGetAccountSuccess(account,mModelData.retSqlLevel());
        } else {
            mIMvpView.showGetAccountError();
        }
    }
}
