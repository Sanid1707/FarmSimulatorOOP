package com.dkit.sd2b.sanidhyapandey;

public class MilkTank {

    private static int milkTankId = 1000;
    private int id;
    private String animalType;
    private double tankCapacity;
    private double currentHolding;

    public MilkTank(String animalType){
        this.id = ++milkTankId;
        this.animalType = animalType;
        tankCapacity = 2000;
        this.currentHolding = 0;
    }

    public MilkTank(String animalType, double customCapacity){
        this.id = ++milkTankId;
        this.animalType = animalType;
        this.tankCapacity = customCapacity;
        this.currentHolding = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        if(tankCapacity>0) this.tankCapacity = tankCapacity;
        else System.out.println("Not within range, setting to original");
    }

    public double getCurrentHolding() {
        return currentHolding;
    }

    public void setCurrentHolding(double currentHolding) {
        if(currentHolding>=0 && currentHolding<=this.tankCapacity) this.currentHolding = currentHolding;
        else {
            System.out.println("Not within range, setting to original");
        }
    }

    public  double freeSpace(){
        double freeSpaceLeft = tankCapacity-currentHolding;
        return freeSpaceLeft;
    }

    public void addToTank(double amount){
        if(freeSpace()>0){
            currentHolding = tankCapacity;
            System.out.println(freeSpace()+" litres added to tank. "+ (amount-freeSpace()) + " litres not added to tank as tank is full.");
        }
    }
    public double getFromTank(double amount){
        if(amount<=currentHolding){
            if(amount==currentHolding){
                currentHolding=0;
                System.out.println("Milk has been collected. Tank is empty.");
            }

            else{
                currentHolding -= amount;
                System.out.println("Milk has been collected. Tank has "+currentHolding+" litres of milk left.");
            }
        }

        else{
            System.out.println("Tank holds less milk than amount required. Collection unavailable.");
        }
        return currentHolding;
    }


    //public double freeSpace

    @Override
    public String toString() {
        return "MilkTank{" +
                "id: " + id +
                ", animalType: " + animalType +
                ", tankCapacity: " + tankCapacity +
                ", currentHolding: " + currentHolding +
                '}';
    }
}
