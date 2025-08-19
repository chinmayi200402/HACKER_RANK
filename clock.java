import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int time = (x * y) % 12;
        if (time == 0) time = 12;  // Fix: show 12 instead of 0

        System.out.println(time);
    }
}
