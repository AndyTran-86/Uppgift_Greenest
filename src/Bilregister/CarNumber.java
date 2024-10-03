package Bilregister;

public class CarNumber {

    private String regNr;
    private String model;
    private String brand;
    private CarOwner owner;

    public CarNumber(String regNr, String model, String brand, CarOwner owner) {
        this.regNr = regNr;
        this.model = model;
        this.brand = brand;
        this.owner = owner;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    public String toString(){
    return "RegNumber: " + regNr + ", Model: " + model + ", Brand " + brand + ", Owner: " + owner.getName();}

    public void setRegNr(CarOwner carOwner1) {
    }
}

