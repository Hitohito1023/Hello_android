package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "こんにちは", Toast.LENGTH_SHORT).show();
//        Log.d(TAG, "ログのテスト1");
//        Log.d(TAG, "ログのテスト2");
          Log.d(TAG, "onCreate()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop()");
    }
}