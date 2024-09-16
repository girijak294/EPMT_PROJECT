
import java.util.ArrayList;
import java.util.Scanner;

public class Query {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); 
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt()); 
            }
            lists.add(list); 
        }
        
       
        int query = sc.nextInt();
        
        
        for (int i = 0; i < query; i++) {
            int x = sc.nextInt() - 1; 
            int y = sc.nextInt() - 1;
            
            
            if (x < lists.size() && y < lists.get(x).size() && y >= 0) {
                System.out.println(lists.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
