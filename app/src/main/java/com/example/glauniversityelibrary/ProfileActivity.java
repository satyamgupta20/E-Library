package com.example.glauniversityelibrary;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Button button1,button2,button3,button4,buttonLogout;

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setUpToolbar();

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(ProfileActivity.this, LoginSecActivity.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();

        //textViewUserEmail.setText("welcome"+user.getEmail());
        Toast.makeText(this, "You are signed in with " + user.getEmail(), Toast.LENGTH_SHORT).show();
        button1 = (Button) findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2) ;
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4) ;
        buttonLogout = (Button) findViewById(R.id.buttonLogout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Welcome to Graduate Programs that GLA University offers you...", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ProfileActivity.this, GraduateActivity.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Welcome to Post Graduate Programs that GLA University offers you...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ProfileActivity.this,PostGraduateActivity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Welcome to Doctorate Programs that GLA University offers you...", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ProfileActivity.this, DoctorateActivity.class);
                startActivity(i);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Welcome to Diploma Programs that GLA University offers you...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ProfileActivity.this,DiplomaActivity.class));
            }
        });

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                Toast.makeText(ProfileActivity.this, "You have logged out successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ProfileActivity.this, LoginSecActivity.class));
            }
        });
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setUpToolbar()
    {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }

}
