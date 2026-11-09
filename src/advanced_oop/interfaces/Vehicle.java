package advanced_oop.interfaces;

public class Vehicle {

    private String model;

    // Default Constructor -- without arguments
    public Vehicle() {

    }


    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
