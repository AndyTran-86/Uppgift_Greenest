package Greenest;

public class MeatEating extends Plants implements LiquidNeed{

    public MeatEating(String name, double lenght) {
        super(name, lenght);
    }
    public double calculateNeed(){
        return 0.1 + (0.2 * getLength());
    }
    public LiquidForm getLiquid() {
        return LiquidForm.proteindrink;
    }
}
