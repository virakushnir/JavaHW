package Brick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Task56 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Brick dimensions");
        System.out.print("Length: ");
        double a = Double.parseDouble(bf.readLine());
        System.out.print("Height: ");
        double b = Double.parseDouble(bf.readLine());
        System.out.print("Width: ");
        double c = Double.parseDouble(bf.readLine());

        System.out.println("Hole dimensions");
        System.out.print("Height: ");
        double x = Double.parseDouble(bf.readLine());
        System.out.print("Width: ");
        double y = Double.parseDouble(bf.readLine());

        Boolean br = false;
        if ((a<=x & b<=y) | (a<=x & c<=y) | (b<=x & c<=y) | (b<=x & a<=y) | (c<=x & a<=y) | (c<=x & b<=y))
            br = true;
        if (br) System.out.println("Brick can enter the hole");
        else System.out.println("Brick cannot enter the hole");

    }
}
