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


// import java.util.HashSet;
// import java.util.Set;

// public class Workshop {
//     public static void main(String[] args) {
//         Set<String> set1 = new HashSet<>();
//         set1.add("Dog");
//         set1.add("Cat");
//         set1.add("Elephant");
//         set1.add("Lion");

//         Set<String> set2 = new HashSet<>();
//         set2.add("Cat");
//         set2.add("Giraffe");
//         set2.add("Dog");
//         set2.add("Monkey");

//         System.out.println("Original Set 1: " + set1);
//         System.out.println("Original Set 2: " + set2);

//         Set<String> union = performUnion(set1, set2);
//         System.out.println("Union of sets: " + union);

//         Set<String> intersection = performIntersection(set1, set2);
//         System.out.println("Intersection of sets: " + intersection);

//         Set<String> difference = performDifference(set1, set2);
//         System.out.println("Difference of sets (set1 - set2): " + difference);

//     }

//     public static Set<String> performUnion(Set<String> set1, Set<String> set2) {
//         Set<String> union = new HashSet<>(set1);
//         union.addAll(set2);
//         return union;
//     }

//     public static Set<String> performIntersection(Set<String> set1, Set<String> set2) {
//         Set<String> intersection = new HashSet<>(set1);
//         intersection.retainAll(set2);
//         return intersection;
//     }

//     public static Set<String> performDifference(Set<String> set1, Set<String> set2) {
//         Set<String> difference = new HashSet<>(set1);
//         difference.removeAll(set2);
//         return difference;
//     }
// }

// import java.util.HashMap;

// public class Workshop {
//     public static void main(String[] args) {
//         HashMap<String, String> contacts = new HashMap<>();

//         contacts.put("Hell", "654646876");
//         contacts.put("Fenns", "6379865464");
//         contacts.put("Tels", "686546654");

//         System.out.println("Contact information:");
//         for (String name : contacts.keySet()) {
//             String phoneNumber = contacts.get(name);
//             System.out.println(name + ": " + phoneNumber);
//         }
// }


// import java.util.Arrays;
// public class Workshop {
//     public static void main(String[] args) {
//         int[] numbers = {5, 2, 8, 1, 3};

//         Arrays.sort(numbers);
//         System.out.println("Sorted array in ascending order:");
//         printArray(numbers);

//         reverseSort(numbers);
//         System.out.println("\nSorted array in descending order:");
//         printArray(numbers);
//     }
//     public static void reverseSort(int[] arr) {
//         Arrays.sort(arr);
//         reverse(arr);
//     }

//     public static void reverse(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;

// public class Workshop {
//     public static void main(String[] args) {
//         ArrayList<String> colors = new ArrayList<>();
//         colors.add("Red");
//         colors.add("Blue");
//         colors.add("Green");
//         colors.add("Yellow");
//         colors.add("Orange");

//         Collections.sort(colors);
//         System.out.println("Sorted list of colors in ascending order:");
//         System.out.println(colors);

//         Collections.sort(colors, Collections.reverseOrder());
//         System.out.println("\nSorted list of colors in descending order:");
//         System.out.println(colors);
//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;

// public class Workshop {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);
//         numbers.add(40);
//         numbers.add(50);
//         numbers.add(60);
//         numbers.add(70);
//         numbers.add(80);
//         numbers.add(90);
//         numbers.add(100);

//         int target = 50;
//         int index = binarySearch(numbers, target);

//         if (index != -1) {
//             System.out.println("Element " + target + " found at index: " + index);
//         } else {
//             System.out.println("Element " + target + " not found in the list.");
//         }
//     }

//     public static int binarySearch(ArrayList<Integer> list, int target) {
//         int left = 0;
//         int right = list.size() - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (list.get(mid) == target) {
//                 return mid;
//             }

//             if (list.get(mid) < target) {
//                 left = mid + 1;
//             }
//             else {
//                 right = mid - 1;
//             }
//         }
//         return -1;
//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class Workshop {
//     public static void main(String[] args) {
//         HashMap<String, String> countryCapitals = new HashMap<>();

//         countryCapitals.put("United States", "Washington D.C.");
//         countryCapitals.put("United Kingdom", "London");
//         countryCapitals.put("France", "Paris");
//         countryCapitals.put("Germany", "Berlin");
//         countryCapitals.put("Japan", "Tokyo");

//         System.out.println("All key-value pairs in the map:");
//         printMap(countryCapitals);

//         String capital = getCapital("France", countryCapitals);
//         System.out.println("\nThe capital of France is: " + capital);

//         String capitalToCheck = "London";
//         boolean containsCapital = containsCapital(capitalToCheck, countryCapitals);
//         System.out.println("\nDoes the map contain the capital " + capitalToCheck + "? " + containsCapital);

//         System.out.println("\nList of countries and their capitals:");
//         for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
//             System.out.println(entry.getKey() + " - " + entry.getValue());
//         }
//     }

//     public static void printMap(HashMap<String, String> map) {
//         for (Map.Entry<String, String> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " - " + entry.getValue());
//         }
//     }
//     public static String getCapital(String country, HashMap<String, String> map) {
//         return map.get(country);
//     }
//     public static boolean containsCapital(String capital, HashMap<String, String> map) {
//         return map.containsValue(capital);
//     }
// }


//REgular expressions

// import java.util.regex.Pattern;

// public class Workshop {
//     public static void main(String[] args) {
//         String str1 = "abcXYZ123";
//         String str2 = "abcXYZ123#";

//         System.out.println("String 1 contains only certain characters: " + containsCertain(str1));
//         System.out.println("String 2 contains only certain characters: " + containsCertain(str2));
//     }

//     public static boolean containsCertain(String str) {
//         String regex = "^[a-zA-Z0-9]*$";

//         Pattern pattern = Pattern.compile(regex);

//         return pattern.matcher(str).matches();
//     }
// }


// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

// public class Workshop {

//     public static void main(String[] args) {
//         String input = "AabcXYZxyzZaBcdEfGhI";

//         Pattern pattern = Pattern.compile("[A-Z][a-z]+");
//         Matcher matcher = pattern.matcher(input);

//         System.out.println("Sequence of one uppercase letter followed by lowercase letters: ");
//         while (matcher.find()) {
//             System.out.println(matcher.group());
//         }
//     }
// }

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

// public class Workshop {

//     public static void main(String[] args) {
//         String filename1 = "Documwnt.txt";
//         String filename2 = "data.txt.gz";

//         System.out.println(filename1 +" is a text file :" + hasExt(filename1));
//         System.out.println(filename2 +" is a text file :" + hasExt(filename2));
//     }

//     public static boolean hasExt(String filename){
//         String regex = "\\.txt$";
//         Pattern pattern = Pattern.compile(regex);
//         Matcher matcher = pattern.matcher(filename);
//         return matcher.find();
//     }
// }


