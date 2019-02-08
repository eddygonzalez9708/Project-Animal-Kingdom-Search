package com.lambdaschool;

public class Mammal extends AbstractAnimal {
    private String name;
    private int year;

    public Mammal(String name, int year) {
        super("walk", "lungs", "live births");
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }
}
