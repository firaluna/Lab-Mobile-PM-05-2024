package com.example.tgsprak3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activityPostingan extends AppCompatActivity {
    ImageView img, img1;
    TextView tv, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postingan);

        img = findViewById(R.id.iv_user);
        img1 = findViewById(R.id.iv_post);
        tv = findViewById(R.id.tv_username);
        tv2 = findViewById(R.id.tv_caption);

        Intent intent = getIntent();
        Model story = intent.getParcelableExtra("model");

        tv.setText(story.getUsername());
        tv2.setText(story.getCaption());
        img.setImageResource(story.getImageUser());
        img1.setImageResource(story.getImageFeeds());

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activityPostingan.this, activityStory.class);
                intent.putExtra("model",story);
                startActivity(intent);

            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();


            }
        });
    }
}
