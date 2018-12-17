package com.example.administrator.shoppingdemo.home;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.shoppingdemo.R;
import com.example.administrator.shoppingdemo.base.baseFragment;
import com.example.administrator.shoppingdemo.home.fragment.HomeFragment;

public class homeFragment extends baseFragment {
    private static final String TAG = HomeFragment.class.getSimpleName();
    private TextView textView;
    @Override
    public View init() {
        Log.e(TAG,"主页的UI被初始化了");
       View view=View.inflate(context,R.layout.fragment_home,null);
        return view;
    }

    @Override
    public void initData() {
       super.initData();
        Log.e(TAG,"主页的数据被初始化了");


    }
}
