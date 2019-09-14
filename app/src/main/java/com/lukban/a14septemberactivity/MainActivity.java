package com.lukban.a14septemberactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onResume() {
        super.onResume();
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void viewPlaces (View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

    public void listLog(View v) {
        super.onStart();
        Log.d("Sept14-Activity","onStart() has executed");
        super.onResume();
        Log.d("Sept14-Activity","onResume() has executed");
        super.onPause();
        Log.d("Sept14-Activity","onPause() has executed");
        super.onStop();
        Log.d("Sept14-Activity","onStop() has executed");
        super.onRestart();
        Log.d("Sept14-Activity","onRestart() has executed");
        super.onDestroy();
        Log.d("Sept14-Activity","onDestroy() has executed");
    }
}
