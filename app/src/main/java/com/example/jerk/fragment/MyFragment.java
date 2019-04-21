package com.example.jerk.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        TextView tv = (TextView) view.findViewById(R.id.tv1);
        //倒计时总时间为5S，时间防止从4s开始显示
        MyCountTimer myCountTimer = new MyCountTimer(6000, 1000, tv, "0",getActivity());
        myCountTimer.start();



        return view;

    }



}
