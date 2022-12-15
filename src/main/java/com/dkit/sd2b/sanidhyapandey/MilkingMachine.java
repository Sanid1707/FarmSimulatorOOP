package com.dkit.sd2b.sanidhyapandey;

public class MilkingMachine {

    private boolean connectedToTank;
    private MilkTank milkTank;

    public MilkingMachine(boolean connectedToTank, MilkTank milkTank){
        this.connectedToTank = connectedToTank;
        this.milkTank = milkTank;
    }

    public boolean isConnectedToTank() {
        return connectedToTank;
    }

    public void setConnectedToTank(boolean connectedToTank) {
        this.connectedToTank = connectedToTank;
    }

    public MilkTank getMilkTank() {
        if(connectedToTank==true) return milkTank;
        else{
            System.out.println("Not connected to milk tank");
            return null;
        }
    }

    public void setMilkTank(MilkTank milkTank) {
        this.milkTank = milkTank;
    }

    public void milkDairyCow(DairyCow cow){
        if(milkTank.freeSpace()>cow.getMilkProducedInOneMilking()){
            if(cow.milk()==true){
                milkTank.addToTank(cow.getMilkProducedInOneMilking());
            }
            else System.out.println("Cannot be milked as number of times to be milked has been maxxed");
        }
    }

    public void milkDairyCow(Goat goat){
        if(milkTank.freeSpace()>goat.getMilkProducedInOneMilking()){
            if(goat.milk()==true){
                milkTank.addToTank(goat.getMilkProducedInOneMilking());
            }
            else System.out.println("Cannot be milked as number of times to be milked has been maxxed");
        }
    }

    @Override
    public String toString() {
        return "MilkingMachine{" +
                "connectedToTank: " + connectedToTank +
                ", milkTank: " + milkTank.toString() +
                '}';
    }
}
