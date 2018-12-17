package com.example.administrator.shoppingdemo.user.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.shoppingdemo.base.baseFragment;

public class userFragment extends baseFragment {
    private static final String TAG = userFragment.class.getSimpleName();
    private TextView textView;
    @Override
    public View init() {
        Log.e(TAG,"用户中心的UI被初始化了");
        textView=new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
       super.initData();
        Log.e(TAG,"用户中心的数据被初始化了");


    }
}
