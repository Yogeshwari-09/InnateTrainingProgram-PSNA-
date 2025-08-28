import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right){
            while(!Character.isLetterOrDigit(a[left])){
                left++;
            }
            while(!Character.isLetterOrDigit(a[right])){
                right--;
            }
            if(left<right){
                char temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
           
        }
         System.out.print(new String(a));
    }
}
