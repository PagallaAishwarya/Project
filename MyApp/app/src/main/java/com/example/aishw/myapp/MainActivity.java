package com.example.aishw.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 public void  input(View v){
       // Toast  t = Toast.makeText(getApplicationContext(),"WELCOME TO REPO",Toast.LENGTH_LONG);
        Intent I = new Intent(v.getContext(),LoginActivity.class);
        startActivityForResult(I,0);
       // t.show();
 }


}
