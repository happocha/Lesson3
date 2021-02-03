package ru.geekbrains.lesson3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private final static String TAG = "[LifeCycleActivity]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeToast("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeToast("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToast("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeToast("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("onDestroy()");
    }

    private void makeToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.d(TAG, message);
    }

    public void button1_onClick(View view) {
    }
}