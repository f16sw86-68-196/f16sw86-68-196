package com.example.arsalan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        Intent in = getIntent();
        String s1 = in.getStringExtra("email");
        String s2 = in.getStringExtra("password");
        e1.setText(s1);
        e2.setText(s2);

    }


    public void lgClick(View s) {
        Intent in = new Intent(SecondActivity.this, ThirdActivity.class);
        in.putExtra("email", e1.getText().toString());
        in.putExtra("password", e2.getText().toString());
        in.putExtra("name",e3.getText().toString());
        in.putExtra("d.o.b",e4.getText().toString());
        startActivity(in);
    }
}