package com.task.onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button clickButton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton =findViewById(R.id.click);
        exitButton=findViewById(R.id.exit);
        // this is used to enable the exit button
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitButton.setEnabled(true);
                clickButton.setEnabled(false);

            }
        });

        // this is code to close the activity
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();  // to distroy the activity

            }
        });
    }
}
