package com.example.praktikum7;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisActivity extends AppCompatActivity {

    EditText nim, pass;
    Button regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        nim = findViewById(R.id.et_nim);
        pass = findViewById(R.id.et_Pass);
        regis = findViewById(R.id.btn_register);

        regis.setOnClickListener(v -> {
            SharedPreferences preferences = getSharedPreferences("user_pref", MODE_PRIVATE);
            String et_nim = nim.getText().toString();
            String et_pass = pass.getText().toString();

            if (!et_nim.isEmpty() && !et_pass.isEmpty()) {
                SharedPreferences.Editor editor = preferences.edit();

                // Menghapus data sebelumnya (jika ada)
                editor.clear();
                editor.apply();
                // Menyimpan akun baru
                editor.putString("nim", et_nim);
                editor.putString("pass", et_pass);
                editor.apply();

                Toast.makeText(RegisActivity.this, "Berhasil Membuat Akun", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegisActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }else {
                nim.setError("Please fill this fields");
                pass.setError("Please fill this fields");
//                Toast.makeText(RegisActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }
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