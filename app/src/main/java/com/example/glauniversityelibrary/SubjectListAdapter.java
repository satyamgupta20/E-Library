package com.example.glauniversityelibrary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SubjectListAdapter extends RecyclerView.Adapter<SubjectListAdapter.ProgrammingViewHolder> {

    private String[] data;
    public SubjectListAdapter(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.subject_list_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.subjectName.setText(title);
    }
    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{

        TextView subjectName;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName=(TextView) itemView.findViewById(R.id.subjectName);
        }
    }
}
