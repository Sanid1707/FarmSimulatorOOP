package com.dkit.sd2b.sanidhyapandey;

import java.util.Random;

public class DairyCow extends Animal implements Milkable{

    Random capacityGenerator = new Random();
    private final int numUdders = 4;
    private int capacityOfUdders;
    private double milkProducedInOneMilking;
    private int numMilkingPerDay;
    private double milkLeftInUdders;
    private int numberTimesMilked;

    public DairyCow(String name){
        super(name);
        this.capacityOfUdders = capacityGenerator.nextInt(21)+20;
        this.numMilkingPerDay = 5;
        this.milkLeftInUdders = capacityOfUdders;
        setMilkable(true);
        milkProducedInOneMilking = (double) capacityOfUdders/numMilkingPerDay;
        this.numMilkingPerDay =0;
    }

    public int getNumMilkingPerDay() {
        return numMilkingPerDay;
    }

    public double getMilkLeftInUdders() {
        return milkLeftInUdders;
    }

    public DairyCow(){
        super();
        this.capacityOfUdders = capacityGenerator.nextInt(21)+20;
        this.numMilkingPerDay = 5;
        this.milkLeftInUdders = capacityOfUdders;
        setMilkable(true);
        milkProducedInOneMilking = (double) capacityOfUdders/numMilkingPerDay;
        this.numMilkingPerDay =0;
    }

    public double getCapacityOfUdders() {
        return capacityOfUdders;
    }

    public double getMilkProducedInOneMilking() {
        return milkProducedInOneMilking;
    }

    public void setCapacityOfUdders(int capacityOfUdders) {
        if(capacityOfUdders>=20 && capacityOfUdders<=40){
            this.capacityOfUdders = capacityOfUdders;
        }
        else capacityOfUdders = 30;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setNumMilkingPerDay(int numMilkingPerDay) {
        this.numMilkingPerDay = numMilkingPerDay;
    }

    public int getNumberTimesMilked() {
        return numberTimesMilked;
    }

    public void setNumberTimesMilked(int numberTimesMilked) {
        if(numberTimesMilked>=0 && numberTimesMilked<=5){
            this.numberTimesMilked = numberTimesMilked;
        }
        else numberTimesMilked = 2;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isMilkable() {
        return super.isMilkable();
    }

    @Override
    public String toString() {
        return "DairyCow{" +
                " id= "+ getId()+
                ", name= "+ getName()+
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
