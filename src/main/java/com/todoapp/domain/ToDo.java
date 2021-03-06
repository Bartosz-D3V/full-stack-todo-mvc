package com.todoapp.domain;


import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;


public class ToDo {

    @NotNull
    private int id;
    @NotBlank
    private String title;
    private boolean complete;

    public ToDo() {
        super();
    }

    public ToDo(int id, String title, boolean complete) {
        this.id = id;
        this.title = title;
        this.complete = complete;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
