package com.example.farata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginBtn;
    private EditText userName;
    private EditText Pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn=findViewById(R.id.login);
        userName=findViewById(R.id.username);
        Pass=findViewById(R.id.password);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("sahithi"))
                {
                    if(Pass.getText().toString().equals("pushpa@123"))
                    {



                        Toast.makeText(getApplicationContext(),"login successful",Toast.LENGTH_LONG).show();

                        Intent intent=new Intent(getApplicationContext(),Home.class);
                        startActivity(intent);

                    }

                    else
                    {
                        Pass.setError("invalid password");
                    }
                }
                else
                {
                    userName.setError("enter valid username");
                }
            }
        });
    }
}