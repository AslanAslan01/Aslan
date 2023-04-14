package homeWork;

public class HW12April8 {

    public static void main(String[] args) {

        //Task 8. Max and Min number in array

        int [] numbers = {15, 17, 25, 45, 62, 1, 22, 89, 99};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }if (numbers[i]< min){
                min = numbers[i];
            }

        }
        System.out.println(max);
        System.out.println(min);




    }
}







