package com.example.second_phase_todo;

public class Grade {
    private String title, grade, realGrade;

    public static final Grade[] grades= {
            new Grade("Quiz 1", "90 / 100", "9 / 10"),
            new Grade("Quiz 2", "80 / 100", "8 / 10"),
            new Grade("Midterm", "66 / 100", "12 / 20"),
            new Grade("Quiz 3", "90 / 100", "9 / 10"),
            new Grade("Quiz 4", "90 / 100", "9 / 10"),
            new Grade("Quiz 5", "0 / 100", "0 / 10"),
            new Grade("Quiz 6", "100 / 100", "10 / 10"),
    };

    public Grade(String title, String grade, String realGrade) {
        this.title = title;
        this.grade = grade;
        this.realGrade = realGrade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRealGrade() {
        return realGrade;
    }

    public void setRealGrade(String realGrade) {
        this.realGrade = realGrade;
    }
}
