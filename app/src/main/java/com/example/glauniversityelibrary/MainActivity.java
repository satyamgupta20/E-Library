package com.example.glauniversityelibrary;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonSignin,buttonSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSignin=(Button)findViewById(R.id.buttonSignin);
        buttonSignup=(Button)findViewById(R.id.buttonSignup);

        buttonSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LoginSecActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Welcome to Sign In Page....", Toast.LENGTH_SHORT).show();
            }
        });


        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Welcome to Sign Up Page....", Toast.LENGTH_SHORT).show();
            }
        });

        //Handler handler=new Handler();
        //handler.postDelayed(new Runnable() {
          //  @Override
           // public void run() {
             //   Toast.makeText(MainActivity.this, "This is second splash screen", Toast.LENGTH_SHORT).show();
              //  Intent i=new Intent(MainActivity.this,LoginActivity.class);
                //startActivity(i);
                //finish();
            //}
        //},2000);
    }
}
