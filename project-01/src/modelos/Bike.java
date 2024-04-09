package modelos;

public class Bike extends  Vehicle {
    public Bike(String name, String model) {
        super(name, model);
    }

    @Override
    public void saudation() {
        System.out.println("Bo bo bo");
    }
}
