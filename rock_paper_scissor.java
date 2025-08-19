import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine().trim();   // Player A's move

        String result = " ";
        if (M.equals("rock")) {
            result = "Paper";       // Paper beats rock
        } else if (M.equals("paper")) {
            result = "Scissors";    // Scissors beats paper
        } else if (M.equals("scissors")) {
            result = "Rock";        // Rock beats scissors
        } else {
            result = "Invalid Input";
        }

        System.out.println(result);
        sc.close();
    }
}
