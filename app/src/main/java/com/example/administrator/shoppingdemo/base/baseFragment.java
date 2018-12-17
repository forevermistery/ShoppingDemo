package com.example.administrator.shoppingdemo.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 首页：HomeFragment
 * 分类:assotrmentFragment
 * 发现:discoverFragment
 * 购物车:shoppingcarFragment
 *用户中心:userFragment
 */

public abstract class baseFragment extends Fragment {

    protected Context context;

    /**
     *当创建时的时候回调
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return init();

    }

    /**
     * 抽象类由孩子继承，实现不同的效果
     * @return
     */
    public abstract View init() ;
    /*
      当activity被创建了的时候回调这个方法
     */

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    /**
     * 当子类需要网络请求数据时，可以重写该方法，在该方法中联网请求
     */
    public void initData(){

    }
}
