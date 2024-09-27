import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Number of players
        Player[] players = new Player[n];

        
        for (int i = 0; i < n; i++) {
            players[i] = new Player(scanner.next(), scanner.nextInt());
        }

        
        Arrays.sort(players, new Checker());

        
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
        scanner.close();
    }
}
