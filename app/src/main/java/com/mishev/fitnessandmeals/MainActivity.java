package com.mishev.fitnessandmeals;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mishev.fitnessandmeals.databinding.ActivityMainBinding;
import com.mishev.fitnessandmeals.events.UserHandler;
import com.mishev.fitnessandmeals.model.User;
import com.mishev.fitnessandmeals.service.JsonService;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");
        binding.setUser(user);
        binding.setHandlers(new UserHandler());

        try {
            JsonService jsonService = new JsonService();
            jsonService.convertJsonToCampus();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }
}