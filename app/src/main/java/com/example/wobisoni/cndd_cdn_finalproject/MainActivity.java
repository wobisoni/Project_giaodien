package com.example.wobisoni.cndd_cdn_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btLogin;
    Button btLoginGv;
    Button btSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Link();
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentIndex.class);
                startActivity(intent);
            }
        });
        btLoginGv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeacherIndex.class);
                startActivity(intent);
            }
        });
        btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }

    void Link(){
        btLogin = (Button)findViewById(R.id.btnLogin);
        btLoginGv = (Button)findViewById(R.id.btnLoginGv);
        btSignin = (Button)findViewById(R.id.btnSingin);
    }
}
