package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText edittext1, edittext2;
    private Button buttonMod, buttonPer, buttonSqr, buttonExp, buttonNav1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        modListenerOnButton();
        perListenerOnButton();
        sqrListenerOnButton();
        expListenerOnButton();
        nav1ListenerOnButton();
    }

    public void modListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonMod = (Button) findViewById(R.id.button);

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a % b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void perListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonPer = (Button) findViewById(R.id.button2);

        buttonPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                float a=Float.parseFloat(value1);
                //int b=Integer.parseInt(value2);
                float b = Float.parseFloat(value2);
                float perc=a * (b/100);
                Toast.makeText(getApplicationContext(),String.valueOf(perc), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void sqrListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonSqr = (Button) findViewById(R.id.button3);

        buttonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                double a=Double.parseDouble(value1);
                //int b=Integer.parseInt(value2);
                //float b = Float.parseFloat(value2);
                double sqrt= Math.sqrt(a);
                Toast.makeText(getApplicationContext(),String.valueOf(sqrt), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void expListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonExp = (Button) findViewById(R.id.button4);

        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a= Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                //float b = Float.parseFloat(value2);
                double exp= Math.pow(a,b);
                Toast.makeText(getApplicationContext(),String.valueOf(exp), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void nav1ListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.editText1);
        edittext2 = (EditText) findViewById(R.id.editText2);
        buttonNav1 = (Button) findViewById(R.id.button5);

        buttonNav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
    }
}