package Greenest;

public class Cactus extends Plants implements LiquidNeed{

    public Cactus(String name, double length) {
        super(name, length);
    }
    public double calculateNeed(){
        return 0.02;
    }
    public LiquidForm getLiquid() {
        return LiquidForm.mineralwater;
    }
}
