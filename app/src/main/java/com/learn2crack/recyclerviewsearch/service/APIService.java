package com.learn2crack.recyclerviewsearch.service;

import com.learn2crack.recyclerviewsearch.model.RecipeModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NM on 5/8/2017.
 */

public interface APIService {
    @GET("recipe_api.php")
    Call<ArrayList<RecipeModel>> getUserData();





}

