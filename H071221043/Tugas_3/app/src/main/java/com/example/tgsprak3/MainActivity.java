package com.example.tgsprak3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_story, rv_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_story = findViewById(R.id.rv_story);
        rv_post = findViewById(R.id.rv_post);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.models);
        rv_story.setAdapter(storyAdapter);

        PostAdapter postAdapter = new PostAdapter(DataSource.models);
        rv_post.setAdapter(postAdapter);
    }
}