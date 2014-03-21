/*
ID: thatcra2
LANG: JAVA
TASK: dualpal
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class dualpal {

    public static boolean ispal(String s)
    {
        if (s.length() == 0 || s.length() == 1)
            return true;

        if (s.charAt(0) == s.charAt(s.length()-1))
            return ispal(s.substring(1, s.length() - 1));

        return false;
    }
    public static String tobase(int n , int base)
    {
        return Integer.toString(n,base);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("dualpal.in"));
        int COUNT = sc.nextInt();
        int START = sc.nextInt();
        sc.close();
        ArrayList<String> results = new ArrayList<String>();
        while(COUNT!=0)
        {
            int t = 0;
            START++;
            System.out.println("START: "+START+"COUNT: "+COUNT);

            for(int i = 2;i<=10;i++)
            {
                System.out.println("START: "+START+"tobase(START,i): "+tobase(START,i));
                if(ispal(tobase(START,i)))
                {
                    t++;
                }
                if(t==2)
                {
                    results.add(Integer.toString(START));
                    COUNT--;
                    break;
                }

            }

        }
        // DEBUG
        System.out.println(results);
        File f = new File("dualpal.out");
        FileWriter fr = new FileWriter(f);
        BufferedWriter br = new BufferedWriter(fr);
        for(int i=0;i<results.size();i++)
        {
            br.write(results.get(i));
            br.newLine();
        }
        br.close();
    }
}
