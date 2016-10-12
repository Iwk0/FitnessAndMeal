package com.mishev.fitnessandmeals.service;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import retrofit.RestAdapter;

class ServiceFactory {

    static <T> T createRetrofitServiceWithoutHttps(final Class<T> clazz, final String endPoint) throws KeyManagementException, NoSuchAlgorithmException {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(endPoint)
                .build();

        return restAdapter.create(clazz);
    }
}