import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int monthNumber=scanner.nextInt();

        String[] months = {"January", "February", "March", "April","May", "June", "July", "August","September", "October","November", "December"
        };

        if(monthNumber>=1 && monthNumber<=12) {
            System.out.println(months[monthNumber-1]);
        }else{
            System.out.println("Invalid");
        }
    }
}
