package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "myApp";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showInfo("onCreate");
        Log.e(TAG, "Критическая ошибка");
        Log.w(TAG, "Предупреждение");
        Log.i(TAG, "Информация");
        Log.d(TAG, "Отладка");
        Log.v(TAG, "Подробности");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        showInfo("onStart");
        Log.e(TAG, "Критическая ошибка");
        Log.w(TAG, "Предупреждение");
        Log.i(TAG, "Информация");
        Log.d(TAG, "Отладка");
        Log.v(TAG, "Подробности");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        showInfo("onStop");
        Log.e(TAG, "Критическая ошибка");
        Log.w(TAG, "Предупреждение");
        Log.i(TAG, "Информация");
        Log.d(TAG, "Отладка");
        Log.v(TAG, "Подробности");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        showInfo("onDestroy");
        Log.e(TAG, "Критическая ошибка");
        Log.w(TAG, "Предупреждение");
        Log.i(TAG, "Информация");
        Log.d(TAG, "Отладка");
        Log.v(TAG, "Подробности");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        showInfo("onPause");
        Log.e(TAG, "Критическая ошибка");
        Log.w(TAG, "Предупреждение");
        Log.i(TAG, "Информация");
        Log.d(TAG, "Отладка");
        Log.v(TAG, "Подробности");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        showInfo("onResume");
        Log.e(TAG, "Критическая ошибка");
        Log.w(TAG, "Предупреждение");
        Log.i(TAG, "Информация");
        Log.d(TAG, "Отладка");
        Log.v(TAG, "Подробности");
    }
    private void showInfo(String text)
    {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}