package com.example.glauniversityelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class PostGraduateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_graduate);
        RecyclerView programmingList=(RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] courses={"MCA","MBA Integrated","M.Pharm Pharmacology","M.Sc. Chemistry","M.Sc. Bio-Technology","M Tech Civil Engineering",
        "M Tech Computer Science & Engineering","MBA Logistics and Supply Chain Management","Post-Graduation Programme in Securities Market",
        "MCA (Lateral Entry)","M.Tech Energy Systems","M Tech Electrical Engineering","M Tech Mechanical Engineering",
        "M.Sc. Physics","MBA Financial Markets & Banking","M.Pharm Pharmaceutics","MBA","M.Sc. MicroBiology & Immunology",
        "M.A. English","M Tech Electronics and Communication Engineering"};
        programmingList.setAdapter(new ProgrammingAdapter(courses,PostGraduateActivity.this));
    }
}
