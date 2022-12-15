package com.dkit.sd2b.sanidhyapandey;

import java.util.Random;

public class Goat extends Animal implements Milkable{

    Random capacityGenerator = new Random();
    private final int numUdders = 4;
    private int capacityOfUdders;
    private double milkProducedInOneMilking;
    private int numMilkingPerDay;
    private double milkLeftInUdders;
    private int numberTimesMilked ;

    public Goat(String name){
        super(name);
        this.capacityOfUdders = capacityGenerator.nextInt(2)+1;
        this.numMilkingPerDay = 1;
        this.milkLeftInUdders = capacityOfUdders;
        setMilkable(true);
        milkProducedInOneMilking = (double) capacityOfUdders/numMilkingPerDay;
    }

    public int getNumMilkingPerDay() {
        return numMilkingPerDay;
    }

    public double getMilkLeftInUdders() {
        return milkLeftInUdders;
    }

    public Goat(){
        super();
        this.capacityOfUdders = capacityGenerator.nextInt(2)+1;
        this.numMilkingPerDay = 1;
        this.milkLeftInUdders = capacityOfUdders;
        setMilkable(true);
        milkProducedInOneMilking = (double) capacityOfUdders/numMilkingPerDay;
    }

    public double getCapacityOfUdders() {
        return capacityOfUdders;
    }

    public double getMilkProducedInOneMilking() {
        return milkProducedInOneMilking;
    }

    public void setCapacityOfUdders(int capacityOfUdders) {
        this.capacityOfUdders = capacityOfUdders;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setNumMilkingPerDay(int numMilkingPerDay) {
        this.numMilkingPerDay = numMilkingPerDay;
    }

    public void setNumberTimesMilked(int numberTimesMilked) {
        if(numberTimesMilked>=0 && numberTimesMilked<=1){
            this.numberTimesMilked = numberTimesMilked;
        }
        else numberTimesMilked = 1;
    }

    public int getNumberTimesMilked() {
        return numberTimesMilked;
    }

    @Override
    public String toString() {
        return "Goat{" +
                " id= "+ getId()+
                " name= " + getName() +
                ", numUdders=" + numUdders +
                ", capacityOfUdders=" + capacityOfUdders +
                ", milkProducedInOneMilking=" + milkProducedInOneMilking +
                ", numMilkingPerDay=" + numMilkingPerDay +
                ", milkLeftInUdders=" + milkLeftInUdders +
                ", numberTimesMilked=" + numberTimesMilked +
                '}';
    }

    @Override
    public boolean milk() {
        if(numberTimesMilked<5){
            numberTimesMilked++;
            milkLeftInUdders = capacityOfUdders - milkProducedInOneMilking*(5-numberTimesMilked);
            return true;
        }
        return false;
    }
}
