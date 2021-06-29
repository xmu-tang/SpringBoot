package com.driver.model;
public class Category {
    private int id;
    private String name;
    private int type;

    @Override
    public String toString() {
        return "id is "+id+"; name is "+ name + "; type is "+ type;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
