package calls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print ("Cost of the call from c1: ");
        float c1 = Float.parseFloat(bf.readLine());
        System.out.print ("Cost of the call from c2: ");
        float c2 = Float.parseFloat(bf.readLine());
        System.out.print ("Cost of the call from c3: ");
        float c3 = Float.parseFloat(bf.readLine());

        System.out.print ("Time of the call with c1: ");
        float t1 = Float.parseFloat(bf.readLine());
        System.out.print ("Time of the call with c2: ");
        float t2 = Float.parseFloat(bf.readLine());
        System.out.print ("Time of the call with c3: ");
        float t3 = Float.parseFloat(bf.readLine());

        System.out.println("Cost of call with c1: " +c1*t1);
        System.out.println("Cost of call with c2: " +c2*t2);
        System.out.println("Cost of call with c3: " +c3*t3);

        System.out.println("Whole cost of all countries: " +(c1*t1+c2*t2+c3*t3));

    }
}
