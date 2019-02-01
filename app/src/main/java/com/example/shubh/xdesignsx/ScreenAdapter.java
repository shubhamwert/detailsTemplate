package com.example.shubh.xdesignsx;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public class ScreenAdapter extends RecyclerView.Adapter<ScreenAdapter.ViewHolder> {
    @NonNull
    @Override
    public ScreenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyler_list,viewGroup,false);
     v.setElevation(2);
     v.setPadding(12,12,12,12);
     v.setBackgroundColor(Color.GRAY);
        ViewHolder vh=new ViewHolder(v);

        return vh;


    }




    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.mDesc.setText(DataSet.arrayList.get(i).getmDescrip());
        viewHolder.mTitleView.setText(DataSet.arrayList.get(i).getmTitle());






    }

    @Override
    public int getItemCount() {
        return DataSet.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTitleView;
        TextView mDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           mTitleView=itemView.findViewById(R.id.Title_m);
            mDesc=itemView.findViewById(R.id.Descrit);


        }
    }
}
