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


// import java.util.LinkedList;
// import java.util.Collections;

// public class Workshop {

//     public static void main(String[] args) {
        
//         LinkedList<String> colors = new LinkedList<>();

//         colors.add("Red");
//         colors.add("Blue");
//         colors.add("Green");
//         colors.add("Yellow");
//         colors.add("Purple");

//         System.out.println("Colors in the list: ");
//         for (String color: colors){
//             System.out.println(color);
//         }

//         boolean redExists = colors.contains("Red");
//         System.out.println("Does red exists in List: " + redExists);

//         Collections.shuffle(colors);
//         System.out.println("After suffle: ");
//         for (String color : colors){
//             System.out.println(color);
//         }

//         Collections.sort(colors);
//         System.out.println("After sorting the list: ");
//         for(String color: colors){
//             System.out.println(color);
//         }
//      }
// }

// import java.util.Stack;

// public class Workshop {

//     public static void main(String[] args) {
//         Stack<String> taskStack = new Stack<>();

//         taskStack.push("Read");
//         taskStack.push("Write");
//         taskStack.push("Code");

//         String poppedTask = taskStack.pop();
//         System.out.println("Popped task: " + poppedTask);

//         taskStack.push("Debug");
//         taskStack.push("Test");

//         String topTask = taskStack.peek();
//         System.out.println("Top task: " + topTask);

//         System.out.println("Task in stack: ");
//         while (!taskStack.isEmpty()) {
//             System.out.println(taskStack.pop());
//         }
//     }
// }

// import java.util.Stack;

// public class Workshop {
//     public static void main(String[] args) {
//         String sentence = "Hello World";
//         String reversedSentence = reverseWords(sentence);
//         System.out.println("Reversed sentence: " + reversedSentence);
//     }

//     public static String reverseWords(String sentence) {
//         String[] words = sentence.split(" ");

//         Stack<String> wordStack = new Stack<>();

//         for (String word : words) {
//             wordStack.push(word);
//         }

//         StringBuilder reversedSentence = new StringBuilder();
//         while (!wordStack.isEmpty()) {
//             reversedSentence.append(wordStack.pop()).append(" ");
//         }

//         return reversedSentence.toString().trim();
//     }
// }


// import java.util.LinkedList;
// import java.util.Queue;

// public class Workshop {
//     public static void main(String[] args) {
//         Queue<String> printQueue = new LinkedList<>();

//         printQueue.offer("Document1");
//         printQueue.offer("Document2");
//         printQueue.offer("Document3");

//         String dequeuedJob = printQueue.poll();
//         System.out.println("Dequeued print job: " + dequeuedJob);

//         printQueue.offer("Document4");
//         printQueue.offer("Document5");

//         String nextJob = printQueue.peek();
//         System.out.println("Next print job to be processed: " + nextJob);

//         System.out.println("Print jobs in the queue:");
//         for (String job : printQueue) {
//             System.out.println(job);
//         }
//     }
// }


// import java.util.TreeSet;

// public class Workshop {
//     public static void main(String[] args) {
//         TreeSet<String> uniqueNames = new TreeSet<>();

//         uniqueNames.add("John");
//         uniqueNames.add("Alice");
//         uniqueNames.add("Bob");
//         uniqueNames.add("Charlie");
//         uniqueNames.add("Alice");

//         System.out.println("Unique names in alphabetical order:");
//         for (String name : uniqueNames) {
//             System.out.println(name);
//         }
//     }
// }









