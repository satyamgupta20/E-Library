package com.example.glauniversityelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GraduateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduate);
        RecyclerView programmingList=(RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] courses = {"B.Tech Civil Engineering","B.Tech (Lateral Entry) Civil",
                "B.Tech CSE Cloud Computing & Virtualization","BBA Human Resourse, Marketing, Finance, Banking & Insurance",
                "B.Com (Hons.)","B Pharm","B.Tech Computer Science and Engineering","B.Tech Mechanical Engineering",
                "B.Tech (Lateral Entry) Electrical Engineering","B.Sc (Hons.) Bio-Tech","B Ed Education",
                "B.Sc. (Hons.) Physics","B.Tech (Lateral Entry) Mechanical Engineering","B.Tech CSE Cyber Security and Forensics",
                "B.Tech CSE Artificial Intelligence and Machine Learning","BBA Family Business",
                "B.Com (Hons.) CIMA","B Pharm (Lateral Entry)","B.Tech Electrical Engineering","B.Tech ME Mechatronics",
                "B.Tech (Lateral Entry) Electronics and Communication Engineering","B.Com L.L.B","B.A.L.L.B",
                "B.Tech (Lateral Entry) CSE","B.Tech CSE Data Analytics","B.Tech CSE Internet of things(IOT)",
                "BBA (Hons.)","D.Pharm","BCA","B.Tech  Electronics and Communication Engineering",
                "B.Tech ME Automobile Engineering","B.A. (Hons.) Economics","B.Sc.(Hons.)Chemistry",
                "B.Sc.(Hons.)Chemistry","B.Sc.(H) Agriculture"};
        programmingList.setAdapter(new ProgrammingAdapter2(courses));

    }
}
