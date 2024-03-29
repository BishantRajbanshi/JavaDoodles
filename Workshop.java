// class Animal{
//     String name;
//     int age;

//     public Animal(){
//         System.out.println("This is a Animal Constructor.");
//     }
// }

// class Dog extends Animal{
//     String breed;

//     public Dog(){
//         System.out.println("This is a Dog Constructor");
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.name = "Nima";
//         dog.age = 20;
//         dog.breed = "Labrador";

//         System.out.println(dog.name + " is " + dog.age + " yrs old . His breed is " + dog.breed);
//     }
// }

//q2

// class Shape{
//     public void getArea(){
//         System.out.println("This is the area section");
//     }
//     public void getPerimeter(){
//         System.out.println("This is the perimeter section");
//     }
// }

// class Circle extends Shape{
//     public void getArea(){
//         System.out.println("This is the area of the circle.");
//     }

//     public void getPerimeter(){
//         System.out.println("This is the perimeter of the circle.");
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.getArea();
//         c.getPerimeter();
//     }
// }

//Q3

// class Animal{
//     public Animal(String name){
//         System.out.println(name + " is an animal.");
//     }
// }

// class Dog extends Animal{
//     public Dog(String name){
//         super(name);
//         System.out.println("This is the dog constructor");
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Dog dog = new Dog("Godjilla");
//     }
// }

//q3

// class Person{
//     protected String address;
// }

// class Employee extends Person{
//     public String department;
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Employee employee = new Employee();
//         employee.address = "Jakarta";
//         employee.department = "IT";

//         System.out.println("Address: " + employee.address);
//         System.out.println("Department: " + employee.department);
//     }
// }

//q4

// class Parent{
//     private String name;
//     protected int age;
//     public String address;

//     public void setName(String name){
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }
// }

// class Child extends Parent{
//     public void setPriavteName(String name){
//         setName(name);
//     }
//     public String getPrivateName(){
//         return getName();
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
//         Child child = new Child();
//         child.age = 20;
//         child.address = "Jakarta";

//         child.setPriavteName("Bishant Rajbanshi");
//         System.out.println("Name: " + child.getPrivateName());
//         System.out.println("Age: " + child.age);
//         System.out.println("Address: " + child.address);
//     }
// }

//q5

// final class FinalClass{
//     final public void finalMethod(){

//     }
// }

// class AnotherClass extends FinalClass{
//     public void finalMethod(){
        
//     }
// }

// public class Workshop{
//     public static void main(String[] args) {
        
//     }
// }

//q6

// class Calculator{
//     public int add(int num1, int num2){
//         return num1 + num2;
//     }

//     public int add(int num1, int num2,int num3){
//         return num1 + num2 + num3;
//     }

//     public double add(double num1, double num2){
//         return num1 + num2;
//     }

//     public double add(double num1, double num2, double num3){
//         return num1 + num2 + num3;
//     }
// }

// public class Workshop {

//     public static void main(String[] args) {
//         Calculator clac = new Calculator();
//         System.out.println("Add method to add two integers 5 and 8:" + clac.add(5,8));
//         System.out.println("Add method to add three integers 10,15 and 20:" + clac.add(10,15,20));
//         System.out.println("Add method to add two doubles 3.5 and 2.7:" + clac.add(3.5,2.7));
//         System.out.println("Add method to add three doubles 1.1,2.2 and 3.3:" + clac.add(1.1,2.2,3.3));
//     }
// }

//last

// import java.util.Scanner;

// public class Workshop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Please enter 1 for Sign up.");
//         System.out.println("Please enter 2 for quit.");

//         while(true){
//             System.out.println("Enter the number: ");
//             int num = sc.nextInt();
//             sc.nextLine();

//             if(num == 1 || num == 2){
//                 if (num == 1){

//                     while (true) {
//                         System.out.println("Enter your Name: ");
//                         String fullName = sc.nextLine();

//                         if (!(fullName.length() > 4)) {
//                             System.out.println("Full Name must be greater than 4 charcters.");
//                             continue;
//                         }
//                     }
//                     break;
//                 }

//                 while(true){
//                     System.out.println("Enter your mobile number: ");
//                     String number = sc.nextLine();

//                     if (!(number.matches("^0\\d{9}$"))) {
//                         System.out.println("Contact number should have 10 digits starting with 0.");
//                         continue;
//                     }
//                     break;
//                 }

