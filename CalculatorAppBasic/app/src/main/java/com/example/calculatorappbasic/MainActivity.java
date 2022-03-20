package com.example.calculatorappbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText  number1;
    private EditText number2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
    }


    public boolean checkValid() {

        String s1 = number1.getText().toString();

        String s2 = number2.getText().toString();

        if ((s1.equals(null) || s2.equals(null))
                || (s1.equals("") || s2.equals(""))) {

            String s = "Please enter a value";
            result.setText(s);
            return false;
        }
        return true;
    }


    public void mul(View view) {
        if (checkValid()) {
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int mul = n1 * n2;
            result.setText(String.valueOf(mul));
        }
    }

    public void div(View view) {
        if (checkValid()) {
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            if (n2 == 0) {
                result.setText("Error: Divide by 0");
            } else {
                int div = n1 / n2;
                result.setText(String.valueOf(div));
            }

        }
    }

    public void sum(View view) {
        if (checkValid()) {
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int sum = n1 + n2;
            result.setText(String.valueOf(sum));
        }
    }

    public void sub(View view) {
        if (checkValid()) {
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int sub = n1 - n2;
            result.setText(String.valueOf(sub));
        }
    }
}