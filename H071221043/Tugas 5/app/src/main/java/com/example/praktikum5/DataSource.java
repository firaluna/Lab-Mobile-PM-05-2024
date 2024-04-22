package com.example.praktikum5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Tweet> tweets = generateDummyTweets();

    private static ArrayList<Tweet> generateDummyTweets() {
        ArrayList<Tweet> tweetss = new ArrayList<>();
        tweetss.add(new Tweet("jxxvvxxk","Lee Jae Wook","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.ljw,R.drawable.ljw));

        tweetss.add(new Tweet("gominsi","Go Min Si","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.gms,R.drawable.gms));

        tweetss.add(new Tweet("ldh_sky","Lee Do Hyun","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.ldh,R.drawable.ldh));

        tweetss.add(new Tweet("_imyour_joy","Joy Red Velvet","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.joyy,R.drawable.joyy));

        tweetss.add(new Tweet("yook_can_do_it","Yook Sung Jae","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.ysj,R.drawable.ysj));

        return tweetss;
    }
}

