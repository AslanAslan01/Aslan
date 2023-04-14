package homeWork;

public class HW12April2 {
    public static void main(String[] args) {


        //Task 4 Even and Odd numbers sum

        int[][] numbers = {
                {14, 17, 15, 22},
                {68, 43, 26, 88},
        };
        // odd sum

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]% 2 != 0) {
                    oddSum+=numbers[i][j];
                } else if (numbers[i][j]% 2 == 0) {
                    evenSum+=numbers[i][j];
                }
            }
        }
        System.out.println("Odd sum: " + oddSum);
        System.out.println("Even sum: "+ evenSum);




    }
}
