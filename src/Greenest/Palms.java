package Greenest;

/*En klass som heter Palms och arver från Plants samt implements av LiquidNeed
Konstruktor med superklassens*/
public class Palms extends Plants implements LiquidNeed{
    public Palms(String name, double length) {
        super(name, length);
    }

    /*räknemetod som räknar ut palmernas behov 0,5 * palmens längd*/
    public double calculateNeed(){
        return 0.5 * getLength();
    }
    /*här hämtar Palms vad för vätska den behöver med hjälp av getLiquid och eftersom det är enum så
    innehållet finala */
    public LiquidForm getLiquid() {
        return LiquidForm.tapwater;
    }

}

