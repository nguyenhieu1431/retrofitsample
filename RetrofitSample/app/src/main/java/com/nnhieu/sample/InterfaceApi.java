package com.nnhieu.sample;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Admin on 12/26/2016.
 */

public interface InterfaceApi {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<Questions> getQuestion(@Query("tagged") String tags);

    @POST("/questions")
    Call<Choices> postQuestion(@Body Question2 question2);
}
