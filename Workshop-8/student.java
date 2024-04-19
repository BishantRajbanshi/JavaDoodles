import java.io.*;

public class student {
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String semester;

    public student(String firstName, String lastName, String address, String contactNumber, String semester){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    public String toCSVString(){
        return String.format("%s,%s,%s,%s,%s", firstName,lastName,address,contactNumber,semester);
    }

    public static void main(String[] args) {
        try(
            BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv"))
            ){
                System.out.println("Enter student information(firstname,lastname,address,contactNumber,semester): ");
            
                while (true) {
                    System.out.print("Enter first name (or type 'exit' to quit): ");
                    String firstName = reader.readLine();
                    if (firstName.equalsIgnoreCase("exit")) break;
    
                    System.out.print("Enter last name: ");
                    String lastName = reader.readLine();
    
                    System.out.print("Enter address: ");
                    String address = reader.readLine();
    
                    System.out.print("Enter contact number: ");
                    String contactNumber = reader.readLine();
    
                    System.out.print("Enter semester: ");
                    String semester = reader.readLine();
    
                    buffer2 student = new buffer2(firstName, lastName, address, contactNumber, semester);
                    writer.write(student.toCSVString());
                    writer.newLine();
                }
                System.out.println("Student information written to students.csv successfully.");
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
