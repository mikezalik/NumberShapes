package com.mikezalik.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    class Number {
        int number;

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;

            while (triangularNumber < number) {
                x++;
                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void checkNumber (View view) {
        EditText editText = findViewById(R.id.editText);

        Number myNumber = new Number();
        myNumber.number = Integer.parseInt(editText.getText().toString());

        String message;

        if (myNumber.isSquare() && myNumber.isTriangular()) {
            message = editText.getText().toString() + " is square and triangular!";
        } else if (myNumber.isSquare()) {
            message = editText.getText().toString() + " is square";
        } else if (myNumber.isTriangular()) {
            message = editText.getText().toString() + " is triangular";
        } else {
            message = editText.getText().toString() + " is neither square nor triangular!";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
