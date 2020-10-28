package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashSet;

public class Task88 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n: ");
        int n = Integer.parseInt(br.readLine());
        int nc = n;
        char c;

        int n2 = n * n;
        String str = Integer.toString(n2);
        if (str.contains("3"))
            System.out.println("It contains 3");
        else
            System.out.println("It doesn't contain 3");

        System.out.print("Reverse direction: ");
        String s = Integer.toString(n);
        String result = s.substring(s.length() - 1);
        for (int i = s.length() - 2; i >= 0; i--) {
            result = result.concat(s.substring(i, i + 1));
        }
        n = Integer.parseInt(result);
        System.out.println(n);

        System.out.print("Swapped first and last numbers: ");
        String strn= Integer.toString(nc);
        char [] chararr = new char[strn.length()];
        chararr = strn.toCharArray ();
        if (chararr.length<2) System.out.println(strn);
        else {
            System.out.print(chararr[strn.length() - 1]);
            for (int i = 1; i < strn.length() - 1; i++) {
                System.out.print(chararr[i]);
            }
            System.out.println(chararr[0]);
        }

        System.out.print("1 in the beginning and in the end of number: ");
        System.out.print("1"+strn+"1");

    }
}
