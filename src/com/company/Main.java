package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Altynbek","Senior Software Engineer","Google");
        System.out.println(programmer.toString());
        programmer.goal();
        programmer.walk();
        programmer.learn();
        programmer.eat();

        System.out.println();

        Dancer dancer = new Dancer("Jimmy","Disco Dancer","Indian Boys");
        System.out.println(dancer.toString());
        dancer.dance();
        dancer.walk();
        dancer.learn();
        dancer.eat();

        System.out.println();

        Singer singer = new Singer("Alex","to win Grammy","Kvartet");
        System.out.println(singer.toString());
        singer.singing();
        singer.playsguitar();
        singer.walk();
        singer.learn();
        singer.eat();

    }
}
