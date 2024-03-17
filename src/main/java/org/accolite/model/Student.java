package org.accolite.model;

public class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "name : " + name +
                ", id : " + id ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
