package class4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoy old are you?");
        int year = scanner.nextInt();
        if (year > 18){
            System.out.println("Congratulations,you get your driver's license");
        }else{
            System.out.println("Here is your learners permit");
        }
    }
}
