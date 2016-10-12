package com.mishev.fitnessandmeals.events;

import android.text.TextUtils;
import android.util.Log;

import com.mishev.fitnessandmeals.model.User;

public class UserHandler {

    public void onCreateUser(User user) {
        Log.i("TEST", String.valueOf(TextUtils.getTrimmedLength(user.getFirstName())));
    }
}