package class10;

public class class10Task2 {

    public static void main(String[] args) {

        String [][] cars = {
                {"American","German"},
                {"Korean","Italian"},
        };
        // loop1
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
        System.out.println();

        // loop2
        for (String[] car : cars) {
            for (String s : car) {
                System.out.print(s+" ");
            }

        }
    }
}
