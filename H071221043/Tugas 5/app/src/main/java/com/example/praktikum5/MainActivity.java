package com.example.praktikum5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.praktikum5.fragment.HomeFragment;
import com.example.praktikum5.fragment.SearchFragment;
import com.example.praktikum5.fragment.AddPostFragment;
import com.example.praktikum5.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IV_Home = findViewById(R.id.IV_Home);
        ImageView IV_Search = findViewById(R.id.IV_Search);
        ImageView IV_Post = findViewById(R.id.IV_Plus);
        ImageView iv_profile = findViewById(R.id.IV_Profile);


        FragmentManager fragmentManager = getSupportFragmentManager();

        HomeFragment homeFragment = new HomeFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        if (!(fragment instanceof HomeFragment)){
            fragmentManager.beginTransaction().add(R.id.frame_container, homeFragment).commit();
        }

        IV_Home.setOnClickListener(v -> {
            HomeFragment homeFragment1 = new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, homeFragment1)
                    .addToBackStack(null).commit();
        });

        IV_Search.setOnClickListener(v -> {
            SearchFragment searchFragment = new SearchFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, searchFragment)
                    .addToBackStack(null).commit();
        });

        IV_Post.setOnClickListener(v -> {
            AddPostFragment addPostFragment = new AddPostFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, addPostFragment)
                    .addToBackStack(null).commit();
        });

        iv_profile.setOnClickListener(v -> {
            ProfileFragment profileFragment = new ProfileFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, profileFragment)
                    .addToBackStack(null).commit();
        });

    }


}