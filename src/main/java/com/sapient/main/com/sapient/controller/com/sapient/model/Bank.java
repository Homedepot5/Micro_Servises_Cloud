package com.sapient.main.com.sapient.controller.com.sapient.model;

public class Bank {
   private int id;
    private String name;

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
