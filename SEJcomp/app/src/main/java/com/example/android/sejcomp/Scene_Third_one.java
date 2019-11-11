package com.example.android.sejcomp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scene_Third_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene__third_one);
    }

    public void branch_op1(View view) {

        Intent myIntent = new Intent(Scene_Third_one.this, Scene_Second_two.class);
        startActivity(myIntent);
    }

    public void branch_op2(View view) {

        Intent myIntent = new Intent(Scene_Third_one.this, Scene_Fourth_two.class);
        startActivity(myIntent);
    }
}
