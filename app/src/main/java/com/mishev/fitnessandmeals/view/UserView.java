package com.mishev.fitnessandmeals.view;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mishev.fitnessandmeals.R;
import com.mishev.fitnessandmeals.databinding.FragmentUserBinding;
import com.mishev.fitnessandmeals.model.Campus;
import com.mishev.fitnessandmeals.viewmodel.UserViewModel;
import com.mishev.fitnessandmeals.viewmodel.UserViewModelContract;

import java.util.List;

public class UserView extends Fragment implements UserViewModelContract.MainView  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentUserBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user, container, false);
        binding.setMainViewModel(new UserViewModel(this));
        return binding.getRoot();
    }

    @Override
    public void loadData(List<Campus> campus) {

    }
}