package com.example.fourwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    String str="";
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button=findViewById(R.id.bt2);
        button.setOnClickListener(this::onclick);
         t1=findViewById(R.id.edit1);
        Intent i1=getIntent();
        str= i1.getStringExtra("s");
        t1.setText(str);

    }

    private void onclick(View view) {
        switch (view.getId()){
            case R.id.bt2:
           finish();
                break;
        }
    }
}