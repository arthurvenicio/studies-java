public class Main {
    public static void main(String[] args) {
        Person person = new Person("Arthur", 22);

        System.out.println("Person name: " + person.getName());
        System.out.println("Person age: " +person.getAge());
        System.out.println("Person year of born: " +person.getYearOfBorn());
    }
}