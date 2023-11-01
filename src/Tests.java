import java.util.Scanner;

//сделать программу которая будет получать данные от пользователя (время дня) и изходя из времени выводить -
// доброго дня, утра или вечера....

//public class Tests {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Vvedite vremja: ");
//        float  time1 = scan.nextFloat();
//        if (time1 <= 11.59 && time1 >= 6.00) {
//            System.out.println("Dobroe utro!");
//        } else if (time1 <= 5.59 && time1 >= 00.00 ) {
//            System.out.println("Dobroi no4i!");
//        } else {
//            System.out.println("Dobrogo dnja!");
//        }
//    }
//}

// Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".

//public  class Tests {
//    public static void main(String[] args) {
//        int x = 50;
//        int y = 50;
//        if (x == y){
//            System.out.println("1");
//        } else if ( x > y) {
//            System.out.println("2");
//        } else {
//            System.out.println("3");
//        }
//    }
//}


public class Tests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite vremja: ");
        float time1 = scan.nextFloat();
        if ( time1 < 12 && time1 >= 6 ) {
            System.out.println("Dobroe utro!");
        }else if (time1 <= 18 && time1 >= 12 ){
            System.out.println("Dobrogo dnja!");
        }else if (time1 <= 6 && time1 >= 0 ){
            System.out.println("Dobroi no4i!");
        }else {
            System.out.println("Dobrogo ve4era!");
        }
    }
}