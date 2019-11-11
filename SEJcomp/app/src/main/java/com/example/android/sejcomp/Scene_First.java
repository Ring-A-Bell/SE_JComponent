package com.example.android.sejcomp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Scene_First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene__first);
    }

    public void branch_op1(View view) {

        Intent myIntent = new Intent(Scene_First.this, Scene_Second_one.class);
        startActivity(myIntent);
    }

    public void branch_op2(View view) {

        Intent myIntent = new Intent(Scene_First.this, Scene_Second_two.class);
        startActivity(myIntent);
    }
}
