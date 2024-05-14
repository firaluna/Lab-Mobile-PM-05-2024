package com.example.praktikum7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingActivity extends AppCompatActivity {

    private Switch themeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        themeSwitch = findViewById(R.id.mode);
        SharedPreferences modePreferences = getSharedPreferences("mode_pref", MODE_PRIVATE);
        SharedPreferences.Editor editor = modePreferences.edit();


        //jika kunci "dark_theme" tidak ditemukan dalam SharedPreferences. Ini berarti jika tidak ada preferensi yang tersimpan sebelumnya, maka DarkTheme akan diatur ke false, artinya tema terang.
        boolean DarkTheme = modePreferences.getBoolean("dark_theme", false);
        themeSwitch.setChecked(DarkTheme);

        themeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    // Mengaktifkan tema terang
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
                editor.putBoolean("dark_theme", isChecked);
                editor.apply();
            }
        });
    }
}