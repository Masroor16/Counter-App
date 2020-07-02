package com.gama.counter_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView counterText;
    Button resetButton,increaseButton;
    int counter = 0;
    int count ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter=count;

        counterText = findViewById(R.id.CounterText);
        resetButton = findViewById(R.id.ResetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Counter is : "+counter;
                counter = 0;
                counterText.setText(message);
            }
        });

        increaseButton = findViewById(R.id.CounterButton);
        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                count=counter;
                String message = "Counter is : "+counter;
                counterText.setText(message);
            }
        });

    }
}
