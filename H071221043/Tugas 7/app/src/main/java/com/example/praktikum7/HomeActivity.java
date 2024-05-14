package com.example.praktikum7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView iv_welcome;
    Button btn_logout, btn_set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences preferences = getSharedPreferences("user_pref",MODE_PRIVATE);
        String nim = preferences.getString("nim","");

        iv_welcome = findViewById(R.id.iv_welcome);
        iv_welcome.setText("Selamat Datang " + nim);
        btn_logout = findViewById(R.id.btn_logout);
        btn_set = findViewById(R.id.btn_set);

        btn_logout.setOnClickListener(v -> {
            // Mengalihkan pengguna kembali ke aktivitas login
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Menutup aktivitas display info agar tidak bisa kembali ke halaman tersebut dengan tombol back
        });

        btn_set.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, SettingActivity.class);
            startActivity(intent);
        });

        SharedPreferences modePreferences = getSharedPreferences("mode_pref", MODE_PRIVATE);
//        boolean DarkTheme = modePreferences.getBoolean("dark_theme", false);
//        if (DarkTheme) {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//        } else {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//        }
    }
}