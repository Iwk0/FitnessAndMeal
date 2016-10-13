package com.mishev.fitnessandmeals.viewmodel;

import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.view.View;

import com.mishev.fitnessandmeals.model.Campus;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class UserViewModel {

    public ObservableField<String> messageLabel;

    private UserViewModelContract.MainView mainView;

    public UserViewModel(@NonNull UserViewModelContract.MainView mainView) {
        this.mainView = mainView;

        messageLabel = new ObservableField<>();
        messageLabel.set("constructor");
    }

    public void onClick(View view) {
        try {
            getCampus();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }

    private void getCampus() throws NoSuchAlgorithmException, KeyManagementException {
        URLPaths service = ServiceFactory.createRetrofitServiceWithoutHttps(URLPaths.class, "http://10.20.2.55:8080");
        service.getCampus()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Action1<List<Campus>>() {

                    @Override
                    public void call(List<Campus> campus) {
                        if (mainView != null) {
                            mainView.loadData(campus);
                            messageLabel.set("get campus");
                        }
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });
    }
}