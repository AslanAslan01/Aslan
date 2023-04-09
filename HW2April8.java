package class9;

public class HW2April8 {
    public static void main(String[] args) {
        // Cars Array
        String [] cars = {"Mercedes-Benz","BMW","AUDI","TOYOTA","Lexus","Lamborghini"};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        for (String car : cars) {
            System.out.print(car+" ");
        }
        System.out.println();

        //Animals Array
        String [] animals = new String[5];
        animals[0]="Goat";
        animals[1]="Elephant";
        animals[2]="Lion";
        animals[3]="Monkey";
        animals[4]="Eagle";

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");
        }
        System.out.println();

        for (String animal : animals) {
            System.out.print(animal+" ");
        }






    }
}
