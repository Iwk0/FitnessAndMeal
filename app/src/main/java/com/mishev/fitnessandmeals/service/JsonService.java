package com.mishev.fitnessandmeals.service;

import com.mishev.fitnessandmeals.model.Campus;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class JsonService {

    public void convertJsonToCampus() throws NoSuchAlgorithmException, KeyManagementException {
        Callback<List<Campus>> callback = new Callback<List<Campus>>() {

            @Override
            public void success(List<Campus> campuses, Response response) {
                String sdas = "";
            }

            @Override
            public void failure(RetrofitError error) {
                String seadsa = "";
            }
        };

        URLPaths service = ServiceFactory.createRetrofitServiceWithoutHttps(URLPaths.class, "http://10.20.2.55:8080");
        service.getFloor(callback);
    }
}