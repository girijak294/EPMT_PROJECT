import java.util.*;
import java.io.*;

public class PhoneBook {
   
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();  
        
       
        HashMap<String, String> phoneBook = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String phoneNumber = sc.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        
        
        while (sc.hasNext()) {
            String query = sc.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        sc.close();
    }
}
