import java.io.*;
import java.util.Scanner;

/*
ID: thatcra2
LANG: JAVA
TASK: ride
*/
public class ride {
    public static void main(String[] asdasd) throws IOException {
        Scanner sc = new Scanner(new FileReader("ride.in"));
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        int ascii_a = 1;
        int ascii_b = 1;
        for(int i=0;i<a.length();i++)
        {
            ascii_a *= ((int)a.charAt(i)-64);

        }
        for(int i=0;i<b.length();i++)
        {
            ascii_b *= ((int)b.charAt(i)-64);

        }
        File f = new File("ride.out");
        FileWriter fr = new FileWriter(f);
        BufferedWriter br = new BufferedWriter(fr);
        if(ascii_a%47 == ascii_b%47)
        {
            br.write("GO");
        }
        else
        {
            br.write("STAY");
        }
        br.newLine();
        br.close();
    }
}
