package com.example.architecturedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mResult;
    private Button mSearchBtn;
    private EditText mAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult = (TextView) findViewById(R.id.result);
        mSearchBtn = (Button)  findViewById(R.id.click);
        mAccount = (EditText) findViewById(R.id.account);

        mSearchBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 查询结果
        String account = mAccount.getText().toString();
        getLevel(account);
    }

    //control: 逻辑判断,并做些逻辑
    private void getLevel(String account) {
        if(account.equals(retSqlAccount())) {
            showGetAccountSuccess(account);
        } else {
            showGetAccountError();
        }
    }


    // View: 显示查询成功
    private void showGetAccountSuccess(String account) {

        Toast.makeText(this,"account: " + account + ",level: " + retSqlLevel(),Toast.LENGTH_LONG).show();
    }


    //View: 显示失败
    private void showGetAccountError() {
        Toast.makeText(this,"查询失败",Toast.LENGTH_LONG).show();
    }


    // model: 获取帐号
    private String retSqlAccount() {
        return "2";
    }

    // model: 获取等级
    private int retSqlLevel() {
        return 100;
    }

    /**
     * activity 是一个视图,所有的操作都在activity操作
     */
}
