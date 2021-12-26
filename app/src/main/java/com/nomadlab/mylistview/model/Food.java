package com.nomadlab.mylistview.model;

import java.util.ArrayList;

public class Food {

    private final String thumbnail;
    private final String title;
    private final String subTitle;
    private final String detail;

    public Food(String thumbnail, String title, String subTitle, String detail) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.subTitle = subTitle;
        this.detail = detail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDetail() {
        return detail;
    }

    public static ArrayList<Food> getSampleData() {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2017/02/15/10/39/salad-2068220__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2017/06/06/22/46/mediterranean-cuisine-2378758__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2015/12/09/17/11/vegetables-1085063__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2015/12/09/17/11/vegetables-1085063__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032__340.jpg", "Food1", "SubTitle", "detail1"));
        foods.add(new Food("https://cdn.pixabay.com/photo/2015/04/08/13/13/food-712665__340.jpg", "Food1", "SubTitle", "detail1"));
        return foods;

    }
}
