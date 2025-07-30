import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };

        if (dayNumber >= 0 && dayNumber <= 6) {
            System.out.println(days[dayNumber]);
        } else {
            System.out.println("Invalid");
        }
    }
}
