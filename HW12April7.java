package homeWork;

public class HW12April7 {
    public static void main(String[] args) {

        // Fibonacci

        int x= 10;
        int[] fib = new int[x];

        fib[0]=0;
        fib[1]=1;

        for (int i = 2; i < x; i++) {
            fib[i]= fib[i-2]+ fib[i-1];
        }
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i]+" ");
        }
    }
}
