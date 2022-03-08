package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private Button buttonAdd, buttonSub, buttonMult, buttonDiv, buttonNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        addListenerOnButton();
        subListenerOnButton();
        multListenerOnButton();
        divListenerOnButton();
        navListenerOnButton();
    }
    public void addListenerOnButton() {
        buttonAdd = (Button) findViewById(R.id.button);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = (int) Math.floor(Math.random() * 11);
                int value2 = (int) Math.floor(Math.random() * 11);
                String str1 = Integer.toString(value1);
                String str2 = Integer.toString(value2);
                String result = new String();
                String strArray[] = {str1, "+", str2};
                for(int i=0; i< strArray.length; i++) {
                    result = result + strArray[i]+ " ";
                }

                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void subListenerOnButton() {
        buttonSub = (Button) findViewById(R.id.button2);

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = (int) Math.floor(Math.random() * 11);
                int value2 = (int) Math.floor(Math.random() * 11);
                String str1 = Integer.toString(value1);
                String str2 = Integer.toString(value2);
                String result = new String();
                String strArray[] = {str1, "-", str2};
                for(int i=0; i< strArray.length; i++) {
                    result = result + strArray[i]+ " ";
                }

                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void multListenerOnButton() {
        buttonMult = (Button) findViewById(R.id.button3);

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = (int) Math.floor(Math.random() * 11);
                int value2 = (int) Math.floor(Math.random() * 11);
                String str1 = Integer.toString(value1);
                String str2 = Integer.toString(value2);
                String result = new String();
                String strArray[] = {str1, "*", str2};
                for(int i=0; i< strArray.length; i++) {
                    result = result + strArray[i]+ " ";
                }

                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void divListenerOnButton() {
        buttonDiv = (Button) findViewById(R.id.button4);

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = (int) Math.floor(Math.random() * 11);
                int value2 = (int) Math.floor(Math.random() * 11);
                String str1 = Integer.toString(value1);
                String str2 = Integer.toString(value2);
                String result = new String();
                String strArray[] = {str1, "/", str2};
                for(int i=0; i< strArray.length; i++) {
                    result = result + strArray[i]+ " ";
                }

                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void navListenerOnButton() {
        buttonNav = (Button) findViewById(R.id.button5);

        buttonNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity4.this, MainActivity.class));
            }
        });
    }
}