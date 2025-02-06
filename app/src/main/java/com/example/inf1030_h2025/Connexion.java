package com.example.inf1030_h2025;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.inf1030_h2025.databinding.ActivityConnexionBinding;
import com.example.inf1030_h2025.databinding.ActivityProfilerBinding;
import com.example.inf1030_h2025.dto.AuthDTO;

public class Connexion extends AppCompatActivity {
    private @NonNull ActivityConnexionBinding binding;

    AuthDTO bidulus = new AuthDTO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profiler);
        } ;



}
