package homeWork;

public class HW12april1 {

    public static void main(String[] args) {

        // Task1   .Highest and lowest temp
        int [] tempForWeek = {65, 68, 63, 72, 75, 79};

        int max = tempForWeek[0];
        int min = tempForWeek[0];

        for (int i = 0; i < tempForWeek.length; i++) {
                if (tempForWeek[i]>max) {
                    max= tempForWeek[i];
                }
                if (tempForWeek[i]<min){
                    min= tempForWeek[i];
                }
        }
        System.out.println(max);
        System.out.println(min);


        System.out.println();

        // Task 2   .Sum all elements
        int [] arr = {100, 1, 45, 74, 88, 77};
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println();

        //Task3 .    Even number

        int[] even = {123, 422, 52, 75, 58, 656, 678, 122};
        for (int i : even) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }

    }
}



