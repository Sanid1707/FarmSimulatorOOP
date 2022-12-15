package com.dkit.sd2b.sanidhyapandey;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StoreAFarm {



    public void storingFarm(Farm Ooty){

        try (BufferedWriter farmFile = new BufferedWriter(new FileWriter("StoreFile.txt")))
        {
            farmFile.flush();

            farmFile.write("Farm Id: "+ Ooty.getId() +"\nFarm Name: " + Ooty.getNameOfFarm() +
                    "\nFarm Owner: "+ Ooty.getNameOfOwner()+
                    "\n\n\nFarm Shed details: \n\nDairy Cow Shed\n" +
                    Ooty.getSheds().get(0).toString() +
                    "\n\nGoat Shed: \n"+
                    Ooty.getSheds().get(1).toString()
            );

            for(DairyCow herd: Ooty.getDairyCowsHerd()) {

                for (int i = 0; i < Ooty.getDairyCowsHerd().size(); i++) {
                    farmFile.write(herd.toString());
                    farmFile.write("\n");
                }
            }

            for(BeefCow herd: Ooty.getBeefCowsHerd()) {

                for (int i = 0; i < Ooty.getBeefCowsHerd().size(); i++) {
                    farmFile.write(herd.toString());
                    farmFile.write("\n");
                }
            }

            for(Goat herd: Ooty.getGoatHerd()) {

                for (int i = 0; i < Ooty.getGoatHerd().size(); i++) {
                    farmFile.write(herd.toString());
                    farmFile.write("\n");
                }
            }

            for(Sheep herd: Ooty.getSheepHerd()) {

                for (int i = 0; i < Ooty.getSheepHerd().size(); i++) {
                    farmFile.write(herd.toString());
                    farmFile.write("\n");
                }
            }





            System.out.println("Farm data saved");
        } catch (IOException ioe)
        {
            System.out.println("Could not save farm data.");
        }}

}
