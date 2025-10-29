package h3;

public class H3_main {
    public static void main(String[] args) {

        int i = 101;
        int j = 8;
        int k = -10;

        boolean b;
        boolean c;
        boolean d;

        b = (i > j);
        c = (i > 200);
        d = (j > 100);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        if (b == true) {
            if (c == false) {
                if (d == false) {
                    k = 1;
                }
            }
        }
        if (b == true) {
            if (c == true) {
                if (d == false) {
                    k = 2;
                }
            }
        }
        if (b == true) {
            if (c == true) {
                if (d == true) {
                    k = 3;
                }
            }
        }
        if (b == false) {
            if (c == false) {
                if (d == false) {
                    k = 4;
                }
            }
        }

        System.out.println(k);

    }

}
