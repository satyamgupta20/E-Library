package com.example.glauniversityelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class McaActivity extends AppCompatActivity {

    private Intent intent;

    ArrayList<String> arrayList;
    ArrayList<String> arrayList2;
    ArrayList<String> arrayList3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca);

        intent=new Intent(McaActivity.this,Mca2Activity.class);

    }

    public void oClick(View view)
    {
        String choice="";

        switch (view.getId())
        {
            case R.id.button11:

               /* arrayList = new ArrayList<>();
                arrayList2 = new ArrayList<>();
                arrayList3 = new ArrayList<>();

                arrayList.add("Computer Organization & Architecture");
                arrayList2.add("MCA-1002");
                arrayList3.add("4");

                arrayList.add("Discrete Mathematics");
                arrayList2.add("MCA-1004");
                arrayList3.add("4");

                arrayList.add("Computer Programming");
                arrayList2.add("MCA-1101");
                arrayList3.add("4");

                arrayList.add("Fundamentals of InformationTechnology");
                arrayList2.add("MCA-1103");
                arrayList3.add("3");

                arrayList.add("Managerial and Organizational Behaviour");
                arrayList2.add("MBA-1008");
                arrayList3.add("3");

                arrayList.add("Environmental Science");
                arrayList2.add("AHS-1002");
                arrayList3.add("2");*/

                intent.putExtra("semester","sem1");
                startActivity(intent);
                break;

            case R.id.button12:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Theory of Automata & Formal Language");
                arrayList2.add("MCA-2001");
                arrayList3.add("4");

                arrayList.add("Computer Graphics & MultiMedia");
                arrayList2.add("MCA-2002");
                arrayList3.add("4");

                arrayList.add("Introduction to Microprocessors");
                arrayList2.add("MCA-2003");
                arrayList3.add("4");

                arrayList.add("Optimization Technique");
                arrayList2.add("MCA-2004");
                arrayList3.add("4");

                arrayList.add("Accounting & Financial Management");
                arrayList2.add("MBA-2008");
                arrayList3.add("3");*/

                intent.putExtra("semester","sem2");
                startActivity(intent);
                break;


            case R.id.button21:

               /* arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Object Oriented Programming");
                arrayList2.add("MCA-3101");
                arrayList3.add("3");

                arrayList.add("Data Structures");
                arrayList2.add("MCA-3002");
                arrayList3.add("4");

                arrayList.add("Database Management System");
                arrayList2.add("MCA-3003");
                arrayList3.add("4");

                arrayList.add("Software Engineering");
                arrayList2.add("MCA-3004");
                arrayList3.add("3");

                arrayList.add("Operating System");
                arrayList2.add("MCA-3005");
                arrayList3.add("3");

                arrayList.add("Ethics & Values");
                arrayList2.add("AHE-3001");
                arrayList3.add("2");*/

                intent.putExtra("semester","sem3");
                startActivity(intent);
                break;


            case R.id.button22:

               /* arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Unix & Shell Programming");
                arrayList2.add("MCA-4001");
                arrayList3.add("3");

                arrayList.add("Design & Analysis of Algorithm");
                arrayList2.add("MCA-4002");
                arrayList3.add("4");

                arrayList.add("Computer Networks");
                arrayList2.add("MCA-4003");
                arrayList3.add("4");

                arrayList.add("Python Programming");
                arrayList2.add("MCA-4005");
                arrayList3.add("3");*/

                intent.putExtra("semester","sem4");
                startActivity(intent);
                break;

            case R.id.button31:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Web Technology");
                arrayList2.add("MCA-5001");
                arrayList3.add("3");

                arrayList.add("Distributed Systems");
                arrayList2.add("MCA-5002");
                arrayList3.add("4");

                arrayList.add(".Net framework using C#");
                arrayList2.add("MCA-5003");
                arrayList3.add("3");

                arrayList.add("Technical Writing");
                arrayList2.add("AHE-5001");
                arrayList3.add("2");*/

                intent.putExtra("semester","sem5");
                startActivity(intent);
                break;

            case R.id.button32:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Industrial Training");
                arrayList2.add("MCA-6081");
                arrayList3.add("26");*/

                intent.putExtra("semester","sem6");
                startActivity(intent);
                break;

            case R.id.button41:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Information Retrieval Systems");
                arrayList2.add("MCA-4021");
                arrayList3.add("3");

                arrayList.add("Soft Computing");
                arrayList2.add("MCA-4022");
                arrayList3.add("3");

                arrayList.add("Digital Image Processing");
                arrayList2.add("MCA-4023");
                arrayList3.add("3");

                arrayList.add("Management Information System");
                arrayList2.add("MCA-4024");
                arrayList3.add("3");*/

                intent.putExtra("semester","elective1");
                startActivity(intent);
                break;

            case R.id.button42:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Data Compression");
                arrayList2.add("MCA-4041");
                arrayList3.add("3");

                arrayList.add("E Commerce");
                arrayList2.add("MCA-4042");
                arrayList3.add("3");

                arrayList.add("Service Oriented Architecture");
                arrayList2.add("MCA-4043");
                arrayList3.add("3");

                arrayList.add("Mobile Application Development");
                arrayList2.add("MCA-4044");
                arrayList3.add("3");*/

                intent.putExtra("semester","elective2");
                startActivity(intent);
                break;

            case R.id.button51:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Data Mining & Warehousing");
                arrayList2.add("MCA-5021");
                arrayList3.add("3");

                arrayList.add("Cloud Computing");
                arrayList2.add("MCA-5022");
                arrayList3.add("3");

                arrayList.add("Mobile Computing");
                arrayList2.add("MCA-5023");
                arrayList3.add("3");

                arrayList.add("Agile Software Development");
                arrayList2.add("MCA-5024");
                arrayList3.add("3");*/

                intent.putExtra("semester","elective3");
                startActivity(intent);
                break;

            case R.id.button52:

                /*arrayList=new ArrayList<>();
                arrayList2=new ArrayList<>();
                arrayList3=new ArrayList<>();

                arrayList.add("Cryptography & Network Security");
                arrayList2.add("MCA-5041");
                arrayList3.add("3");

                arrayList.add("Software Project Management");
                arrayList2.add("MCA-5042");
                arrayList3.add("3");

                arrayList.add("Artificial Intelligence");
                arrayList2.add("MCA-5043");
                arrayList3.add("3");

                arrayList.add("Business Intelligence");
                arrayList2.add("MCA-5044");
                arrayList3.add("3");*/

                intent.putExtra("semester","elective4");
                startActivity(intent);
                break;

            default:
                Toast.makeText(this, "Something goes wrong\nPlease restart App", Toast.LENGTH_LONG).show();
                break;

        }
    }
}


