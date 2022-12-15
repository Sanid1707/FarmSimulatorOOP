package com.dkit.sd2b.sanidhyapandey;

import java.util.Random;

public class Animal {

    Random nameGenerator = new Random();
    private static int animalId = 0;
    private int id;
    private String name;
    private boolean milkable;

    private String[] listofnames = {"Add names chutiye"};

    public Animal(String name) {
        this.id = ++animalId;
        this.name = name;
        this.milkable = false;
    }

    public Animal() {
        this.id = ++animalId;
        this.name = selectName();
        this.milkable = milkable;
    }

    private String selectName(){
        int number = nameGenerator.nextInt(listofnames.length);
        String selectedName = listofnames[number];
        return selectedName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isMilkable() {
        return milkable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMilkable(boolean milkable) {
        this.milkable = milkable;
    }



}
