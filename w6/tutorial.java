import java.util.ArrayList;


public class tutorial {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Nima");
        studentList.add("Emma");
        studentList.add("Pema");
        studentList.add("Lama");

        for (String student : studentList){
            System.out.println(student);
        }

        studentList.remove("Emma");
        System.out.println("After removal");
        for (String student : studentList){
            System.out.println(student);
        }
    }
}