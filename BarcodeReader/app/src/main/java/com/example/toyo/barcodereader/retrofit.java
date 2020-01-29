package com.example.toyo.barcodereader;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit {

    private static final String base_url = "";//base url
    private static retrofit instance;
    private Retrofit retrofit; //retrofit object

    private retrofit() { //constructor
        retrofit = new Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create()).build();

    }

    public static synchronized retrofit getInstance() {
        if (instance == null) {
            instance = new retrofit();
        }
        return instance;

    }

    public my_api getapi() {
        return retrofit.create(my_api.class);
    }
}
