package com.example.custom_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milk,suger,water;
    private TextView resultText;
    private Button showutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        milk = findViewById(R.id.check1);
        suger = findViewById(R.id.check2);
        water = findViewById(R.id.check3);

        showutton = findViewById(R.id.checkBtn);

        resultText = findViewById(R.id.checkedText) ;

        showutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(milk.isChecked()){
                    String value = milk.getText().toString();
                    stringBuilder.append(value + "is ordered");
                }if(suger.isChecked()){
                    String value = suger.getText().toString();
                    stringBuilder.append(value + "is ordered");
                }if(water.isChecked()){
                    String value = water.getText().toString();
                    stringBuilder.append(value + "is ordered");
                }

                resultText.setText(stringBuilder);
            }
        });



    }
}