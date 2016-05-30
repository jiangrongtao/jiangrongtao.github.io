package com.rongtao.card.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rongtao.card.R;

/**
 * Created by rongtao on 2016/5/27.
 */
public class TopFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_fragment, container, false);
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
