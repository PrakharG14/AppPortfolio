package com.example.android.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Context;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handle on-click event on Popular Movies button
     * @param view
     */
    public void onClickPopularMoviesButton(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Popular Movies";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handle on-click event on Stock Hawk button
     * @param view
     */
    public void onClickStockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Stock Hawk";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handle on-click event on Build It Bigger button
     * @param view
     */
    public void onClicksBuildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handle on-click event on Your App Material button
     * @param view
     */
    public void onClickMakeYourAppMaterial(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Make you App Material";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handle on-click event on Go Ubiquitous button
     * @param view
     */
    public void onClickGoUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Go Ubiquitous";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handle on-click event on Capstone Project Button
     * @param view
     */
    public void onClickCapstoneApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone Project";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
