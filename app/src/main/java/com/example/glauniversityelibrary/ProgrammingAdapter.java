package com.example.glauniversityelibrary;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String[] data;
    private Context context;

    public ProgrammingAdapter(String[] data, Context context) {
        this.context = context;
        this.data = data;

    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProgrammingViewHolder holder, final int position) {
        String title = data[position];
        holder.buttonCourse.setText(title);


        holder.buttonCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.buttonCourse.getText().equals("MCA")) {
                    Intent intent = new Intent(context, McaActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {

        Button buttonCourse;

        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            buttonCourse = (Button) itemView.findViewById(R.id.buttonCourse);


        }
    }
}
