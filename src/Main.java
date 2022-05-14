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


    public static void main(String[] args) {
        //Z4
        char[] fullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        printReversArray(fullName);
        //Z5
        String stroka = "aabccddefgghiijjkk";
        printDouble(stroka);
    }
}