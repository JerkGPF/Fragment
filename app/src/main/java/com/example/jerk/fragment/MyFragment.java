package com.example.jerk.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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

        Button btnCountTimer = (Button) view.findViewById(R.id.btnCountTimer);
        //倒计时总时间为5S，时间防止从4s开始显示
        MyCountTimer myCountTimer = new MyCountTimer(6000, 1000, btnCountTimer, "0",getActivity());
        myCountTimer.start();



        return view;

    }



}
