package com.example.aishw.myapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button1;
private Button button2;
private TextInputLayout text1;
private TextInputLayout text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



 @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
 public void  input(View v){
       // Toast  t = Toast.makeText(getApplicationContext(),"WELCOME TO REPO",Toast.LENGTH_LONG);
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
       // t.show();
 }


}
