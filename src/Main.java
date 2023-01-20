public class Main {
    public static void main(String[] args) {
        Person[] person = {
                new Programer(),
                new Dancer(),
                new Singer()};
        for (Person method:person) {
            method.walk();
        }
    }
}