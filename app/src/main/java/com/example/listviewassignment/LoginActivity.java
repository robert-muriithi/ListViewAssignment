package com.example.listviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
Button loginButton;
EditText emailEditText;
EditText passwordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.loginButton);
        signIn();
    }

    private void signIn() {
        String password = "123456";
        String email = "user@gmail.com";
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(emailEditText.getText().toString())){
                    emailEditText.setError("Enter Email");

                } else
                 if (TextUtils.isEmpty(passwordEditText.getText().toString())){
                    passwordEditText.setError("Enter password");
                }else
                    if (!emailEditText.getText().toString().equals(email)){
                    Toast.makeText(LoginActivity.this, "Wrong Credentials. Try again", Toast.LENGTH_SHORT).show();
                        emailEditText.setText(" ");
                        passwordEditText.setText(" ");
                }else
                    if (!passwordEditText.getText().toString().equals(password)){
                    Toast.makeText(LoginActivity.this, "Wrong Credentials. Try again", Toast.LENGTH_SHORT).show();

                }
                else {
                    Intent intent = new Intent(getApplicationContext(),ListViewActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

}