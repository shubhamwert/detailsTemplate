package com.example.shubh.xdesignsx;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements ListFragment.OnClickMyFragmentListner {
    FullDetailFragment fullDetailFragment;
    FrameLayout fl;
    FragmentTransaction ft2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DataSet.dataInit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListFragment mfragment =new ListFragment();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.list_fragment,mfragment);
        ft.commit();
        fl = findViewById(R.id.full_view);
        fullDetailFragment = new FullDetailFragment();
ft2=getSupportFragmentManager().beginTransaction();
        ft2.add(R.id.full_view,fullDetailFragment);
        ft2.commit();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();



    }

    @Override
    public void ReturnStatementMine(int i) {
        fullDetailFragment.setView(i);
        fl.setVisibility(View.VISIBLE);


    }
}
