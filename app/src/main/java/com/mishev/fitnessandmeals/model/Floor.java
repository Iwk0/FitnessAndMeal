package com.mishev.fitnessandmeals.model;

import com.google.gson.annotations.SerializedName;

public class Floor {

    @SerializedName("path")
    private String path;

    @SerializedName("name")
    private String name;

    @SerializedName("width")
    private float width;

    @SerializedName("length")
    private float length;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}