package com.example.administrator.shoppingdemo.shoppingCar;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.shoppingdemo.base.baseFragment;

public class shoppingFragment extends baseFragment {
    private static final String TAG = shoppingFragment.class.getSimpleName();
    private TextView textView;
    @Override
    public View init() {
        Log.e(TAG,"购物车的UI被初始化了");
        textView=new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
       super.initData();
        Log.e(TAG,"购物车的数据被初始化了");


    }
}
