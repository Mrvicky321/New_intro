package com.example.new_intro.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.new_intro.R;

public class FrontActivity extends AppCompatActivity {  // Changed class name to FrontActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        // Check if ActionBar is available and set title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Front Activity");
        }

        // Find the button and set click listener
        Button button2 = findViewById(R.id.Button2);
        button2.setOnClickListener(v -> {
            Intent intent2 = new Intent(FrontActivity.this, MainActivity.class);
            startActivity(intent2);
        });
    }
}
