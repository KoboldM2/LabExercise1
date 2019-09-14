package com.lukban.a14septemberactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void goToHongdae(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Hongdae,_Seoul"));
        startActivity(i);
    }

    public void goToLoversLane(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/Lovers.Lane.UST/"));
        startActivity(i);
    }

    public void goToLibrary(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://library.ust.edu.ph/"));
        startActivity(i);
    }

    public void goToMyeongdong(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Myeong-dong"));
        startActivity(i);
    }

    public void goBack() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
