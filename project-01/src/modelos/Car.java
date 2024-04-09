package modelos;

public class Car extends  Vehicle {

    public Car(String name, String model) {
        super(name, model);
    }

    @Override
    public void saudation() {
        System.out.println("bi bi bi");
    }
}
