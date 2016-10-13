package com.mishev.fitnessandmeals.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Floor> floors;

    @SerializedName("name")
    private String name;

    public void addFloor(Floor floor) {
        if (floors == null) {
            floors = new ArrayList<>();
        }

        floors.add(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}