package com.example.arsalan.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button button;
    EditText e1, e2, e3, e4;
    TextView textView;
    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);
        textView = (TextView) findViewById(R.id.textView2);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton r1=(RadioButton) findViewById(R.id.radioButton);
                if (r1.isChecked()){
                    Toast.makeText(MainActivity.this, "male", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "female", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
        public void btClick(View s){
            Intent in = new Intent(MainActivity.this, SecondActivity.class);
            in.putExtra("name", e1.getText().toString());
            in.putExtra("email", e2.getText().toString());
            in.putExtra("password", e3.getText().toString());
            in.putExtra("d.o.b", e4.getText().toString());
            startActivity(in);
    }

}
