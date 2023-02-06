package com.example.second_phase_todo;

public class ToDo {
    private String title, details, date;



    public ToDo(String title, String details, String date) {
        this.title = title;
        this.details = details;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
