package com.example.fourwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
            String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.bt1);
        button.setOnClickListener(this::onclick);
        EditText t1=findViewById(R.id.edit);
        t1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                    str=t1.getText().toString();
            }
        });

    }

    private void onclick(View view) {
        switch (view.getId()){
            case R.id.bt1:
                Intent i1=new Intent(MainActivity.this,MainActivity2.class);
                i1.putExtra("s",str);
                startActivity(i1);
                Log.v("TAG","拨出");
                break;
        }
    }
}