package com.example.student.myapplication;

/**
 * Created by Student on 9/4/2018.
 */

public abstract class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return this.id +"_"+ this.name;
    }
}
