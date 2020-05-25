package com.example.architecturedemo.mvp;

/**
 * Created by yangyong on 20-5-25.
 */

public interface IMvpView {
    void showGetAccountSuccess(String account,int level);

    void showGetAccountError();
}
