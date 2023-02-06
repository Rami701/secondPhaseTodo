package com.example.second_phase_todo;

public class ToDo {
    private String title, details, date;

    public static final ToDo[] toDos = {
            new ToDo("1", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("2", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("3", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("4", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("5", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("6", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("7", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("8", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("9", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
            new ToDo("10", "bla bla bla ;laskdfj;alskfj;alskf;las g;las gla;ksjg erjlahgqlkjfhLKWHFL KEWJHFKLAEJRHG KLJERGH K;JLEHG KL;J", "12/3/2002"),
    };

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
