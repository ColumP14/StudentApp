package ie.atu;
import java.util.Scanner;

public class Person {
    private String userName;
    private String userEmail;
    private String userCourse;

    //Constructors
    //Q1. Using getter and setter methods for all parameters
    public Person(){
        this.userName = "";
        this.userEmail = "";
        this.userCourse = "";
    }

    //Q2. Using getter and setter methods for Email & Course
    //Q2. Constructor accepts userName
    public Person(String userName){
        this.userName = userName;
        this.userEmail = "";
        this.userCourse = "";
    }

    //Q3. Constructor accepts Name, Email and Course parameters
    public Person(String userName, String userEmail, String userCourse) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userCourse = userCourse;
    }


    //Method to get user input
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        this.userName = scanner.nextLine();

        System.out.println("Please enter your email: ");
        this.userEmail = scanner.nextLine();

        System.out.println("Please enter your course: ");
        this.userCourse = scanner.nextLine();
    }

    //Method to display user details
    public void displayUser(){
        System.out.println("-----------------");
        System.out.println(getUserName());
        System.out.println(getUserEmail());
        System.out.println(getUserCourse());
        System.out.println("-----------------");
        System.out.println("\n");
    }

    //Getter & Setter Methods / Accessor Methods
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCourse() {
        return userCourse;
    }

    public void setUserCourse(String userCourse) {
        this.userCourse = userCourse;
    }
}
