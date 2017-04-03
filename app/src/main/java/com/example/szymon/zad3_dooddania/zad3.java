package com.example.szymon.zad3_dooddania;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class zad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zad3);

        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("Zmienił klawisz 1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("Zmienił klawisz 2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView=(TextView)findViewById(R.id.textView);
                textView.setText("Zmienił klawisz 3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText1=(EditText)findViewById((R.id.editText1));
                EditText editText2=(EditText)findViewById((R.id.editText2));
                TextView textView=(TextView)findViewById(R.id.textView2);
                String newtext=editText1.getText().toString()+" "+editText2.getText().toString();
                textView.setText(newtext);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(zad3.this,Obrazek.class);
                zad3.this.startActivity(intent);
            }
        });



    }
}
