import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Name = sc.nextLine();
        System.out.println("Name: " + Name);

        int Age = sc.nextInt();
        System.out.println("Age: " + Age);

        double CGPA = sc.nextDouble();
        // truncate to 2 decimals (no rounding)
        double truncatedCgpa = ((int)(CGPA * 100)) / 100.0;
        System.out.printf("CGPA: %.2f\n", truncatedCgpa);

        char Grade = sc.next().charAt(0);
        System.out.println("Grade: " + Grade);

        sc.close();
    }
}
