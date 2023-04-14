package class10;

public class class10Task6 {
    public static void main(String[] args) {


        String[][] countries ={
                {"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Chile", "Colombia"},
                {"UK", "France", "Germany", "Spain"},
                {"China", "Japan", "India", "South Korea"},
                {"Nigeria", "Egypt", "South Africa", "Kenya"}
        };

        // loop 1

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
        }
        System.out.println();
        //loop 2
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s+" ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int a = 0; a < countries.length; a++) {
            for (int b = 0; b < countries[a].length; b++) {
                sum++;
            }
        }
        System.out.println(sum);


    }

}