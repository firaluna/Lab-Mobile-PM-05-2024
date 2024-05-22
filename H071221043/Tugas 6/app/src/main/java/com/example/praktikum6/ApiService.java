package com.example.praktikum6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/users")
    Call<UserResponse> getUsers(@Query("page") int page, @Query("per_page") int per_page);

//    @Header({"X-RapidAPI-Key : d8a7975ebemshca406709f198d0fp18cc60jsnbd2f8c174880"})
    @GET("api/users/{id}")
    Call<UserResponse2> getUserById(@Path("id") int userId);
}
