package com.example.jerk.fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    private Button btn;
    private MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=(FrameLayout)findViewById(R.id.fraglayout);
        btn=(Button)findViewById(R.id.start_btn);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myFragment==null){
                    myFragment=new MyFragment();
                }
                btn.setVisibility(View.GONE);


                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                myFragment=new MyFragment();
                ft.add(R.id.fraglayout,myFragment);
                ft.commit();
                ChangeFragment(myFragment);
            }

        });
    }

    private void ChangeFragment(MyFragment myFragment) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fraglayout,myFragment);
        ft.commit();
    }

}