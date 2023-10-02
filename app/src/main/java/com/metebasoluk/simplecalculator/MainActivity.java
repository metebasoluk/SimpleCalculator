package com.metebasoluk.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        textView=findViewById(R.id.textView);

    }
    public void sum(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){

            textView.setText("Enter Number!");
        }else { int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int res=num1+num2;
            textView.setText("result: "+res);
        }

    }

    public void deduct(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){

            textView.setText("Enter Number!");
        }else { int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int res=num1-num2;
            textView.setText("result: "+res);
        }

    }
    public void multiply(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){

            textView.setText("Enter Number!");
        }else { int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int res=num1*num2;
            textView.setText("result: "+res);
        }

    }


    public void divide(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){

            textView.setText("Enter Number!");
        }else { int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int res=num1/num2;
            textView.setText("result: "+res);
        }

    }







}