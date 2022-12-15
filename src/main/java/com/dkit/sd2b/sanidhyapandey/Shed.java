package com.dkit.sd2b.sanidhyapandey;

public class Shed {

    private static int shedId =0;
    private int id;
    private String animalType;
    private MilkingMachine myMilkingMachine;
    private MilkTank myMilkTank;

    public Shed(String animalType) {
        id = ++shedId;
        myMilkTank =  new MilkTank(animalType);
        myMilkingMachine = new MilkingMachine(false, this.myMilkTank);
        System.out.println("Milk tank has been installed for "+ animalType+ " in shed number "+id);
    }

    public void installMilkingMachine(){
        myMilkingMachine.setConnectedToTank(true);
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

    public MilkingMachine getMyMilkingMachine() {
        return myMilkingMachine;
    }

    public void setMyMilkingMachine(MilkingMachine myMilkingMachine) {
        this.myMilkingMachine = myMilkingMachine;
    }

    public MilkTank getMyMilkTank() {
        return myMilkTank;
    }

    public void setMyMilkTank(MilkTank myMilkTank) {
        this.myMilkTank = myMilkTank;
    }

    @Override
    public String toString() {
        return "Shed{" +
                "id=" + id +
                ", animalType: " + animalType  +
                ", myMilkingMachine: "+ myMilkingMachine.toString() +
                ", myMilkTank: " + myMilkTank.toString() +
                '}';
    }
}
