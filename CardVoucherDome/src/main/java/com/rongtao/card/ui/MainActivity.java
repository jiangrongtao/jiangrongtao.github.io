package com.rongtao.card.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.rongtao.card.R;
import com.rongtao.card.ui.fragment.AllFragment;
import com.rongtao.card.ui.fragment.LeftFragment;
import com.rongtao.card.ui.fragment.TopFragment;
import com.rongtao.card.view.CardVoucherView;
import com.rongtao.card.view.CardVoucherView2;
import com.rongtao.card.view.CardVoucherView3;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardVoucherView cardVoucherView1;
    private CardVoucherView2 cardVoucherView2;
    private CardVoucherView3 cardVoucherView3;
    private Button btnHorizontal;
    private Button btnVertical;
    private Button btnCenter;
    private TopFragment mTopFragment;
    private LeftFragment mLeftFragment;
    private AllFragment mAllFragment;
    private FragmentTransaction mTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        rigisterClick();
    }

    private void rigisterClick() {
        btnHorizontal.setOnClickListener(this);
        btnCenter.setOnClickListener(this);
        btnVertical.setOnClickListener(this);
    }

    private void init() {
        // 创建Fragment对象
        mTopFragment = new TopFragment();
        mLeftFragment = new LeftFragment();
        mAllFragment = new AllFragment();
        replaceFragment(mTopFragment);
         btnHorizontal = (Button) findViewById(R.id.horizontal);
         btnCenter = (Button) findViewById(R.id.center);
         btnVertical = (Button) findViewById(R.id.vertical);
    }
    // fragment切换
    private void replaceFragment(Fragment newFragment) {
        // 开启事物
        mTransaction = this.getSupportFragmentManager().beginTransaction();
        if (!newFragment.isAdded()) {
            try {
                mTransaction.replace(R.id.content, newFragment);
                mTransaction.addToBackStack(null);
                mTransaction.commit();
            } catch (Exception e) {
            }
        } else {
            mTransaction.show(newFragment);
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.horizontal:
                replaceFragment(mTopFragment);
                break;
            case R.id.center:
                replaceFragment(mAllFragment);
                break;
            case R.id.vertical:
                replaceFragment(mLeftFragment);
                break;
        }
    }
}
