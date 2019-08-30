package com.example.glauniversityelibrary;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Timer;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonRegister;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private TextView textViewSignin;
    private ProgressDialog progressDialog;
    private Timer timer;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth=FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser()!= null) {
            //profileactivity
            finish();
            Intent i=new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(i);
        }


        progressDialog=new ProgressDialog(this);

        buttonRegister = (Button)findViewById(R.id.buttonRegister);

        editTextEmail = (EditText)findViewById(R.id.editTextEmail);

        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        editTextPassword.setTransformationMethod(new PasswordTransformationMethod());


        editTextConfirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);
        editTextConfirmPassword.setTransformationMethod(new PasswordTransformationMethod());


        textViewSignin = (TextView)findViewById(R.id.textViewSignin);

        buttonRegister.setOnClickListener(this);
        textViewSignin.setOnClickListener(this);
    }


    private void registerUser() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String confirmpassword = editTextConfirmPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            //email is empty
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            //stopping the function execution further
            return;
        }
        if (TextUtils.isEmpty(password)) {
            //password is empty
            Toast.makeText(this, "Please enter the password", Toast.LENGTH_SHORT).show();
            //stopping the function execution further
            return;
        }
        if (TextUtils.isEmpty(confirmpassword)) {
            //password is empty
            Toast.makeText(this, "Please confirm the password", Toast.LENGTH_SHORT).show();
            //stopping the function execution further
            return;
        }

        if(password.equals(confirmpassword))
        {
            Toast.makeText(this, "Your password is confirmed", Toast.LENGTH_SHORT).show();

            //if validations are ok
            //we will first show a progressbar
            progressDialog.setMessage("Registering  User....");
            progressDialog.show();

            firebaseAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                finish();
                                Toast.makeText(LoginActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();

                                Intent i=new Intent(getApplicationContext(),ProfileActivity.class);
                                startActivity(i);
                            }
                            else {
                                Toast.makeText(LoginActivity.this, "Could not register..please try again", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }
        else
        {
            Toast.makeText(this, "You have entered a wrong password", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onClick(View v) {
        if(v==buttonRegister)
        {
            registerUser();
        }
        if(v==textViewSignin)
        {//open loginSec activity
            startActivity(new Intent(LoginActivity.this,LoginSecActivity.class));
        }
    }
}
