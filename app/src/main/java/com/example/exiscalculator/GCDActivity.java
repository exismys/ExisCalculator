package com.example.exiscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GCDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcdactivity);
    }

    public void onGet(View view) {
        int[] numbers;
        String numberString = String.valueOf(((EditText) findViewById(R.id.editGCD)).getText());
        TextView gcdView = (TextView) findViewById(R.id.viewGCD);
        if (numberString == "") {
            gcdView.setText(getResources().getString(R.string.invalid_input));
            return;
        }
        try {
            String[] stringArray = numberString.split("\\s+");
            numbers = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                numbers[i] = Integer.parseInt(stringArray[i]);
            }
        } catch (NumberFormatException nfe) {
            gcdView.setText(getResources().getString(R.string.invalid_input));
            return;
        } catch (Exception e) {
            gcdView.setText(getResources().getString(R.string.error_message) + "\n" + e);
            return;
        }
        gcdView.setText(getResources().getString(R.string.is_gcd) + NumberTheory.gcdMultiple(numbers));
    }
}