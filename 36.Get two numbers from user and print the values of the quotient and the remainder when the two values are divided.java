import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double rem=(double)a/b;
        int quot=a%b;
        System.out.printf(a +" / "+b+" = "+ "%.6f",rem);
        System.out.println();
        System.out.println(a+" % "+b+" = "+quot);
    }
}
