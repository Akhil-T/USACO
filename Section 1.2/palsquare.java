package usaco;

/*
ID: thatcra2
LANG: JAVA
TASK: palsquare
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class palsquare {
    public static boolean ispal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return ispal(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }
    public static String sqbase(int no, int base)
    {
        return Integer.toString(no, base);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // get the base no
        // check if square of 1-300 in base B is pal 
        // if yes store it i  Arr[#]
         Scanner s = null;
         s = new Scanner(new BufferedReader(new FileReader("palsquare.in")));
         int base = s.nextInt();
         s.close();
         //int base = 5;
         ArrayList<String> results = new ArrayList<String>();
         for(int i=1;i<=300;i++)
         {
             if(ispal(sqbase(i*i,base)))
             {
                 String temp = sqbase(i,base)+" "+sqbase(i*i,base);
                 results.add(temp.toUpperCase());
             }
         }
            System.out.println(results);
            
            File f = new File("palsquare.out");
            FileWriter fr = new FileWriter(f);
            BufferedWriter br  = new BufferedWriter(fr);
            for(int i=0;i<results.size();i++)
            {
                br.write(results.get(i));
                br.newLine();
            }
            br.close();
    }
}
