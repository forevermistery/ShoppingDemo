package com.example.administrator.shoppingdemo.assortment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.shoppingdemo.base.baseFragment;

public class assortmentFragment extends baseFragment {
    private static final String TAG = assortmentFragment.class.getSimpleName();
    private TextView textView;
    @Override
    public View init() {
        Log.e(TAG,"分类的UI被初始化了");
        textView=new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
       super.initData();
        Log.e(TAG,"分类的数据被初始化了");


    }
}
