package com.example.farmwalk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.mylibrary.Location;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button draw=findViewById(R.id.start);
        draw.setOnClickListener(view->{
            Location l=new Location();
            System.out.println("Start Button has been pressed");
            l.StartLocationService(MainActivity.this,1.00f);
            System.out.println("Start is pressed");
        });

        Button walk=findViewById(R.id.stop);
        walk.setOnClickListener(view->{
            Location l=new Location();
            System.out.println("Stop Button has been pressed");
            l.StopLocationService(MainActivity.this);

        });

    }
}