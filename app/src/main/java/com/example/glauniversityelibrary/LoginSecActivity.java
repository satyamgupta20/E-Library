package com.example.glauniversityelibrary;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import com.google.firebase.auth.ProviderQueryResult;

public class LoginSecActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignUp;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sec);

        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser()!= null) {
                //profileactivity
            finish();
            Intent i=new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(i);
        }

        editTextEmail=(EditText)findViewById(R.id.editTextEmail);

        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        editTextPassword.setTransformationMethod(new PasswordTransformationMethod());


        buttonSignIn=(Button)findViewById(R.id.buttonSignIn);
        textViewSignUp=(TextView)findViewById(R.id.textViewSignUp);

        progressDialog=new ProgressDialog(this);

        buttonSignIn.setOnClickListener(this);
        textViewSignUp.setOnClickListener(this);

    }
    private void userLogin(){
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

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


        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){

                            //if validations are ok
                            //we will first show a progressbar
                            progressDialog.setMessage("Logging In User....");
                            progressDialog.show();

                            //start the profiile activity
                            finish();
                            Intent i=new Intent(getApplicationContext(),ProfileActivity.class);
                            startActivity(i);
                        }
                        else
                        {
                            firebaseAuth.fetchProvidersForEmail(editTextEmail.getText().toString())
                                    .addOnCompleteListener(new OnCompleteListener<ProviderQueryResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<ProviderQueryResult> task) {

                                            boolean check = !task.getResult().getProviders().isEmpty();

                                            if(!check)
                                            {
                                                Toast.makeText(getApplicationContext(), "Email not found!!!!Create your account first.", Toast.LENGTH_SHORT).show();
                                            }
                                            else
                                            {
                                                Intent i=new Intent(getApplicationContext(),ProfileActivity.class);
                                                startActivity(i);
                                               // Toast.makeText(getApplicationContext(), "Email already present", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });

                        }
                    }
                });
    }



    @Override
    public void onClick(View v) {
        if(v == buttonSignIn)
        {
            userLogin();
        }
        if(v == textViewSignUp)
        {
            finish();
            Intent i=new Intent(LoginSecActivity.this,LoginActivity.class);
            startActivity(i);
        }
    }
}
