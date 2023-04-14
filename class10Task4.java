package class10;

public class class10Task4 {

    public static void main(String[] args) {

        int[][] num= {
                {15, 20, 25},
                {52, 76, 23},
                {21, 87, 44},
        };
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                sum +=num[i][j];
            }
        }
        System.out.println(sum);
    }

}

