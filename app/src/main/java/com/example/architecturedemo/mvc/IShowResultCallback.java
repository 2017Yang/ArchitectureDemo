package com.example.architecturedemo.mvc;

/**
 * Created by yangyong on 20-5-25.
 */

public interface IShowResultCallback {
    void showGetAccountSuccess(String account);

    void showGetAccountError();
}
