package com.mishev.fitnessandmeals.model;

import java.util.ArrayList;
import java.util.List;

public class Campus {

    private List<Building> buildings;

    private String name;

    public void addBuilding(Building building) {
        if (buildings == null) {
            buildings = new ArrayList<>();
        }

        buildings.add(building);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}