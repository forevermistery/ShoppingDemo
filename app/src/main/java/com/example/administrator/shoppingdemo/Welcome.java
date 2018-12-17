package com.example.administrator.shoppingdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.administrator.shoppingdemo.home.activity.MainActivity;

public class Welcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //两秒后跳转
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Welcome.this,MainActivity.class));
                        //关闭当前页面
                        finish();
                    }
                },2000);
    }
}
