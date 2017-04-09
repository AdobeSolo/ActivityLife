package com.example.forone.activitylifedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("life", "MainActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("life", "MainActivity onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.v("life", "MainActivity onPostResume");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("life", "MainActivity onResume");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("life", "MainActivity onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("life", "MainActivity onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("life", "MainActivity onPause");
    }

    public void startOtherActivity(View view) {
        Intent intent = new Intent(this, OtherActivity.class);
        startActivity(intent);
    }
}
