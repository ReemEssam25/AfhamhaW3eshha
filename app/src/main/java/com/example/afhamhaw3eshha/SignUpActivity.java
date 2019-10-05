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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUpActivity extends AppCompatActivity {

    TextInputEditText nameEditText , mailEditText, passEditText;
    Button signUpButton;

    FirebaseAuth auth;
    DatabaseReference reference;
    ProgressDialog prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        prog = new ProgressDialog(this);
        prog.setTitle("SignUp");
        prog.setMessage("Wait....");
        prog.setCanceledOnTouchOutside(false);

        nameEditText = findViewById(R.id.name_EditText);
        mailEditText = findViewById(R.id.mail_EditText);
        passEditText = findViewById(R.id.pass_EditText);
        signUpButton = findViewById(R.id.signUp_Button);

        auth = FirebaseAuth.getInstance();
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prog.show();
                String userName = nameEditText.getText().toString();
                String email = mailEditText.getText().toString();
                String pass = passEditText.getText().toString();

                if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)){
                    Toast.makeText(SignUpActivity.this, "All Fields is required", Toast.LENGTH_SHORT).show();
                    prog.dismiss();
                }
                else {
                    register(userName, email, pass);
                    prog.dismiss();
                }
            }
        });

    }

    private void register (final String userName , String email , String pass) {

        auth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            FirebaseUser firebaseUser = auth.getCurrentUser();
                            String userId = firebaseUser.getUid();

                            reference = FirebaseDatabase.getInstance().getReference("Users").child(userId);

                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("id", userId);
                            hashMap.put("username", userName);
                            hashMap.put("imageURL", "default");

                            reference.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);
                                        finish();
                                    }
                                }
                            });
                        } else {
                            Toast.makeText(SignUpActivity.this, "You can't register with this email or password", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }
}