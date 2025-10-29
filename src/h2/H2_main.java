package h2;

public class H2_main {
    public static void main(String[] args) {

        int i = 6;
        int j = 2;
        int k = 3;
        int min = 4;
        int max = 5;

        if (i < k) {
            if (i < j) {
                min = i;
            }
        }
        if (j < k) {
            if (j < i) {
                min = j;
            }
        }
        if (k < j) {
            if (k < i) {
                min = k;
            }
        }

        if (i > j) {
            if (i > k) {
                max = i;
            }
        }
        if (j > k) {
            if (j > i) {
                max = j;
            }
        }
        if (k > j) {
            if (k > i) {
                max = k;
            }
        }

        System.out.println("Minimum" + min);
        System.out.println("Maximum" + max);
    }
}
