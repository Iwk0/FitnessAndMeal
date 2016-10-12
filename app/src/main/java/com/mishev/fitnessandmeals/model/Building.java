package com.mishev.fitnessandmeals.model;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Floor> floors;

    private String name;

    public void addFloor(Floor floor) {
        if (floors == null) {
            floors = new ArrayList<>();
        }
            //test
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