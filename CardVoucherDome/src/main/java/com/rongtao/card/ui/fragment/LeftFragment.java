package com.rongtao.card.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rongtao.card.R;
import com.rongtao.card.view.CardVoucherView;
import com.rongtao.card.view.CardVoucherView2;
import com.rongtao.card.view.CardVoucherView3;

/**
 * Created by rongtao on 2016/5/27.
 */
public class LeftFragment extends Fragment {
    private CardVoucherView cardVoucherView1;
    private CardVoucherView2 cardVoucherView2;
    private CardVoucherView3 cardVoucherView3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_fragment, container, false);
        cardVoucherView1 = (CardVoucherView) view.findViewById(R.id.cardVoucherView1);
        cardVoucherView2 = (CardVoucherView2) view.findViewById(R.id.cardVoucherView2);
        cardVoucherView3 = (CardVoucherView3) view.findViewById(R.id.cardVoucherView3);
        cardVoucherView1.setOrientation1(CardVoucherView.DRAW_VERTICAL);
        cardVoucherView2.setOrientation2(CardVoucherView2.DRAW_VERTICAL);
        cardVoucherView3.setOrientation3(CardVoucherView3.DRAW_VERTICAL);
        return view;
    }
    //避免 fragment切换时,会出现重叠的现象
    @Override
    public void setMenuVisibility(boolean menuVisible) {
        if(getView() != null){
            getView().setVisibility(menuVisible?View.VISIBLE:View.GONE);
        }
        super.setMenuVisibility(menuVisible);
    }

}
