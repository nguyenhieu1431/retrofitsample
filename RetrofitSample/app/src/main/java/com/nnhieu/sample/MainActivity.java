package com.nnhieu.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
//                .connectTimeout(60, TimeUnit.SECONDS)
//                .readTimeout(60, TimeUnit.SECONDS)
//                .writeTimeout(60, TimeUnit.SECONDS)
//                .build();
//
//        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.stackexchange.com").addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
//        api = retrofit.create(InterfaceApi.class);

        InterfaceApi api = ServiceHelper.initService(InterfaceApi.class);
        List<String> question = new ArrayList<>();
        question.add("Swift");
        Call<Choices> question2Call = api.postQuestion(new Question2("Favourite programming language?", question));
        question2Call.enqueue(new Callback<Choices>() {
            @Override
            public void onResponse(Call<Choices> call, Response<Choices> response) {
                Log.i("","");
            }

            @Override
            public void onFailure(Call<Choices> call, Throwable t) {
                Log.i("","");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        callQuestion();
        return true;
    }

    private void callQuestion() {

    }
}
