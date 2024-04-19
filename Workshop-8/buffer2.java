import java.io.*;

public class buffer2 {
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String semester;

    public Student(String firstName, String lastName, String address, String contactNumber, String semester){
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
            BufferedReader reader = new BufferedReader(new InputStreamReader((System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("student.csv"))
            ){
                System.out.println("Enter student information(firstname,lastname,address,contactNumber,semester): ");
            
                while (true) {
                    System.out.println("Enter first name(or type exit to quit): ");

                    String firstName = reader.readLine();
                    
                }
            }
        )
    }
}