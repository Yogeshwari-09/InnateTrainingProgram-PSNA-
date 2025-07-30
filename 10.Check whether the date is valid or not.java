import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();
        if (isValidDate(inputDate)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static boolean isValidDate(String dateStr) {
        if (!dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }
        String[] parts = dateStr.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year < 1900 || year > 9999) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
