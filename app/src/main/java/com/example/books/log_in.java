package com.example.books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class log_in extends AppCompatActivity {

    private EditText editTextPhone, editTextCode;
    private TextView about_us;
    Button button_getcode, button_signin;
    private boolean mVerificationInProgress = false;
    FirebaseAuth mAuth;

    String codeSent;

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(log_in.this, home_page.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }

        // [START_EXCLUDE]
        if (mVerificationInProgress) {
            sendVerificationCode();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        mAuth = FirebaseAuth.getInstance();



        editTextCode = findViewById(R.id.editTextCode);
        editTextPhone = findViewById(R.id.editTextPhone);



       button_getcode = (Button) findViewById(R.id.buttonGetVerificationCode);
       button_signin = (Button) findViewById(R.id.buttonSignIn);
        about_us = (TextView) findViewById(R.id.about_us);

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AboutUs.class));
            }
        });


        button_signin.setEnabled(false);
        button_signin.setAlpha(0.8f);
        button_getcode.setAlpha(0.8f);
        button_getcode.setEnabled(false);


        editTextPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_getcode.setEnabled(true);
                button_getcode.setAlpha(1f);
            }
        });

       button_getcode.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               sendVerificationCode();
               button_signin.setEnabled(true);
               button_signin.setAlpha(1);
               button_getcode.setEnabled(false);
               button_getcode.setAlpha(0.8f);
           }
       });


        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifySignInCode();
            }
        });
    }

    private void verifySignInCode(){
        String code = editTextCode.getText().toString();

        if (code.isEmpty()){
            editTextCode.setError("Phone number is required");
            editTextCode.requestFocus();
            return;
        }

        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(codeSent, code);
        signInWithPhoneAuthCredential(credential);
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {

        if(credential == null){
            Toast.makeText(getApplicationContext(),"OTP is not send",Toast.LENGTH_LONG).show();
        }

        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            //here you can open new activity
                            Toast.makeText(getApplicationContext(),
                                    "Login Successfully", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(),home_page.class));
                            finish();

                        } else {
                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                Toast.makeText(getApplicationContext(),
                                        "Incorrect Verification Code ", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
    }

    private void sendVerificationCode(){

        String phone = editTextPhone.getText().toString();

        if(phone.isEmpty()){
            editTextPhone.setError("Phone number is required");
            editTextPhone.requestFocus();
            return;
        }

        if(phone.length() < 10 ){
            editTextPhone.setError("Please enter a valid phone");
            editTextPhone.requestFocus();
            return;
        }


        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phone,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                mCallbacks);        // OnVerificationStateChangedCallbacks
        mVerificationInProgress = true;

    }



    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
             mVerificationInProgress = false;
        }

        @Override
        public void onVerificationFailed(FirebaseException e) {
            mVerificationInProgress = false;
        }

        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            codeSent = s;
        }
    };


}