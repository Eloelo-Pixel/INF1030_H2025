package com.example.inf1030_h2025;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.inf1030_h2025.Welcome.WelcomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText zonText = findViewById(R.id.acnula);
        Editable message = zonText.getText();
        Button button = findViewById(R.id.buttona);
        button.setOnClickListener(v->{
            Log.i("XXXXXXXX", "message"+message.toString());
            Intent newIntent = new Intent(this, WelcomeActivity.class);
            newIntent.putExtra("message", message.toString());
            Log.i("XXXXXXXX", "message"+message);

            startActivity(newIntent);
        });



        Log.i("XXXXXXXX", "Je suis dans la methode oncreate mainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("XXXXXXXX", "Je suis dans la methode onstart mainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("XXXXXXXX", "Je suis dans la methode onresume mainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("XXXXXXXX", "Je suis dans la methode onpause mainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("XXXXXXXX", "Je suis dans la methode onstop mainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("XXXXXXXX", "Je suis dans la methode ondestroy mainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("XXXXXXXX", "Je suis dans la methode onRestart mainActivity");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("XXXXXXXX", "Je suis dans la methode onRestoreInstanceState mainActivity");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i("XXXXXXXX", "Je suis dans la methode onSaveInstanceState mainActivity");
    }
}