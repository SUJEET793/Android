package com.task.autocompletiontext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView,state;
    TextView textView;
    Spinner genderSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the id of all the reqoured component

        genderSpinner=findViewById(R.id.genderSpinner);
        state=findViewById(R.id.state);
        autoCompleteTextView=findViewById(R.id.actv);

  //these two are used to phase the Array.xml file to the java file

        String [] values=getResources().getStringArray(R.array.countries);
        String [] stateName=getResources().getStringArray(R.array.stateName);

        // this addapter class helps in display the componet of contry

        ArrayAdapter <String> arrayAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,values);
        //  this addapter class helps in display the componet of state
        ArrayAdapter<String> arrayAdapter_state=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,stateName);

        // set the componet in the screen
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);

        // set the componet in the screen
         state.setAdapter(arrayAdapter_state);
         state.setThreshold(1);
    // make the arraylist of the gender
        // here we can use array also or we can pass the value as above from the xml file

        ArrayList <String> gender =new ArrayList<>();
        gender.add("Select:");
        gender.add("male");
        gender.add("female");
        gender.add("Transgender");

        ArrayAdapter <String> gender_Adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_spinner_dropdown_item,gender);
        genderSpinner.setAdapter(gender_Adapter);
    }
}
