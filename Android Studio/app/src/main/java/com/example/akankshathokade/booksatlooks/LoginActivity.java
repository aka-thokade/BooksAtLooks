package com.example.akankshathokade.booksatlooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.widget.Toast.*;
import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity {

    //widgets
    private EditText mEmail, mPassword;
    private TextView mRegisterTextView;
    private ProgressBar mProgressBar;
    private RelativeLayout mLoginButton;

    //Firebase Authentication
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        mRegisterTextView = findViewById(R.id.register_tv);
        mProgressBar = findViewById(R.id.loading);
        mLoginButton = findViewById(R.id.login);
        mAuth = FirebaseAuth.getInstance();

        //add OnClickListerner to Login Button
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email, password;

                email = mEmail.getText().toString().trim();
                password = mPassword.getText().toString().trim();

                if (!email.equals("") && !password.equals("")){
                    mProgressBar.setVisibility(View.VISIBLE);
                    mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            //Hiding the progress bar
                            mProgressBar.setVisibility(View.GONE);
                            if(task.isSuccessful()){
                                //If the login is successful, then this block will run
                                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                                intent.putExtra("email", email);
                                startActivity(intent);
                                finish();
                            }
                            else{
                                makeText(LoginActivity.this, "Login Not Successful.", LENGTH_SHORT).show();
                            }

                        }
                    });
                }

            }
        });

        //add OnClickListner to register TextView
        mRegisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();

        if(currentUser != null) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("email", currentUser.getEmail());
            startActivity(intent);
            finish();
        }
        else {
            makeText(this, "User Not Logged In!", LENGTH_SHORT).show();
        }
    }

}
