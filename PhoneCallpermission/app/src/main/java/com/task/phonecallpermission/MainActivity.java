package com.task.phonecallpermission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    String number;
    private static final int request_code = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void makeCall(View view){
        //when this function is called when we press the  btn
        // it first check that is there permission to access
        // the phone call app
        number = editText.getText().toString();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){ // this is to check the version in which the app is running
            // if the app is running in greater version then only run time permission is possible

            if(checkPermission()){  //if the permission is granted then
                PhoneCall();
            }
            else{                      // if permission is not granted
                requestPermission();
            }
        }
        else {
            PhoneCall();
        }

    }
// intent call
    private void PhoneCall(){

        Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+number));
        startActivity(intent);
    }

    private boolean checkPermission(){
        int result = checkSelfPermission(Manifest.permission.CALL_PHONE);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission(){
        requestPermissions(new String[]{Manifest.permission.CALL_PHONE},request_code);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(grantResults[0] == PackageManager.PERMISSION_GRANTED && requestCode == request_code){
            PhoneCall();
        }
        else{
            Log.d("MainActivity","User Denied");
        }
    }
}
