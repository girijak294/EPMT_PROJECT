import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int Q = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();


            for (int j = 0; j < Q; j++) {
                String queryType = sc.next();

                switch (queryType) {
                    case "a":
                        int key = sc.nextInt();
                        int value = sc.nextInt();
                        map.put(key, value);
                        break;

                    case "b":
                        key = sc.nextInt();
                        System.out.print(map.getOrDefault(key, -1) + " ");
                        break;

                    case "c":
                        System.out.print(map.size() + " ");
                        break;

                    case "d":
                        key = sc.nextInt();
                        map.remove(key);
                        break;

                    case "e":
                        for (int k : map.keySet()) {
                            System.out.print(k + " ");
                        }
                        break;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
