package com.example.android.sejcomp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scene_Second_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene__second_two);
    }

    public void branch_op1(View view) {

        Intent myIntent = new Intent(Scene_Second_two.this, Scene_Third_two.class);
        startActivity(myIntent);
    }

    public void branch_op2(View view) {

        Intent myIntent = new Intent(Scene_Second_two.this, Scene_Five_one.class);
        startActivity(myIntent);
    }
}
