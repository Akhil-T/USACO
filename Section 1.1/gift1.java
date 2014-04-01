/*
 ID: thatcra2
 LANG: JAVA
 TASK: gift1
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class gift1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("gift1.in"));
        PrintWriter pw = new PrintWriter(new File("gift1.out"));
        LinkedHashMap<String, Integer> initial = new LinkedHashMap<String, Integer>();
        LinkedHashMap<String, Integer> recieved = new LinkedHashMap<String, Integer>();
        int n = sc.nextInt();
        String[] people = new String[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.next();
            initial.put(people[i], 0);
            recieved.put(people[i], 0);
        }
        for (int i = 0; i < n; i++) {
            String current = sc.next();
            System.out.println(i);
            int amount = sc.nextInt();
            int ngetters = sc.nextInt();
            initial.put(current, amount);
            int gift=0;
            if (ngetters != 0) {
                gift = amount / ngetters;
                recieved.put(current, recieved.get(current) + amount % ngetters);
            }
            for (int j = 0; j < ngetters; j++) {
                String getter = sc.next();
                recieved.put(getter, recieved.get(getter)+gift);
            }
        }
        for (int i = 0; i < n; i++) {
            int balance = recieved.get(people[i]) - initial.get(people[i]);
            pw.write(people[i] + " " + balance);
            pw.write("\n");
            System.out.println(people[i] + " " + balance);
        }
        pw.close();
    }
}
