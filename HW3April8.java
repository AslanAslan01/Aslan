package class9;

public class HW3April8 {
    public static void main(String[] args) {

            // Integer Array
        int[] numbers = {7, 21, 65, 33, 99, 1, 15, 11};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);

        // Largest number

        int [] number = {7, 21, 65, 33, 99, 1, 15, 11};

        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i]>max){
                max = number[i];
            }
        }
        System.out.println(max);


        //Char reverse array

        char[] chars = {'A','B','C','D','E','F','G'};

        for (int i = chars.length-1; i > 0 ; i--) {
            System.out.println(chars[i]);

        }
















    }
}
