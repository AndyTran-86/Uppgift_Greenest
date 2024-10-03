package Greenest;

import javax.swing.*;

/*Main metod. Skapar växtobjekter med namn och höjd*/
public class Main {
    public static void main(String[] args) {
        Palms laura = new Palms("Laura", 5.0);
        Palms olof = new Palms("Olof", 1.0);
        Cactus igge = new Cactus("Igge", 0.2);
        MeatEating meatLoaf = new MeatEating("Meatloaf", 0.7);

/*Lägger växterna i en array för lättare hantering*/
        Plants[] allPlants = {laura, olof, igge, meatLoaf};

/*Variabeldeklaration som ser om användaren skriver in rätt namn
Hade den först i loopen men det verkar fungera mycket bättre utanför och innan.
Eftersom den används utanför och i loopen*/

        boolean foundPlant = false;
        String userInput = "";

        /*while loopen körs tills den hittar rätt växt
        när den hittar rätt plant så kör den beräkning av vätska samt vätsketyp */
        while (!foundPlant) {
            userInput = JOptionPane.showInputDialog("Which plant should be watered?");


            for (Plants thePlant : allPlants) {
                if (thePlant.getName().equalsIgnoreCase(userInput)) {
                    LiquidNeed liquidNeedPlant = (LiquidNeed) thePlant;

                    double liquidAmount = liquidNeedPlant.calculateNeed();
                    String liquidType = liquidNeedPlant.getLiquid().toString();

                    /*skriver ut informationen den har tagit*/
                    String information = thePlant.getName() + " needs " + liquidAmount + " liters of " + liquidType + " per day.";

                    JOptionPane.showMessageDialog(null, information);
                    foundPlant = true;
                    break;
                }

            }
            /*hittar den inte säger den att växten inte finns*/
            if (!foundPlant) {
                JOptionPane.showMessageDialog(null, "Plant doesn't exist. Please try again");
            }

        }
    }
}