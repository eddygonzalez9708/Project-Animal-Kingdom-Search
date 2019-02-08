package com.lambdaschool;

public class Fish extends AbstractAnimal {
    private String name;
    private int year;

    public Fish(String name, int year) {
        super("swim", "gills", "eggs");
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }
}
