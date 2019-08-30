package com.example.glauniversityelibrary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ProgrammingAdapter2 extends RecyclerView.Adapter<ProgrammingAdapter2.ProgrammingViewHolder> {

    private String[] data;
    public ProgrammingAdapter2(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.buttonCourse.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{

        Button buttonCourse;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            buttonCourse=(Button)itemView.findViewById(R.id.buttonCourse);


        }
    }
}
