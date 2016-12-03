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
     * Handle on-click event for button
     */
    public void onButtonClick(View view) {
        Context context = getApplicationContext();
        CharSequence text;
        switch (view.getId()) {
            case R.id.button1:
                text = getString(R.string.button1_desc);
                break;
            case R.id.button2:
                text = getString(R.string.button2_desc);
                break;
            case R.id.button3:
                text = getString(R.string.button3_desc);
                break;
            case R.id.button4:
                text = getString(R.string.button4_desc);
                break;
            case R.id.button5:
                text = getString(R.string.button5_desc);
                break;
            case R.id.button6:
                text = getString(R.string.button6_desc);
                break;
            default:
                return;
        }
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
