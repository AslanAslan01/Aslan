package class12;

import java.util.Scanner;

public class HomeWork22April2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter mom's name:");
        String momName = scan.nextLine();
        System.out.println("Please enter father's name: ");
        String fatherName = scan.nextLine();
        System.out.println("What is the gender expected?");
        String gen = scan.nextLine();
        String gender =gen.toLowerCase();


        String suggestedName ="";
        if (gender.equals("boy")){
            suggestedName = fatherName.substring(0,3)+ momName.substring(momName.length()-2);
            System.out.println("Suggested baby name is "+suggestedName.toUpperCase());
        } else if (gender.equals("girl")) {
            suggestedName = momName.substring(0,3)+fatherName.substring(fatherName.length()-3);
            System.out.println("Suggested baby name is "+suggestedName.toUpperCase());
        }else {
            System.out.println("Please enter valid answers");
        }

    }
}
