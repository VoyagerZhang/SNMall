package com.sn.snmall.shoppingcart.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sn.snmall.base.BaseFragment;

/**
 * date:2017/4/24
 * author:易宸锋(dell)
 * function:购物车页面的Fragment
 */

public class ShoppingCartFragment extends BaseFragment {
    private TextView mTextView;

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTextView = new TextView(mContext);
        return mTextView;
    }

    @Override
    public void initData() {
        mTextView.setText("购物车页面的Fragment");
    }
}
