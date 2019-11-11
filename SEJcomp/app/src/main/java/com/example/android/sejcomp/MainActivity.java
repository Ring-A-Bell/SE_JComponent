package com.example.android.sejcomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int honor=100;



        Button button = findViewById(R.id.main_button);

        // Capture button clicks
		button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,
                        Scene_First.class);
                startActivity(myIntent);
            }
        });


        button = findViewById(R.id.how_to_play);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,
                        HowToPlay.class);
                startActivity(myIntent);
            }
        });

        button = findViewById(R.id.credit_button);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,
                        Credit.class);
                startActivity(myIntent);
            }
        });
    }
}