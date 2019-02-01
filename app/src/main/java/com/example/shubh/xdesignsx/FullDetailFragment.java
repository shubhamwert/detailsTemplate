package com.example.shubh.xdesignsx;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FullDetailFragment extends Fragment {

TextView textView1;
TextView textView2;
    public FullDetailFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_full_detail, container, false);
        textView1=root.findViewById(R.id.Title_m_details);
        textView2=root.findViewById(R.id.Title_m_full);

        return root;
    }


    public void setView(int i) {
        textView1.setText(DataSet.arrayList.get(i).getmTitle());
        textView2.setText(DataSet.arrayList.get(i).getmTitle());

    }
}
