package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Person();
        student1.getUserInput();

        Person student2 = new Person("");
        student2.getUserInput();

        Person student3 = new Person("", "", "");
        student3.getUserInput();

        student1.displayUser();
        student2.displayUser();
        student3.displayUser();
    }
}