package com.example.glauniversityelibrary;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdaptorForTest extends RecyclerView.Adapter<AdaptorForTest.ProgrammingViewHolder> {
    List arrayList, arrayList2, arrayList3;
    //private int lastPosition=-1;
    private Context context;


    public AdaptorForTest(Context context, List arrayList, List arrayList2, List arrayList3) {
        this.arrayList = arrayList;
        this.arrayList2 = arrayList2;
        this.arrayList3 = arrayList3;
        this.context = context;

    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_subject_layout_, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String subName, subCode, subCredit;

        //setAnimation(holder.itemView, position);

        subName = arrayList.get(position).toString();
        subCode = arrayList2.get(position).toString();
        subCredit = arrayList3.get(position).toString();

        holder.subName.setText(subName);
        holder.subCode.setText(subCode);
        holder.subCredit.setText(subCredit);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        TextView subName, subCode, subCredit;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            subName = itemView.findViewById(R.id.tv_sub_name);
            subCode = itemView.findViewById(R.id.tvCode);
            subCredit = itemView.findViewById(R.id.tvCredit);


        }

    }
}

