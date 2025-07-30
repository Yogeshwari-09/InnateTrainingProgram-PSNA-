import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String tc=sc.nextLine();
        String[] parts = tc.split(":");
        int hh=Integer.parseInt(parts[0]);
        int mm=Integer.parseInt(parts[1]);
        int ss=Integer.parseInt(parts[2]);
        if(hh>=0 && hh<=23 && mm>=0 && mm<=59 && ss>=0 && ss<59){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
