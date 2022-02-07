package com.company;

public class Programmer extends Person {

    String companyName;

    public Programmer (String name,String designation,String companyName){
        this.name = name;
        this.designation = designation;
        this.companyName = companyName;
    }

    public void goal(){
        System.out.println(name+" wants hack the world!");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk(){
        super.walk();
    }

    @Override
    public String toString(){
        return "Programmer name: "+name+", Designation: "+designation+", Company name: "+companyName;

    }

}
