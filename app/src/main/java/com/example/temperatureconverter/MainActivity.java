package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt1;
        TextView txt2;
        Button btn1;

        edt1 = findViewById(R.id.edt1);
        txt2 = findViewById(R.id.txt2);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = Integer.parseInt(edt1.getText().toString());
                int celcius = ((x*9/5)+32);

                txt2.setText(String.valueOf(celcius));
            }
        });

    }
}