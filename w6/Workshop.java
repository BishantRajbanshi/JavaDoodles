// import java.util.ArrayList;

// public class Workshop {

//     public static void main(String[] args) {
        
//         ArrayList<String> studentsNames = new ArrayList<String>();

//         studentsNames.add("Roman");
//         studentsNames.add("Subash");
//         studentsNames.add("Nima");
//         studentsNames.add("Shema");
//         studentsNames.add("Pima");

//         System.out.println("Original List: "+ studentsNames);

//         studentsNames.remove("Pima");

//         System.out.println("After removal: " + studentsNames);
//     }
// }


// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Workshop {

//     public static void main(String[] args) {
        
//         LinkedList<String> elements = new LinkedList<String>();

//         elements.add("Red");
//         elements.add("Blue");
//         elements.add("Black");

//         System.out.println("Original list: "+ elements);

//         elements.addFirst("White");
//         elements.addLast("Pink");

//         System.out.println("After addition:" + elements);
//       }
// }


// import java.util.ArrayList;
// import java.util.Collections;

// public class Workshop {

//     public static void main(String[] args) {
        
//         ArrayList<Integer> arrayList = new ArrayList<>();
//         arrayList.add(1);
//         arrayList.add(2);
//         arrayList.add(3);
//         arrayList.add(4);
//         arrayList.add(5);

//         int rotateBy = 2;
        
//         System.out.println("Original array: " + arrayList);
//         rotateArrayList(arrayList, rotateBy);
//         System.out.println("Rotated array list: " + arrayList);
//     }

//     public static void rotateArrayList(ArrayList<Integer> arrayList, int rotateBy) {
//         int size = arrayList.size();
//         rotateBy = rotateBy % size;

//         if (rotateBy < 0 ){
//             rotateBy += size;
//         }
//         Collections.rotate(arrayList, rotateBy);
//     }
// }







