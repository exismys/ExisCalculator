package com.example.exiscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNext(View view) {
        Intent intent;
        String[] optionsArray = getResources().getStringArray(R.array.options);
        String selected = String.valueOf(((Spinner) findViewById(R.id.topicOptions)).getSelectedItem());

       if (selected.equals(optionsArray[0])) {
            intent = new Intent(this, GCDActivity.class);
        } else {
            intent = new Intent(this, PrimeActivity.class);
        }
        startActivity(intent);
    }
}