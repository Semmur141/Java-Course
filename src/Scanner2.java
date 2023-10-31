import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        int date = 2023;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваш год рождения: ");
        int user_dateofbirth = scan.nextInt();
        int res = date - user_dateofbirth;
        System.out.println("Ваш возраст: " + res);
    }
}
//public class Scanner3 {
//   public static void main(String[] args) {
//        int pincode = 3598;

//    }
//}