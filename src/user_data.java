import java.util.Scanner;
public class user_data {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
//        System.out.print("vvedite vawe imja: ");
//        String username = scan.nextLine();
//        System.out.println("Privet, " + username);
//        int num1 = scan.nextInt();
//        byte num2 = scan.nextByte();
//        boolean b = scan.nextBoolean();
//        float num3 = scan.nextFloat();
//        short num1 = 50, num2 = 10;
//        int res = num1 +num2;
//        System.out.println("result: " + res);

        System.out.print("vvedite 1 4islo: ");
        float num1 = scan.nextFloat();

        System.out.print("vvedite 2 4islo: ");
        float num2 = scan.nextFloat();

        float  res1 = num1 + num2;
        float  res2 = num1 - num2;
        float  res3 = num1 * num2;
        float  res4 = num1 / num2;

        System.out.print(res1 + "\n" + res2 + "\n" + res3 + "\n" +res4);

    }
}
