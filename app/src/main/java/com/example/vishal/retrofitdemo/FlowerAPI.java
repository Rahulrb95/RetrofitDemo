package com.example.vishal.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;


public interface FlowerAPI
{

    @GET("/feeds/flowers.json")
    public Call<List<Flower>> getData();


}
