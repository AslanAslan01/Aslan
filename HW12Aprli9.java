package homeWork;

public class HW12Aprli9 {
    public static void main(String[] args) {

        int[] num = {15, 45, 62, 1, 89};

        int max = num[0];
        int maxSecond = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            for (int j = 0; j < num.length ; j++) {
                if (num[j]>maxSecond && num[j]< max){
                    maxSecond= num[j];
                }
            }

        }
        System.out.println(max);
        System.out.println(maxSecond);

    }
}

