import java.time.Year;

public class Person {
    String name;
    int age;

    public Person (String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getYearOfBorn(){
        return this.calculateYearOfBorn();
    }

    private int calculateYearOfBorn(){
        return Year.now().getValue() - this.age;
    }
}
