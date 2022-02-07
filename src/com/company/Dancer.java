package com.company;

public class Dancer extends Person {
    String groupName;

    public Dancer(String name,String designation,String groupName){
        this.name = name;
        this.designation = designation;
        this.groupName = groupName;
    }

    public void dance(){
        System.out.println(name+" dances very well!");
    }

    @Override
    public void walk(){
        super.walk();
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void eat(){
        super.eat();
    }

    @Override
    public String toString(){
        return "Dancer name: "+name+",designation: "+designation+", group name: "+groupName;
    }


}
