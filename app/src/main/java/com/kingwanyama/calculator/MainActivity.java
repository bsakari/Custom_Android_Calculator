package com.kingwanyama.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_add,btn_subtract,btn_divide,btn_multiply;
    private EditText firstNumber,secondNumber;
    private TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add = (Button) findViewById(R.id.btn1);
        btn_subtract = (Button) findViewById(R.id.btn2);
        btn_divide = (Button) findViewById(R.id.btn3);
        btn_multiply = (Button) findViewById(R.id.btn4);
        firstNumber = (EditText) findViewById(R.id.number1);
        secondNumber = (EditText) findViewById(R.id.number2);
        result = (TextView) findViewById(R.id.tv1);
        btn_add.setOnClickListener(this);
        btn_subtract.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);

    }


    @Override
    public void onClick(View view){
     try {
         String num1 = firstNumber.getText().toString();
         String num2 = secondNumber.getText().toString();
         if (num1.isEmpty()||num2.isEmpty()){
             Toast.makeText(this, "Fill In All Inputs", Toast.LENGTH_SHORT).show();
         }else {

             switch (view.getId()){
                 case R.id.btn1:
                     double addition = Double.parseDouble(num1)+Double.parseDouble(num2);
                     result.setText(String.valueOf(addition));
                     break;
                 case R.id.btn2:
                     double subtraction = Double.parseDouble(num1)-Double.parseDouble(num2);
                     result.setText(String.valueOf(subtraction));
                     break;
                 case R.id.btn3:
                     double division = Double.parseDouble(num1)/Double.parseDouble(num2);
                     result.setText(String.valueOf(division));
                     break;
                 case R.id.btn4:
                     double multiplication = Double.parseDouble(num1)*Double.parseDouble(num2);
                     result.setText(String.valueOf(multiplication));
                     break;
             }

         }

     }catch (Exception e){
         Toast.makeText(this, "System Malfunction", Toast.LENGTH_SHORT).show();
     }
    }

    public void Clear(View view) {
        firstNumber.setText("");
        secondNumber.setText("");
    }
}
