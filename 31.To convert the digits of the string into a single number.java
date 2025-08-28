import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder num=new StringBuilder();
        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num.append(ch);
            }
        }
        if(num.length()==0){
            System.out.print(0);
        }else{
            System.out.print(num.toString());
        }
    }
}
