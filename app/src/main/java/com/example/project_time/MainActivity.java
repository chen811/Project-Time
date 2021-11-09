package com.example.project_time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void runLogin(View view) {
        EditText editTextNumber =(EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText editTextNumber3 =(EditText) findViewById(R.id.editTextNumber3);
        EditText editTextNumber4 =(EditText) findViewById(R.id.editTextNumber4);
        EditText editTextNumber5 =(EditText) findViewById(R.id.editTextNumber5);
        EditText editTextNumber6 =(EditText) findViewById(R.id.editTextNumber6);
        int editTextNumbe = Integer.parseInt(editTextNumber.getText().toString());
        int editTextNumbe2 = Integer.parseInt(editTextNumber2.getText().toString());
        int editTextNumbe3 = Integer.parseInt(editTextNumber3.getText().toString());
        int editTextNumbe4 = Integer.parseInt(editTextNumber4.getText().toString());
        int editTextNumbe5 = Integer.parseInt(editTextNumber5.getText().toString());
        int editTextNumbe6 = Integer.parseInt(editTextNumber6.getText().toString());
        TextView result = (TextView)findViewById(R.id.textView2);

        result.setText(editTextNumbe+"/"+editTextNumbe2+"/"+editTextNumbe3+"  "+editTextNumbe4+":"+editTextNumbe5+":"+editTextNumbe6);



    }
}