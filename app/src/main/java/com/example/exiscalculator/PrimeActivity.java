package com.example.exiscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);
    }

    public void onGet(View view) {
        int number;
        String numberString = String.valueOf(((EditText) findViewById(R.id.editPrime)).getText());
        TextView primeView = (TextView) findViewById(R.id.viewFactors);
        if (numberString == "") {
            primeView.setText(getResources().getString(R.string.invalid_input));
            return;
        }
        try {
            number = Integer.parseInt(numberString);
        } catch (NumberFormatException nfe) {
            primeView.setText(getResources().getString(R.string.invalid_input));
            return;
        } catch (Exception e) {
            primeView.setText(getResources().getString(R.string.error_message) + "\n" + e);
            return;
        }
        Prime prime = new Prime(number);
        if (prime.isPrime()) {
            primeView.setText(getResources().getString(R.string.if_prime));
            return;
        }
        List<Integer> primeFactors = prime.primeFactors();
        StringBuilder sb = new StringBuilder(getResources().getString(R.string.prime_header) + ": ");
        for (int i = 0; i < primeFactors.size(); i++) {
            sb.append(String.valueOf(primeFactors.get(i)));
            sb.append(" ");
        }
        primeView.setText(sb);
    }
}