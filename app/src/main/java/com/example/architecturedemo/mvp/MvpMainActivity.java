package com.example.architecturedemo.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.architecturedemo.R;

public class MvpMainActivity extends AppCompatActivity implements View.OnClickListener,IMvpView {

    private TextView mResult;
    private Button mSearchBtn;
    private EditText mAccount;
    private Presenter mController;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult = (TextView) findViewById(R.id.result);
        mSearchBtn = (Button)  findViewById(R.id.click);
        mAccount = (EditText) findViewById(R.id.account);
        mSearchBtn.setOnClickListener(this);

        mContext = this;
        mController = new Presenter(this);
    }

    @Override
    public void onClick(View view) {
        // 查询结果
        String account = mAccount.getText().toString();
        mController.getLevel(account);
    }


    @Override
    public void showGetAccountSuccess(String account,int level) {
        Toast.makeText(mContext,"account: " + account + ",level: " + level,Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGetAccountError() {
        Toast.makeText(mContext,"查询失败",Toast.LENGTH_LONG).show();
    }

    /**
     *  activity,代码分层, mvp模型 视图不能够直接获取model的数据
     */
}
