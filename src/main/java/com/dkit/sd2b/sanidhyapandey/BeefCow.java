package com.dkit.sd2b.sanidhyapandey;

public class BeefCow extends Animal {

    private String pedigree;
    private double weight;
    private int age;

    public BeefCow(String name, String pedigree, double weight, int age) {
        super(name);
        this.pedigree = pedigree;
        if(weight>=500 && weight<=3000){
            this.weight = weight;
        }
        else{
            this.weight = 1000;
        }
        if(age>=1 && age<=7){
            this.age = age;
        }
        else{
            this.age = 5;
        }
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public BeefCow(String pedigree,double weight, int age) {
        super();
        this.pedigree = pedigree;
        if(weight>=500 && weight<=3000){
            this.weight = weight;
        }
        else{
            this.weight = 1000;
        }
        if(age>=1 && age<=7){
            this.age = age;
        }
        else{
            this.age = 5;
        }
    }



    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "BeefCow{" +
                "id= " + getId()+
                ", name= " + getName()+
                ", pedigree='" + pedigree + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
