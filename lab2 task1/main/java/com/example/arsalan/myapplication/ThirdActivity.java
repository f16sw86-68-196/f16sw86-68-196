package com.example.arsalan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        EditText e3=findViewById(R.id.e3);
        Intent in=getIntent();
        String s=in.getStringExtra("name");
        String s2=in.getStringExtra("email");
        String s3=in.getStringExtra("D.O.B");
        e1.setText(s);
        e2.setText(s2);
        e3.setText(s3);
    }
}
