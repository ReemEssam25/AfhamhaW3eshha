package com.example.afhamhaw3eshha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rengwuxian.materialedittext.MaterialEditText;

public class LogInActivity extends AppCompatActivity {
    TextInputEditText passEditText , mailEditText;
    Button signUpButton , loginButton;

    FirebaseAuth auth;
    ProgressDialog prog;
    FirebaseUser firebaseUser;

    protected void onStart() {
        super.onStart();

        //Check if user is null
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if (firebaseUser != null){
            Intent intent = new Intent(LogInActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        passEditText = findViewById(R.id.pass_EditText);
        mailEditText = findViewById(R.id.mail_login_EditText);
        signUpButton = findViewById(R.id.signUp_Button);
        loginButton = findViewById(R.id.login_Button);

        prog = new ProgressDialog(this);
        prog.setTitle("Login");
        prog.setMessage("Wait....");
        prog.setCanceledOnTouchOutside(false);



        auth = FirebaseAuth.getInstance();



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                prog.show();
                String email = mailEditText.getText().toString();
                String pass = passEditText.getText().toString();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {
                    Toast.makeText(LogInActivity.this, "All Fields are required", Toast.LENGTH_SHORT).show();
                }
                else {
                    auth.signInWithEmailAndPassword(email,pass)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Intent intent = new Intent(LogInActivity.this,MainActivity.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);
                                        finish();
                                        prog.dismiss();
                                    }
                                    else {
                                        Toast.makeText(LogInActivity.this, "Authentication failed!", Toast.LENGTH_SHORT).show();
                                        prog.dismiss();
                                    }
                                }
                            });
                }
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}
