package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout conlay = (ConstraintLayout) findViewById(R.id.constraint);
        TextView textInfo = (TextView) findViewById(R.id.info);
        Button yellowbtn = (Button) findViewById(R.id.yellowlight);
        Button grnbtn = (Button) findViewById(R.id.greenlight);
        Button redbtn = (Button) findViewById(R.id.redlight);
        yellowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInfo.setText(R.string.yellow);
                conlay.setBackgroundColor(getColor(R.color.yellow));
            }
        });
        grnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInfo.setText(R.string.green);
                conlay.setBackgroundColor(getColor(R.color.green));
            }
        });
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInfo.setText(R.string.red);
                conlay.setBackgroundColor(getColor(R.color.red));
            }
        });

    }


}