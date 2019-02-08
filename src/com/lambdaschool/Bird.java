package com.lambdaschool;

public class Bird extends AbstractAnimal{
    private String name;
    private int year;

    public Bird(String name, int year) {
        super("fly", "lungs", "eggs");
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
        return "Bird{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }
}
