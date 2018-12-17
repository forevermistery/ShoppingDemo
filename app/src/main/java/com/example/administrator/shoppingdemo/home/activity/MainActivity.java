package com.example.administrator.shoppingdemo.home.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.administrator.shoppingdemo.R;
import com.example.administrator.shoppingdemo.assortment.assortmentFragment;
import com.example.administrator.shoppingdemo.base.baseFragment;
import com.example.administrator.shoppingdemo.discover.fragment.discoverFragment;
import com.example.administrator.shoppingdemo.home.homeFragment;
import com.example.administrator.shoppingdemo.shoppingCar.shoppingFragment;
import com.example.administrator.shoppingdemo.user.fragment.userFragment;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private FrameLayout frameLayout;
    private RadioButton rb_home;
    private RadioButton rb_type;
    private RadioButton rb_community;
    private RadioButton rb_cart;
    private RadioButton rb_user;
    private RadioGroup rg_main;

    /**
     * 装多个fragment实例集合
     */
    private ArrayList<baseFragment> fragments;
    private int positition=0;
    public Fragment tempFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initFragment();//初始化fragment
        initListener();//设置RadioGroup监听
        rg_main.check(R.id.rb_home);

        //



    }

    private void initListener() {
        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb_home://主页
                        positition=0;
                        break;
                    case R.id.rb_assortment://分类
                        positition=1;
                        break;
                    case R.id.rb_discover://发现
                        positition=2;
                        break;
                    case R.id.rb_shoppingCar://购物车
                        positition=3;
                        break;
                    case R.id.rb_user://用户中心
                        positition=4;
                        break;
                     default:
                         positition=0;
                         break;
                }
                //根据位置取不同的fragment
                baseFragment baseFragment=getFragment(positition);
                /**
                 * 第一个参数：上次显示的fragment
                 * 第二个参数：当前要显示的fragment
                 */
                switchFragment(tempFragment,baseFragment);
            }
        });
    }
    //切换fragment
    private void switchFragment(Fragment fromFragment, baseFragment
            nextFragment) {
        if (tempFragment != nextFragment) {
            tempFragment = nextFragment;
            if (nextFragment != null) {
                FragmentTransaction transaction =
                        getSupportFragmentManager().beginTransaction();
                      // 判断 nextFragment 是否添加
                if (!nextFragment.isAdded()) {
                       // 隐藏当前 Fragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.add(R.id.frameLayout, nextFragment).commit();
                } else {
                      // 隐藏当前 Fragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(nextFragment).commit();
                }
            }
        }
    }

    private baseFragment getFragment(int positition) {
        if (fragments !=null && fragments.size()>0){
            baseFragment baseFragment=fragments.get(positition);
            return baseFragment;
        }
        return null;
    }

    private void initView() {
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        rb_home = (RadioButton) findViewById(R.id.rb_home);
        rg_main = (RadioGroup) findViewById(R.id.rg_main);
    }

    /**
     * 添加的时候按顺序排列
     */
    private  void initFragment(){
        fragments=new ArrayList<>();
        fragments.add(new homeFragment());
        fragments.add(new assortmentFragment());
        fragments.add(new discoverFragment());
        fragments.add(new shoppingFragment());
        fragments.add(new userFragment());
    }




}
