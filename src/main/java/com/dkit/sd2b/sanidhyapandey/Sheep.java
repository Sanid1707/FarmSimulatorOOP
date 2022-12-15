package com.dkit.sd2b.sanidhyapandey;

public class Sheep extends Animal {

    private String pedigree;
    private double weight;
    private int age;

    public Sheep(String name, String pedigree, double weight, int age) {
        super(name);
        this.pedigree = pedigree;
        if(weight>=5 && weight<=100){
            this.weight = weight;
        }
        else{
            this.weight = 50;
        }
        if(age>=1 && age<=7){
            this.age = age;
        }
        else{
            this.age = 5;
        }
    }

    public Sheep(String pedigree,double weight, int age) {
        super();
        this.pedigree= pedigree;
        if(weight>=40 && weight<=100){
            this.weight = weight;
        }
        else{
            this.weight = 50;
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
    public int getId() {
        return super.getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sheep other = (Sheep) obj;
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if ((this.pedigree == null) ? (other.pedigree != null) : !this.pedigree.equals(other.pedigree)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id= "+ getId()+
                ", name" + getName()+
                ", pedigree='" + pedigree + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
