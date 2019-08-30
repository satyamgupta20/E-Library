package com.example.glauniversityelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DoctorateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorate);
        RecyclerView programmingList=(RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] courses={"Ph.D.(Full Time) Management","Ph.D.(Full Time) Civil Engineering","Ph.D.(Full Time) Applied Physics","Ph.D.(Full Time) Electrical Engineering",
                "Ph.D.(Full/Part Time) Pharmacology, Pharmaceutical Chemistry","Ph.D.(Full/Part Time) Pharmaceutics & Pharmacognosy","Ph.D.(Full Time) Computer Science Engineering","Ph.D.(Full Time) Biotechnology",
                "Ph.D.(Full Time) Applied Chemistry","Ph.D.(Full Time) Education","Ph.D.(Full Time) Mechanical Engineering",
                "Ph.D.(Full Time) Electronics & Communication Engineering","Ph.D.(Full Time) Microbiology","Ph.D.(Full Time) Mathematics",
                "Ph.D.(Full Time) English"};
       // programmingList.setAdapter(new ProgrammingAdapter(courses,DoctorateActivity.this));

        programmingList.setAdapter(new ProgrammingAdapter2(courses));
    }
}
