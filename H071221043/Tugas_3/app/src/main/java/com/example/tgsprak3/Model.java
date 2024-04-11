package com.example.tgsprak3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class Model implements Parcelable {


    private int imageUser, imageFeeds, image2;
    private String username, caption, followers, following;

    public Model(int imageUser, int imageFeeds, String username, String caption, int image2, String followers, String following) {
        this.imageUser = imageUser;
        this.imageFeeds = imageFeeds;
        this.username = username;
        this.caption = caption;
        this.image2 = image2;
        this.followers = followers;
        this.following = following;
    }


    //untuk membaca data yang dikirim melalui Parcel.

    protected Model(Parcel in) {
        imageUser = in.readInt();
        imageFeeds = in.readInt();
        image2 = in.readInt();
        username = in.readString();
        caption = in.readString();
        followers = in.readString();
        following = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageUser);
        dest.writeInt(imageFeeds);
        dest.writeInt(image2);
        dest.writeString(username);
        dest.writeString(caption);
        dest.writeString(followers);
        dest.writeString(following);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int imageUser) {
        this.imageUser = imageUser;
    }

    public int getImageFeeds() {
        return imageFeeds;
    }

    public void setImageFeeds(int imageFeeds) {
        this.imageFeeds = imageFeeds;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }
}