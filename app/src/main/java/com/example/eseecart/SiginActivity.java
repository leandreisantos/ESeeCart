package com.example.eseecart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SiginActivity extends AppCompatActivity {


    TextView register;
    CardView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin);

        register = findViewById(R.id.tv_signup);
        signin = findViewById(R.id.cv);

        register.setOnClickListener(view -> {
            Intent intent = new Intent(SiginActivity.this,SignUpActivity.class);
            startActivity(intent);
        });

        signin.setOnClickListener(view -> {
            Intent intent = new Intent(SiginActivity.this,MainActivity.class);
            startActivity(intent);
        });

    }
}