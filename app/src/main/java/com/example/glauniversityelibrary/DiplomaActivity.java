package com.example.glauniversityelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DiplomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diploma);
        RecyclerView programmingList=(RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] courses={"Certificate Course in CAD/CAM & CNC","Diploma in Engineering Mechanical Engineering",
        "Diploma in Engineering Electronics and Communications Engineering","Certificate Course in Computer Hardware and Networking(1 year Program",
        "Diploma in Engineering Computer Engineering","Diploma in Engineering Civil Engineering","Advance Diploma Course in Advance CNC and CAD / CAM(1 Year Program)",
                "Diploma in Engineering Electrical Engineering","Diploma in Engineering Chemical Engineering",
                "Advance Diploma Course in Tools & Die Making (1 Year Program)"};
        programmingList.setAdapter(new ProgrammingAdapter2(courses));


    }
}
