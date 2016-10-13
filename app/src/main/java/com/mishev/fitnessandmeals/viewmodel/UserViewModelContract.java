package com.mishev.fitnessandmeals.viewmodel;

import com.mishev.fitnessandmeals.model.Campus;

import java.util.List;

public interface UserViewModelContract {

    interface MainView {

        void loadData(List<Campus> campus);
    }
}