package com.example.praktikum7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nim, et_pass;
    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nim = findViewById(R.id.et_nim);
        et_pass = findViewById(R.id.et_Pass);
        login = findViewById(R.id.btn_log);
        register = findViewById(R.id.btn_reg);


        login.setOnClickListener(v -> {
            SharedPreferences preferences = getSharedPreferences("user_pref", MODE_PRIVATE);
            String nim = et_nim.getText().toString();
            String pass = et_pass.getText().toString();

            String savedPassword = preferences.getString("pass", null);
            String savedNIM = preferences.getString("nim", null);
            System.out.println(savedPassword);
            if (!nim.isEmpty() && !pass.isEmpty()) {
                if(savedPassword == null || savedNIM == null){
                    Toast.makeText(MainActivity.this, "Data tidak tersedia", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!nim.equals(savedNIM) && !pass.equals(savedPassword)){
                    Toast.makeText(MainActivity.this, "Username dan password tidak cocok", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            } else {
                et_nim.setError("Please fill this field");
                et_pass.setError("Please fill this field");
            }
        });

        register.setOnClickListener(v -> {
            Intent register = new Intent(MainActivity.this,RegisActivity.class);
            startActivity(register);
        });

        SharedPreferences modePreferences = getSharedPreferences("mode_pref", MODE_PRIVATE);
        boolean DarkTheme = modePreferences.getBoolean("dark_theme", false);
        if (DarkTheme) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}