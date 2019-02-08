package com.lambdaschool;

public abstract class AbstractAnimal implements  Animal {
    int maxId = 0;
    int id;
    String move;
    String breathe;
    String reproduce;

    public AbstractAnimal(String move, String breathe, String reproduce) {
        maxId++;
        id = maxId;
        this.move = move;
        this.breathe = breathe;
        this.reproduce = reproduce;
    }

    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getYear();
    public abstract void setYear(int year);

    public int getId() {
        return id;
    }

    @Override
    public String move() {
        return move;
    }

    @Override
    public String breathe() {
        return breathe;
    }

    @Override
    public String reproduce() {
        return reproduce;
    }
}
