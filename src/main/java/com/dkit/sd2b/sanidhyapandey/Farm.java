package com.dkit.sd2b.sanidhyapandey;

import java.util.ArrayList;
import java.util.Scanner;

public class Farm {

    Scanner keyboard = new Scanner(System.in);

    private static int animalId = 0;
    private int id;
    private String nameOfFarm;
    private String nameOfOwner;
    private ArrayList<Shed> sheds;
    private Shed dairyCowShed;
    private Shed goatShed;
    private ArrayList<DairyCow> dairyCowsHerd = new ArrayList<DairyCow>();
    private ArrayList<Sheep> sheepHerd = new ArrayList<Sheep>();
    private ArrayList<BeefCow> beefCowsHerd = new ArrayList<BeefCow>();
    private ArrayList<Goat> goatHerd = new ArrayList<Goat>();



    public Farm(String nameOfFarm, String nameOfOwner) {
        this.nameOfFarm = nameOfFarm;
        this.nameOfOwner = nameOfOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfFarm() {
        return nameOfFarm;
    }

    public void setNameOfFarm(String nameOfFarm) {
        this.nameOfFarm = nameOfFarm;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public ArrayList<Shed> getSheds() {
        return sheds;
    }

    public void setSheds(ArrayList<Shed> sheds) {
        this.sheds = sheds;
    }

    public Shed getDairyCowShed() {
        return dairyCowShed;
    }

    public void setDairyCowShed(Shed dairyCowShed) {
        this.dairyCowShed = dairyCowShed;
    }

    public Shed getGoatShed() {
        return goatShed;
    }

    public void setGoatShed(Shed goatShed) {
        this.goatShed = goatShed;
    }

    public ArrayList<DairyCow> getDairyCowsHerd() {
        return dairyCowsHerd;
    }

    public void setDairyCowsHerd(ArrayList<DairyCow> dairyCowsHerd) {
        this.dairyCowsHerd = dairyCowsHerd;
    }

    public ArrayList<Sheep> getSheepHerd() {
        return sheepHerd;
    }

    public void setSheepHerd(ArrayList<Sheep> sheepHerd) {
        this.sheepHerd = sheepHerd;
    }

    public ArrayList<BeefCow> getBeefCowsHerd() {
        return beefCowsHerd;
    }

    public void setBeefCowsHerd(ArrayList<BeefCow> beefCowsHerd) {
        this.beefCowsHerd = beefCowsHerd;
    }

    public ArrayList<Goat> getGoatHerd() {
        return goatHerd;
    }

    public void setGoatHerd(ArrayList<Goat> goatHerd) {
        this.goatHerd = goatHerd;
    }

    private void setSheds(){
        dairyCowShed = new Shed("Dairy Cow Shed");
        goatShed = new Shed("Sheep Shed");
        sheds.add(dairyCowShed);
        sheds.add(goatShed);
    }

    public void addDairyCow(){
        System.out.println("Enter\n1.To input name\n2.To generate name\n3.Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        boolean loop = true;
        DairyCow cow = null;
        while(loop){
            try{
                switch (choice){
                    case 1:
                        System.out.println("Enter the name of the cow");
                        String name = keyboard.nextLine();
                        if(checkDairyCow(name)==1){
                            System.out.println("Cow already exists");
                            break;
                        }
                        cow = new DairyCow(name);
                        dairyCowsHerd.add(cow);
                        System.out.println("Dairy cow added");
                        loop = false;
                        break;

                    case 2:
                        cow = new DairyCow();
                        dairyCowsHerd.add(cow);
                        loop = false;
                        break;

                    case 3:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid option");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid option");
            }
        }
        dairyCowsHerd.add(cow);
    }
    public void addBeefCow(){
        System.out.println("Enter\n1.To input name\n2.To generate name\n3.Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        boolean loop = true;
        BeefCow cow = null;
        String pedigree = null;
        double weight = 0;
        int age = 0;
        while(loop){
            try{
                switch (choice){
                    case 1:
                        System.out.println("Enter the name of the cow");
                        String name = keyboard.nextLine();
                        if(checkBeefCow(name)==1){
                            System.out.println("Cow already exists");
                            break;
                        }
                        System.out.println("Enter pedigree");
                        pedigree = keyboard.nextLine();
                        System.out.println("Enter the weight of the cow");
                        weight = keyboard.nextDouble();
                        keyboard.nextLine();
                        System.out.println("Enter the age of the cow");
                        age = keyboard.nextInt();
                        keyboard.nextLine();
                        keyboard.nextLine();
                        cow = new BeefCow(name,pedigree,weight,age);
                        beefCowsHerd.add(cow);
                        System.out.println("Beef cow added");
                        loop = false;
                        break;
                    case 2:
                        System.out.println("Enter pedigree");
                        pedigree = keyboard.nextLine();
                        System.out.println("Enter the weight of the cow");
                        weight = keyboard.nextDouble();
                        keyboard.nextLine();
                        System.out.println("Enter the age of the cow");
                        age = keyboard.nextInt();
                        keyboard.nextLine();
                        keyboard.nextLine();
                        cow = new BeefCow(pedigree,weight,age);
                        beefCowsHerd.add(cow);
                        loop = false;
                        break;
                    case 3:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid option");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid option");
            }
        }
        beefCowsHerd.add(cow);
    }
    public void addGoat(){
        System.out.println("Enter\n1.To input name\n2.To generate name\n3.Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        boolean loop = true;
        Goat goat = null;
        while(loop){
            try{
                switch(choice){
                    case 1:
                        System.out.println("Enter the name of the goat");
                        String name = keyboard.nextLine();
                        if(checkGoat(name)==1){
                            System.out.println("Goat already exists");
                            break;
                        }
                        goat = new Goat(name);
                        goatHerd.add(goat);
                        System.out.println("Goat added");
                        loop = false;
                        break;
                    case 2:
                        goat = new Goat();
                        goatHerd.add(goat);
                        loop = false;
                        break;
                    case 3:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid option");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid option");
            }
        }
        goatHerd.add(goat);

    }
    public void addSheep(){
        System.out.println("Enter\n1.To input name\n2.To generate name\n3.Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        boolean loop = true;
        Sheep sheep = null;
        String pedigree = null;
        double weight = 0;
        int age = 0;
        while(loop){
            try{
                switch (choice){
                    case 1:
                        System.out.println("Enter the name of the sheep");
                        String name = keyboard.nextLine();
                        if(checkSheep(name)==1){
                            System.out.println("Sheep already exists");

                            break;
                        }
                        System.out.println("Enter pedigree");
                        pedigree = keyboard.nextLine();
                        System.out.println("Enter the weight of the sheep");
                        weight = keyboard.nextDouble();
                        keyboard.nextLine();
                        System.out.println("Enter the age of the sheep");
                        age = keyboard.nextInt();
                        keyboard.nextLine();
                        keyboard.nextLine();
                        sheep= new Sheep(name,pedigree,weight,age);
                        sheepHerd.add(sheep);
                        System.out.println("Beef cow added");
                        loop = false;
                        break;
                    case 2:
                        System.out.println("Enter pedigree");
                        pedigree = keyboard.nextLine();
                        System.out.println("Enter the weight of the cow");
                        weight = keyboard.nextDouble();
                        keyboard.nextLine();
                        System.out.println("Enter the age of the cow");
                        age = keyboard.nextInt();
                        keyboard.nextLine();
                        keyboard.nextLine();
                        sheep = new Sheep(pedigree,weight,age);
                        sheepHerd.add(sheep);
                        loop = false;
                        break;
                    case 3:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid option");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid option");
            }
        }
        sheepHerd.add(sheep);
    }

    public void addShed(){
        setSheds();
        dairyCowShed.installMilkingMachine();;
        goatShed.installMilkingMachine();
        System.out.println("Dairy Cow shed and Goat shed has been created and installed");
    }

    public void editDiaryCow(){
        System.out.println("Enter name of cow to be edited");
        String name = keyboard.nextLine();
        int index = checkDairyCow(name);

        if(checkDairyCow(name)>=0){
            boolean loop = true;
            while(loop==true){
                System.out.println("\nEnter\n1. To edit name\n2. To edit udder capacity\n3. To edit number of times cow was milked\n4. To exit");
                int choice = keyboard.nextInt();
                keyboard.nextLine();

                switch (choice){
                    case 1:
                        boolean loop2 = true;
                        while(loop==true) {
                            System.out.println("Enter name: ");
                            String newName = keyboard.nextLine();
                            if (checkName(newName) == 0) {
                                dairyCowsHerd.get(index).setName(newName);
                                loop2 = false;
                            }
                            else System.out.println("An animal with this name alreay exists. Enter name again");
                        }
                        break;
                    case 2:
                        System.out.println("Enter udder capacity: ");
                        int newUdderCapacity = keyboard.nextInt();
                        keyboard.nextLine();
                        dairyCowsHerd.get(index).setCapacityOfUdders(newUdderCapacity);
                        break;
                    case 3:
                        System.out.println("Enter number of times cow was milked");
                        int newNumber = keyboard.nextInt();
                        keyboard.nextLine();
                        dairyCowsHerd.get(index).setNumberTimesMilked(newNumber);
                        break;
                    case 4:
                        loop= false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again.");
                        break;
                }
            }
        }
        else{
            System.out.println("Cow doesn't exist.");
        }
    }
    public void editGoat(){
        System.out.println("Enter name of goat to be edited");
        String name = keyboard.nextLine();
        int index = checkGoat(name);

        if(index>=0){
            boolean loop = true;
            while(loop==true){
                System.out.println("\nEnter\n1. To edit name\n2. To edit udder capacity\n3. To edit number of times goat was milked\n4. To exit");
                int choice = keyboard.nextInt();
                keyboard.nextLine();

                switch (choice){
                    case 1:
                        boolean loop2 = true;
                        while(loop==true){
                            System.out.println("Enter name: ");
                            String newName = keyboard.nextLine();
                            if(checkName(newName)==0) {
                                goatHerd.get(index).setName(newName);
                                loop = false;
                            }
                            else System.out.println("An animal with this name alreay exists. Enter name again");
                        }
                        break;
                    case 2:
                        System.out.println("Enter udder capacity: ");
                        int newUdderCapacity = keyboard.nextInt();
                        keyboard.nextLine();
                        goatHerd.get(index).setCapacityOfUdders(newUdderCapacity);
                        break;
                    case 3:
                        System.out.println("Enter number of times goat was milked");
                        int newNumber = keyboard.nextInt();
                        keyboard.nextLine();
                        goatHerd.get(index).setNumberTimesMilked(newNumber);
                        break;
                    case 4:
                        loop= false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again.");
                        break;
                }
            }
        }
        else{
            System.out.println("Goat doesn't exist.");
        }
    }

    public void editBeefCow(){

        System.out.println("Enter name of beef cow to be edited");
        String name = keyboard.nextLine();
        int index = checkBeefCow(name);

        if(index>=0) {
            boolean loop = true;
            while (loop == true) {
                System.out.println("\nEnter\n1. To edit name\n2. To edit pedigree\n3. To edit weight\n4. To edit age\n5. To exit");
                int choice = keyboard.nextInt();
                keyboard.nextLine();

                switch (choice){
                    case 1:
                        System.out.println("Enter name: ");
                        String newName = keyboard.nextLine();
                        if(checkName(newName)==0) {
                            beefCowsHerd.get(index).setName(newName);
                            loop = false;
                        }
                        else System.out.println("An animal with this name alreay exists. Enter name again");
                        break;
                    case 2:
                        System.out.println("Enter pedigree: ");
                        String pedigree = keyboard.nextLine();
                        beefCowsHerd.get(index).setPedigree(pedigree);
                        break;
                    case 3:
                        System.out.println("Enter new weight: ");
                        int weight = keyboard.nextInt();
                        keyboard.nextLine();
                        beefCowsHerd.get(index).setWeight(weight);
                        break;
                    case 4:
                        System.out.println("Enter new age: ");
                        int age = keyboard.nextInt();
                        keyboard.nextLine();
                        beefCowsHerd.get(index).setWeight(age);
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again.");
                        break;
                }
            }
        }
    }

    public void editSheep(){
        System.out.println("Enter name of sheep to be edited");
        String name = keyboard.nextLine();
        int index = checkSheep(name);

        if(index>=0) {
            boolean loop = true;
            while (loop == true) {
                System.out.println("\nEnter\n1. To edit name\n2. To edit pedigree\n3. To edit weight\n4. To edit age\n5. To exit");
                int choice = keyboard.nextInt();
                keyboard.nextLine();

                switch (choice){
                    case 1:
                        System.out.println("Enter name: ");
                        String newName = keyboard.nextLine();
                        if(checkName(newName)==0) {
                            sheepHerd.get(index).setName(newName);
                            loop = false;
                        }
                        else System.out.println("An animal with this name alreay exists. Enter name again");
                        break;
                    case 2:
                        System.out.println("Enter pedigree: ");
                        String pedigree = keyboard.nextLine();
                        sheepHerd.get(index).setPedigree(pedigree);
                        break;
                    case 3:
                        System.out.println("Enter new weight: ");
                        int weight = keyboard.nextInt();
                        keyboard.nextLine();
                        sheepHerd.get(index).setWeight(weight);
                        break;
                    case 4:
                        System.out.println("Enter new age: ");
                        int age = keyboard.nextInt();
                        keyboard.nextLine();
                        sheepHerd.get(index).setWeight(age);
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again.");
                        break;
                }
            }
        }
    }



    public void editDairyShedDetails(){
        System.out.println("Enter\n1. To change capacity of milk tank\n2. To change current holding\n 3. To Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop  = true;

        while(loop==true){
            switch (choice){
                case 1:
                    System.out.println("Enter new tank capacity: ");
                    double tankCapacity = keyboard.nextDouble();
                    keyboard.nextLine();
                    dairyCowShed.getMyMilkTank().setTankCapacity(tankCapacity);
                    break;
                case 2:
                    System.out.println("Enter new current tank capacity: ");
                    double currentTankCapacity = keyboard.nextDouble();
                    keyboard.nextLine();
                    dairyCowShed.getMyMilkTank().setTankCapacity(currentTankCapacity);
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void editGoatShedDetails(){
        System.out.println("Enter\n1. To change capacity of milk tank\n2. To change current holding\n 3. To Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop  = true;

        while(loop==true){
            switch (choice){
                case 1:
                    System.out.println("Enter new tank capacity: ");
                    double tankCapacity = keyboard.nextDouble();
                    keyboard.nextLine();
                    goatShed.getMyMilkTank().setTankCapacity(tankCapacity);
                    break;
                case 2:
                    System.out.println("Enter new current tank capacity: ");
                    double currentTankCapacity = keyboard.nextDouble();
                    keyboard.nextLine();
                    goatShed.getMyMilkTank().setTankCapacity(currentTankCapacity);
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

    private int checkDairyCow(String name){
        for(DairyCow cow : dairyCowsHerd){
            if(cow.getName().equals(name)){
                return dairyCowsHerd.indexOf(cow);
            }
        }
        return -1;
    }
    private int checkBeefCow(String name) {
        for(BeefCow cow : beefCowsHerd){
            if(cow.getName().equalsIgnoreCase(name)){
                return beefCowsHerd.indexOf(cow);
            }
        }
        return -1;
    }
    private int checkGoat(String name) {
        for(Goat goat : goatHerd){
            if(goat.getName().equalsIgnoreCase(name)){
                return goatHerd.indexOf(goat);
            }
        }
        return -1;
    }
    private int checkSheep(String name){
        for(Sheep sheep: sheepHerd){
            if(sheep.getName().equalsIgnoreCase(name)){
                return sheepHerd.indexOf(sheep);
            }
        }
        return -1;
    }

    private int checkName(String name){
        // 1 for dairy cow, 2 for beef cow, 3 for goat, 4 for sheep

        if(checkDairyCow(name)>=0 || checkBeefCow(name)>=0 || checkGoat(name)>=0 || checkSheep(name)>=0 ){
            return -1;
        }
        return 0;
    }

    public void deleteDairyCow(){
        System.out.println("Enter name of cow that needs to be deleted: ");
        String name = keyboard.nextLine();
        int index = checkDairyCow(name);
        if(index>=0){
            dairyCowsHerd.remove(index);
        }
        else System.out.println("Cow not found");
    }

    public void deleteBeefCow(){
        System.out.println("Enter name of cow that needs to be deleted: ");
        String name = keyboard.nextLine();
        int index = checkBeefCow(name);
        if(index>=0){
            beefCowsHerd.remove(index);
        }
        else System.out.println("Cow not found");
    }

    public void deleteGoat(){
        System.out.println("Enter name of goat that needs to be deleted: ");
        String name = keyboard.nextLine();
        int index = checkGoat(name);
        if(index>=0){
            goatHerd.remove(index);
        }
        else System.out.println("Goat not found");
    }

    public void deleteSheep(){
        System.out.println("Enter name of sheep that needs to be deleted: ");
        String name = keyboard.nextLine();
        int index = checkSheep(name);
        if(index>=0){
            sheepHerd.remove(index);
        }
        else System.out.println("Sheep not found");
    }

    public void printDairyCow(){
        System.out.println("Enter name of cow that needs to be printed: ");
        String name = keyboard.nextLine();
        int index = checkDairyCow(name);
        if(index>=0){
            dairyCowsHerd.get(index).toString();
        }
        else System.out.println("Cow not found");
    }

    public void printBeefCow(){
        System.out.println("Enter name of cow that needs to be printed: ");
        String name = keyboard.nextLine();
        int index = checkBeefCow(name);
        if(index>=0){
            beefCowsHerd.get(index).toString();
        }
        else System.out.println("Cow not found");
    }

    public void printGoat(){
        System.out.println("Enter name of goat that needs to be printed: ");
        String name = keyboard.nextLine();
        int index = checkGoat(name);
        if(index>=0){
            goatHerd.get(index).toString();
        }
        else System.out.println("Goat not found");
    }

    public void printSheep(){
        System.out.println("Enter name of sheep that needs to be deleted: ");
        String name = keyboard.nextLine();
        int index = checkSheep(name);
        if(index>=0){
            sheepHerd.get(index).toString();
        }
        else System.out.println("Sheep not found");
    }

    @Override
    public String toString() {
        return "Farm{" +
                "id=" + id +
                ", nameOfFarm='" + nameOfFarm +
                ", nameOfOwner='" + nameOfOwner +
                ", sheds=" + sheds +
                ", dairyCowShed=" + dairyCowShed.toString() +
                ", goatShed=" + goatShed.toString() +
                ", dairyCowsHerd=" + dairyCowsHerd +
                ", sheepHerd=" + sheepHerd +
                ", beefCowsHerd=" + beefCowsHerd +
                ", goatHerd=" + goatHerd +
                '}';
    }

    public void collectMilk(){

        double milkTanker=0;
        milkTanker+=dairyCowShed.getMyMilkTank().getCurrentHolding();
        milkTanker+=goatShed.getMyMilkTank().getCurrentHolding();
        System.out.println("Milk has been collected.");

        dairyCowShed.getMyMilkTank().setCurrentHolding(0);
        goatShed.getMyMilkTank().setCurrentHolding(0);
        System.out.println("Both milk tanks are now emplty.");
    }
}
