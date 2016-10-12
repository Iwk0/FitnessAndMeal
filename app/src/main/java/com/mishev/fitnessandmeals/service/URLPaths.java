package com.mishev.fitnessandmeals.service;

import com.mishev.fitnessandmeals.model.Campus;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

interface URLPaths {

    @GET("/api/v1/structure")
    void getFloor(Callback<List<Campus>> arr);
}