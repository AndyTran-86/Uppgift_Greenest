package Greenest;

/*Skapat en publik superklass och döpt till Plants
Deklarerat name och length som kommer arvas av andra klasser*/

public class Plants {
    private String name;
    private double length;


    /*Konstruktor*/
    public Plants(String name, double length) {
        this.name = name;
        this.length = length;
    }


    /*Getter för name och length"*/
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }
}




