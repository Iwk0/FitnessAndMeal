package com.mishev.fitnessandmeals.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.mishev.fitnessandmeals.BR;

public class User extends BaseObservable {

    //@SerializedName("picture")
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}