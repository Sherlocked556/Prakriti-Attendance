package com.example.toyo.barcodereader;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface my_api {

    @GET("") //endpoint url till query('?')

        // .. go to retrofit.java to add base url
    Call<ResponseBody> getusers(@Query("id") String userId); //change 'id' to whatever the enrollment number is named in the database



}
