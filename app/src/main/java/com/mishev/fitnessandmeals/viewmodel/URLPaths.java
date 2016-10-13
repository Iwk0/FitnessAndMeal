package com.mishev.fitnessandmeals.viewmodel;

import com.mishev.fitnessandmeals.model.Campus;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;

interface URLPaths {

    @GET("/api/v1/structure")
    Observable<List<Campus>> getCampus();
}