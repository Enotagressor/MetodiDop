import java.util.Arrays;
import java.lang.reflect.Array;

public class Main {
    // Zadanie 4
    public static void printReversArray(char[] fullName) {
        for (int i = (fullName.length - 1); i >= 0; i--){
            System.out.print(fullName[i]);
        }
        System.out.println(' ');
    }

    //Zadanie 5
    public static void printDouble(String stroka) {
             for (int i = 0; i < stroka.length()-1; i++) {
        if(stroka.charAt(i) == stroka.charAt(i + 1)) {
            System.out.println(stroka.charAt(i));
            break;
        } else  if (i + 1 == stroka.length()-1){
            System.out.println("No double");
                 }
        }
    }

    // Zadanie 6
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static double arraySum (int[] arr){
        double sum = 0;
        for (int element:arr) {
            sum+=element;
        }
        return sum;
    }
    public static void printMiddleSum(int[] arr, double sum){
       double averSum = sum / arr.length;
        System.out.println("averSum = " + averSum);
    }
    public static void printAver (int[] arr){
        double sum = arraySum(arr);
        printMiddleSum(arr, sum);
    }





    public static void main(String[] args) {
        //Z4
        char[] fullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        printReversArray(fullName);
        //Z5
        String stroka = "aabccddefgghiijjkk";
        printDouble(stroka);
        //Z6
        int[] arr = generateRandomArray();
        printAver(arr);

    }
}