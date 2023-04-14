package class10;

public class class10Task1 {
    public static void main(String[] args) {

        String[][] studentInfo = {
                {"Aslan", "Arnold", "Tom", "Halk"},
                {"A","B","C","D"}
        };
        for (int i = 0; i < studentInfo.length; i++) {
            if (studentInfo[1][i].equals("A")|| studentInfo[1][i].equals("B")){
                System.out.println(studentInfo[1][i]+" "+studentInfo[0][i]);
            }
        }


    }
}
