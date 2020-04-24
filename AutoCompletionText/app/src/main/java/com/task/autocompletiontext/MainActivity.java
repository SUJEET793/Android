package com.task.autocompletiontext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] values=getResources().getStringArray(R.array.countries);
        ArrayAdapter <String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,values);
        autoCompleteTextView=findViewById(R.id.actv);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
    }
}
