package com.example.arhaicwordsdictionary;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitProvider {
    private static GitHubApiService gitHubApiService;

    public static GitHubApiService getInstance(){
        if(gitHubApiService == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://my-json-server.typicode.com/ekarisik/json-placeholder/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            gitHubApiService = retrofit.create(GitHubApiService.class);
        }
        return gitHubApiService;
    }

}
