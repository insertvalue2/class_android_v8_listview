package com.nomadlab.mylistview.model;

import com.nomadlab.mylistview.R;

public enum FoodType {
    Low_Fat("low_fat"), Medium_Fat("medium_fat"), High_Fat("high_fat");

    String type;
    int color;

    FoodType(String type) {
        this.type = type;
        switch (type) {
            case "low_fat":
                color = R.color.low_fat;
                break;
            case "medium_fat":
                color = R.color.medium_fat;
                break;
            case "high_fat":
                color = R.color.high_fat;
                break;
        }
    }

    public int getColor() {
        return color;
    }

    public String getType() {
        return type;
    }


}
