package com.company;

public class Singer extends Person{
    String bandName;

    public Singer(String name,String designation,String bandName){
        this.name = name;
        this.designation = designation;
        this.bandName = bandName;
    }

    public void playsguitar(){
        System.out.println(name+" plays guitar extraordinary");
    }

    public void singing(){
        System.out.println(name+" sings like a Michael Jackson");
    }

    @Override
    public void walk(){
        super.walk();
    }

    @Override
    public void learn(){
        super.learn();
    }

    @Override
    public void eat(){
        super.eat();
    }

    @Override
    public String toString(){
        return "Singer name: "+name+", Singer designation: "+designation+", band name: "+bandName;
    }

}
