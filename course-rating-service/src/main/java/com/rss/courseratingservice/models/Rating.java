package com.rss.courseratingservice.models;

public class Rating {

    private String courseId;
    private int rating;

    public Rating(String courseId, int rating) {
        this.courseId = courseId;
        this.rating = rating;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
