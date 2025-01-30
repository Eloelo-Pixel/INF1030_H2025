package com.example.inf1030_h2025.Welcome;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.inf1030_h2025.MainActivity;
import com.example.inf1030_h2025.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String message = getIntent().getExtras().getString("message");
        TextView tv = findViewById(R.id.affichage);
        tv.setText(message);

        Button pustula = findViewById(R.id.pustula);
        pustula.setOnClickListener(v -> {
            finish();
        });
    }
}