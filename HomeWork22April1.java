package class12;

public class HomeWork22April1 {

    public static void main(String[] args) {

        // #1
        String str = "Java!";
        if (str.length()!=0){
            if (str.length()%2==1 && str.length()>3){
                int middleIndex = str.length()/2;
                char mid = str.charAt(middleIndex);
                System.out.println(mid);
            }

        }
        System.out.println("-------");

        // #2
        String sayHi= "Hello";
        for (int i = sayHi.length()-1; i>=0 ; i--) {
            System.out.print(sayHi.charAt(i));
        }




    }


}

