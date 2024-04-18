package com.example.praktikum4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.praktikum4.Tweet;
import com.example.praktikum4.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvUsername = findViewById(R.id.tv_username);

        Intent intent = getIntent();
        Tweet tweet = intent.getParcelableExtra("tweet");

        ivProfile.setImageResource(tweet.getProfilePhoto());
        tvName.setText(tweet.getName());
        tvUsername.setText(tweet.getUsername());

    }
}
