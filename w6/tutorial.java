import java.util.ArrayList;
import java.util.Collections;

// public class tutorial {
//     public static void main(String[] args) {
//         ArrayList<String> studentList = new ArrayList<>();

//         studentList.add("Nima");
//         studentList.add("Emma");
//         studentList.add("Pema");
//         studentList.add("Lama");

//         for (String student : studentList){
//             System.out.println(student);
//         }

//         studentList.remove("Emma");
//         System.out.println("After removal");
//         for (String student : studentList){
//             System.out.println(student);
//         }
//     }
// }

public class tutorial{
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Hen");
        studentList.add("Pen");
        studentList.add("Sen");
        studentList.add("Tenz");

        System.out.println("Original list of students:");
        for (String student : studentList) {
            System.out.println(student);
        }

        Collections.reverse(studentList);

        System.out.println("\nReversed list of students:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}