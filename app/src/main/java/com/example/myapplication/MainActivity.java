package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ParkTransaction.CreateParkTransaction(10000, "PFfkYKD8uvXk7M7FY6kBTZdeWLpRcHABp3", "memory average vital away document demise nest glow mosquito mammal hold replace");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        try {
            ParkTransaction.CreateParkTransaction(10000, "PFfkYKD8uvXk7M7FY6kBTZdeWLpRcHABp3", "memory average vital away document demise nest glow mosquito mammal hold replace");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
