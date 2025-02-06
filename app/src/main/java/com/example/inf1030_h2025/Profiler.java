package com.example.inf1030_h2025;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.inf1030_h2025.databinding.ActivityProfilerBinding;
import com.example.inf1030_h2025.dto.MachinDTO;

public class Profiler extends AppCompatActivity {

    MachinDTO bidule = new MachinDTO();


    private @NonNull ActivityProfilerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*binding = ActivityProfilerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());*/

        binding = DataBindingUtil.setContentView(this, R.layout.activity_profiler);

        bidule.setAdresse("Gotham City");
        bidule.setDate("11 Septembre 2001");
        bidule.setPrenom("Djamal");
        bidule.setNom("Al-Kaida");


    }
}