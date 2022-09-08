import java.util.Scanner;

public class IfSample2 {
    public static void main (String args []) {

        int x, y, z, f;

        x = 10;
        y = 20;
        z = 30;
        f = 40;

        if (x < y) System.out.println("x меньше y, выражение верно");
        if (z < f) System.out.println( "z меньше f, выражение верно");
        if (y == f) System.out.print("y не равно f, выражение ложно");

        z = z + 10;
        if (z == f) System.out.print("z равно f, выражение верно");

        f = f * 2;
        if (y > f) System.out.println("y не больше f, выражение ложно");


    }
}