//                 while(true){
//                     System.out.println("Enter your password: ");
//                     String password = sc.nextLine();

//                     if (!(password.matches("^[a-zA-z]+[@&]\\d+$"))) {
//                         System.out.println("Password must start with alphabets, followed by either @ or & and ending with numric.");
//                         continue;
//                     }
//                     while (true) {
//                         System.out.println("Confirm your password: ");
//                         String rePassword = sc.nextLine();

//                         if(!(rePassword.equals(password))){
//                             System.out.println("Your password doesn't match");
//                             continue;
//                         }

//                         break;
//                     }
//                     break;
//                 }

//                 while(true){
//                     System.out.println("Enter your Date of Birth DD/MM/YYYY or MM/DD/YYYY: ");
//                     String dob = sc.nextLine();

//                     String parts[] = dob.split("/");
//                     if (parts.length !=3) {
//                         System.out.println("Invalid Format of Date of Birth");
//                         continue;
//                     }
//                     int day = Integer.parseInt(parts[0]);
//                     int month = Integer.parseInt(parts[1]);
//                     int year = Integer.parseInt(parts[2]);

//                     boolean validDay = (day >= 1 && day <= 31);
//                     boolean validMonth = (month >= 1 && month <= 12);
//                     boolean validYear = parts[2].matches("\\d{4}");

//                     boolean validFormat = ((validDay && validMonth || (validMonth && validDay)) ) && validYear;

//                     if (!validFormat) {
//                         System.out.println("Invalid Format of Date of Birth.");
//                         continue;
//                     }

//                     int currentYear  =java.time.LocalDate.now().getYear();
//                     if (!((currentYear - year) <= 21)) {
//                         System.out.println("You should be atleast 21 yeRs old");
//                         continue;
//                     }
//                     break;
//                 }

//                 System.out.println("You have successfully signed up.");
//                 break;
//             }else{
//                 System.out.println("Thank your for using the application.");
//                 break;
//             }else {
//                 System.out.println("Invalid Choice");
//         } 
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class Workshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 1 for Sign up.");
        System.out.println("Please enter 2 for quit.");

        while (true) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num == 1 || num == 2) {
                if (num == 1) {
                    System.out.println("Enter your Name: ");
                    String fullName = sc.nextLine();

                    if (!(fullName.length() > 4)) {
                        System.out.println("Full Name must be greater than 4 characters.");
                        continue;
                    }
                } else {
                    System.out.println("Thank you for using the application.");
                    break;
                }

                while (true) {
                    System.out.println("Enter your mobile number: ");
                    String number = sc.nextLine();

                    if (!(number.matches("^0\\d{9}$"))) {
                        System.out.println("Contact number should have 10 digits starting with 0.");
                        continue;
                    }
                    break;
                }

                while (true) {
                    System.out.println("Enter your password: ");
                    String password = sc.nextLine();

                    if (!(password.matches("^[a-zA-Z].*\\d$"))) {
                        System.out.println("Password must start with alphabets, followed by numeric.");
                        continue;
                    }

                    while (true) {
                        System.out.println("Confirm your password: ");
                        String rePassword = sc.nextLine();

                        if (!(rePassword.equals(password))) {
                            System.out.println("Your password doesn't match");
                            continue;
                        }
                        break;
                    }
                    break;
                }

                while (true) {
                    System.out.println("Enter your Date of Birth DD/MM/YYYY: ");
                    String dob = sc.nextLine();

                    String parts[] = dob.split("/");
                    if (parts.length != 3) {
                        System.out.println("Invalid Format of Date of Birth");
                        continue;
                    }
                    int day = Integer.parseInt(parts[0]);
                    int month = Integer.parseInt(parts[1]);
                    int year = Integer.parseInt(parts[2]);

                    boolean validDay = (day >= 1 && day <= 31);
                    boolean validMonth = (month >= 1 && month <= 12);
                    boolean validYear = year <= java.time.LocalDate.now().getYear() - 21;

                    if (!(validDay && validMonth && validYear)) {
                        System.out.println("Invalid Format of Date of Birth or You should be at least 21 years old");
                        continue;
                    }

                    break;
                }

                System.out.println("You have successfully signed up.");
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}
