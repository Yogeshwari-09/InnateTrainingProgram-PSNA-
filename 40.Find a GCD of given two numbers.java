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
        int gcd=findGCD(a,b);
        System.out.println("GCD of two number is "+gcd);
    }
    public static int findGCD(int x,int y){
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;

        }
    return x;
    }
}
