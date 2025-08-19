import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Schedule Event");
        } else if (year % 100 == 0) {
            System.out.println("No Event This Year");
        } else if (year % 4 == 0) {
            System.out.println("Schedule Event");
        } else {
            System.out.println("No Event This Year");
        }
    }
}
