package com.dkit.sd2b.sanidhyapandey;

import java.util.Scanner;

public class Menu {

    Scanner keyboard = new Scanner(System.in);
    Farm myFarm;
    StoreAFarm store;

    public Menu() {
    }

    public void startSimulator() {
        System.out.println("Welcome to the Farm Simulator");
        System.out.println("Please select an option from the menu");
        MainMenu();
    }

    private void printMainMenu() {
        System.out.println("1. Start a new farm");
        System.out.println("2. Load a saved farm");
        System.out.println("3. Exit");
    }

    private void MainMenu() {
        Menu0 option = Menu0.CONTINUE;
        while (option != Menu0.EXIT) {
            try {
                printMainMenu();
                option = Menu0.values()[Integer.parseInt(keyboard.nextLine().trim())];
                switch (option) {
                    case START:
                        System.out.println("\nStarting a new farm");
                        System.out.println("\nEnter the name of your farm:");
                        String farmName = keyboard.nextLine();
                        System.out.println("Enter name of the owner:");
                        String ownerName = keyboard.nextLine();
                        System.out.println("\n Farm created successfully");
                        myFarm = new Farm(farmName, ownerName);
                        printMyStartMenu();
                        StartMenu();
                        break;
                    case LOAD:
                        System.out.println("Loaded");
                        break;
                    case EXIT:

                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option");
            }

        }
    }

    private void printMyStartMenu() {
        System.out.println("1. Create Animal");
        System.out.println("2. Create Shed");
        System.out.println("3. Edit Animal");
        System.out.println("4. Edit Shed");
        System.out.println("5. Delete Animal");
        System.out.println("6. Print Animal");
        System.out.println("7. Print Shed");
        System.out.println("8. Print Farm");
        System.out.println("9. Print Herd");
        System.out.println("10. Sort Herd");
        System.out.println("11. Milk Animals");
        System.out.println("12. Collect Milk");
        System.out.println("13. Save Farm");
        System.out.println("14. Exit menu");
    }

    private void StartMenu() {
        System.out.println("\nEnter your choice");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        try {
            switch (choice) {
                case 1:
                    createAnimal();
                    break;
                case 2:
                    createShed();
                    break;
                case 3:
                    editAnimal();
                    break;
                case 4:
                    editShed();
                    break;
                case 5:
                    deleteAnimal();
                    break;
                case 6:
                    printAnimal();
                    break;
                case 7:
                    printShed();
                    break;
                case 8:
                    myFarm.toString();
                    break;
                case 9:
                    printHerd();
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    myFarm.collectMilk();
                    break;
                case 13:
                    store.storingFarm(myFarm);
                    break;
                default:
                    System.out.println("Invalid input. Enter again");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid option");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid option");
        }
    }

    private void createAnimal() {
        System.out.println("Enter the type of animal you want to create");
        System.out.println("1. Dairy Cow");
        System.out.println("2. Beef Cow");
        System.out.println("3. Goat");
        System.out.println("4. Sheep");
        System.out.println("5. Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop = true;

        while (loop) {
            try {
                switch (choice) {
                    case 1:
                        myFarm.addDairyCow();
                        break;
                    case 2:
                        myFarm.addBeefCow();
                        break;
                    case 3:
                        myFarm.addGoat();
                        break;
                    case 4:
                        myFarm.addSheep();
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option");
            }
        }
    }

    private void createShed() {
        myFarm.addShed();
    }

    private void editAnimal() {
        System.out.println("Enter the type of animal you want to create");
        System.out.println("1. Dairy Cow");
        System.out.println("2. Beef Cow");
        System.out.println("3. Goat");
        System.out.println("4. Sheep");
        System.out.println("5. Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop = true;

        while (loop) {
            try {
                switch (choice) {
                    case 1:
                        myFarm.editDiaryCow();
                        break;
                    case 2:
                        myFarm.editBeefCow();
                        break;
                    case 3:
                        myFarm.editGoat();
                        break;
                    case 4:
                        myFarm.editSheep();
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option");
            }
        }
    }

    public void editShed() {
        boolean loop = true;
        while (loop = true) {
            System.out.println("Enter\n1. Dairy Cow Shed\n 2. Goat Shed\n3. Exit");
            int choice = keyboard.nextInt();
//
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    myFarm.editDairyShedDetails();
                    break;
                case 2:
                    myFarm.editGoatShedDetails();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Input. Enter again.");
                    break;
            }
        }


    }

    public void deleteAnimal() {
        System.out.println("Enter the type of animal you want to create");
        System.out.println("1. Dairy Cow");
        System.out.println("2. Beef Cow");
        System.out.println("3. Goat");
        System.out.println("4. Sheep");
        System.out.println("5. Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop = true;

        while (loop) {
            try {
                switch (choice) {
                    case 1:
                        myFarm.deleteDairyCow();
                        break;
                    case 2:
                        myFarm.deleteBeefCow();
                        break;
                    case 3:
                        myFarm.deleteGoat();
                        break;
                    case 4:
                        myFarm.deleteSheep();
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option");
            }
        }
    }

    public void printAnimal(){
        System.out.println("Enter the type of animal you want to create");
        System.out.println("1. Dairy Cow");
        System.out.println("2. Beef Cow");
        System.out.println("3. Goat");
        System.out.println("4. Sheep");
        System.out.println("5. Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop = true;

        while (loop) {
            try {
                switch (choice) {
                    case 1:
                        myFarm.printDairyCow();
                        break;
                    case 2:
                        myFarm.printBeefCow();
                        break;
                    case 3:
                        myFarm.printGoat();
                        break;
                    case 4:
                        myFarm.printSheep();
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option");
            }
        }
    }

    public void printShed(){
        boolean loop = true;
        while (loop = true) {
            System.out.println("Enter\n1. Dairy Cow Shed\n 2. Goat Shed\n3. Exit");
            int choice = keyboard.nextInt();
//
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    myFarm.getDairyCowShed().toString();
                    break;
                case 2:
                    myFarm.getGoatShed().toString();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Input. Enter again.");
                    break;
            }
        }

    }

    public void printHerd(){
        System.out.println("Enter the type of animal you want to create");
        System.out.println("1. Dairy Cow");
        System.out.println("2. Beef Cow");
        System.out.println("3. Goat");
        System.out.println("4. Sheep");
        System.out.println("5. Exit");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        boolean loop = true;

        while (loop) {
            try {
                switch (choice) {
                    case 1:
                        myFarm.getDairyCowsHerd().toString();
                        break;
                    case 2:
                        myFarm.getBeefCowsHerd().toString();
                        break;
                    case 3:
                        myFarm.getGoatHerd().toString();
                        break;
                    case 4:
                        myFarm.getSheepHerd().toString();
                        break;
                    case 5:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Enter again");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid option");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid option");
            }
        }
    }

}

