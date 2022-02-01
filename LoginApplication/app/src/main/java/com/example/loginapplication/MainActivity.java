package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnlogin;
    String correct_username = "19BCE7390";
    String correct_password = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.button);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, " Empty data is provided",Toast.LENGTH_LONG).show();
                }
                else if (username.getText().toString().equals(correct_username)){
                    if(password.getText().toString().equals(correct_password)){
                    Toast.makeText(MainActivity.this, "Successfully logged in",Toast.LENGTH_LONG).show();
                }
                    else{

                        Toast.makeText(MainActivity.this, "Invalid UserName/Password",Toast.LENGTH_LONG).show();
                    }

                }
                else{

                    Toast.makeText(MainActivity.this, "Invalid UserName/Password",Toast.LENGTH_LONG).show();
                }

            }





        });

        }
}