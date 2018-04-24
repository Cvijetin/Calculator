package com.example.cvijetin.uniada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView rezultat;
    EditText broj1, broj2;
    Button button1, button2, button3, button4;

    float rez;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rezultat = (TextView) findViewById(R.id.Rezultat);


        broj1 = (EditText) findViewById(R.id.PrviBroj);
        broj2 = (EditText) findViewById(R.id.DrugiBroj);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 =  (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Integer.parseInt(broj1.getText().toString());
                    num2 = Integer.parseInt(broj2.getText().toString());
                    rez = num1 + num2;
                    rezultat.setText(String.valueOf(rez));
                }catch (Exception ex){

                    Toast toast1 = Toast.makeText(getApplicationContext(), "Unesite broj",Toast.LENGTH_SHORT);

                    toast1.show();
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Integer.parseInt(broj1.getText().toString());
                    num2 = Integer.parseInt(broj2.getText().toString());
                    rez = num1 - num2;
                    rezultat.setText(String.valueOf(rez));
                }catch (Exception ex){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Unesite broj",Toast.LENGTH_SHORT);

                    toast1.show();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Integer.parseInt(broj1.getText().toString());
                    num2 = Integer.parseInt(broj2.getText().toString());
                    rez = num1 * num2;
                    rezultat.setText(String.valueOf(rez));
                }catch (Exception ex){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Unesite broj",Toast.LENGTH_SHORT);

                    toast1.show();
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = Integer.parseInt(broj1.getText().toString());
                    num2 = Integer.parseInt(broj2.getText().toString());
                    rez = num1 / num2;
                    rezultat.setText(String.valueOf(rez));
                }catch (Exception ex){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Unesite broj",Toast.LENGTH_SHORT);

                    toast1.show();
                }

            }
        });
    }
}
