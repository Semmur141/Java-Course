import java.util.Scanner;

//сделать программу которая будет получать данные от пользователя (время дня) и изходя из времени выводить -
// доброго дня, утра или вечера....

public class Tests {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite vremja: ");
        float  time1 = scan.nextFloat();
        if (time1 <= 11.59 && time1 >= 6.00) {
            System.out.println("Dobroe utro!");
        } else if (time1 <= 5.59 && time1 >= 00.00 ) {
            System.out.println("Dobroi no4i!");
        } else {
            System.out.println("Dobrogo dnja!");
        }
    }
}