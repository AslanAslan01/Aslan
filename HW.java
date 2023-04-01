package class7;

public class HW {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int a = 100; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int x = 20; x >= 0; x--) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        int q = 20;
        while (q >= 0) {
            System.out.print(q + " ");
            q -= 2;
        }
        System.out.println();

        for (int w = 20; w <= 50; w++) {
            if (w % 2 != 0) {
                System.out.print(w + " ");
            }
        }
        System.out.println();

        int r = 20;
        while (r <= 50) {
            if (r % 2 != 0) {
                System.out.print(r + " ");
            }
            r++;
        }

    }
}



