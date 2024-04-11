package com.example.tgsprak3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activityProfile extends AppCompatActivity {
    ImageView img, img2;
    TextView tv, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        img = findViewById(R.id.pimage);
        img2 = findViewById(R.id.iv_postingan);
        tv = findViewById(R.id.pusername);
        tv2 = findViewById(R.id.followers2);
        tv3 = findViewById(R.id.following2);

        Intent intent = getIntent();
        Model story = intent.getParcelableExtra("model");

        tv.setText(story.getUsername());
        tv2.setText(story.getFollowers());
        tv3.setText(story.getFollowing());
        img.setImageResource(story.getImageUser());
        img2.setImageResource(story.getImageFeeds());

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activityProfile.this, activityStory.class);
                intent.putExtra("model", story);
                startActivity(intent);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activityProfile.this, activityPostingan.class);
                intent.putExtra("model", story);
                startActivity(intent);

            }
        });
    }
}