import java.util.*;
import java.util.TreeMap;

public class Collections {

    public static void main(String[] args) {
        
        // a) ArrayList
        System.out.println("a) ArrayList:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing Banana: " + arrayList);
        System.out.println();

        // b) LinkedList
        System.out.println("b) LinkedList:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst("Cat");
        linkedList.addLast("Hen");
        System.out.println("LinkedList after adding Cat and Hen: " + linkedList);
        System.out.println();

        // c) HashMap
        System.out.println("c) HashMap:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Bhav");
        hashMap.put(2, "Ankit");
        hashMap.put(3, "Rev");
        System.out.println("HashMap: " + hashMap);
        System.out.println("Get value for key 2: " + hashMap.get(2));
        hashMap.remove(1);
        System.out.println("HashMap after removing key 1: " + hashMap);
        System.out.println();

        // d) LinkedHashMap
        System.out.println("d) LinkedHashMap:");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101, "Car");
        linkedHashMap.put(102, "Bus");
        linkedHashMap.put(103, "Bike");
        System.out.println("LinkedHashMap: " + linkedHashMap);
        linkedHashMap.remove(102);
        System.out.println("LinkedHashMap after removing key 102: " + linkedHashMap);
        System.out.println();

        // e) HashSet
        System.out.println("e) HashSet:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Green");
        hashSet.add("Red");  
        System.out.println("HashSet: " + hashSet);
        hashSet.remove("Blue");
        System.out.println("HashSet after removing Blue: " + hashSet);
        System.out.println();

        // f) LinkedHashSet
        System.out.println("f) LinkedHashSet:");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Sun");
        linkedHashSet.add("Moon");
        linkedHashSet.add("Stars");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.remove("Moon");
        System.out.println("LinkedHashSet after removing Moon: " + linkedHashSet);
        System.out.println();

        // g) TreeSet
        System.out.println("g) TreeSet:");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(60);
        System.out.println("TreeSet: " + treeSet);
        treeSet.remove(30);
        System.out.println("TreeSet after removing 30: " + treeSet);
        System.out.println();

        // h) TreeMap
        System.out.println("h) TreeMap:");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 15);
        System.out.println("TreeMap: " + treeMap);
        treeMap.remove("Banana");
        System.out.println("TreeMap after removing Banana: " + treeMap);
        System.out.println();
    }
}
