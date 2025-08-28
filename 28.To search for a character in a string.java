import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        char ch=sc.next().charAt(0);
        sc.nextLine();
        String s=sc.nextLine();
        boolean found=false;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==ch){
                found=true;
                    break;
            }
        }
        if(found){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
    }
}
