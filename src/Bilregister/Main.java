package Bilregister;

import Bilregister.CarNumber;
import Bilregister.CarOwner;

public class Main {
    public static void main(String[] args) {
        CarOwner carOwner1 = new CarOwner("Jack", "Grillugnsgatan 4", 36);
        CarOwner carOwner2 = new CarOwner("Zack", "Vedugnsgatan 7", 32);
        CarOwner carOwner3 = new CarOwner("Peter", "Spisugnsgatan 16", 26);


        CarNumber car1 = new CarNumber("EVA09D", "Yaris", "Toyota", carOwner1);
        CarNumber car2 = new CarNumber("SAM45P", "A1", "Audi", carOwner2);
        CarNumber car3 = new CarNumber("CAD987", "Sorento", "Kia", carOwner3);

        car1.setOwner(carOwner3);
        car2.setRegNr(carOwner1);
        car3.setRegNr(carOwner2);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}