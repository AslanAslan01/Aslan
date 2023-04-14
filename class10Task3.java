package class10;

public class class10Task3 {
    public static void main(String[] args) {

        String[][] product= {
                {"Apples","Cheese","Cookies","Candy"},
                {"Milk", "Carrots","Cucumber","Butter"}
        };

        //loop1
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j]+" ");
            }
        }
        System.out.println();
        // loop2
        for (String[] strings : product) {
            for (String string : strings) {
                System.out.print(string+" ");

            }

        }
    }
}
