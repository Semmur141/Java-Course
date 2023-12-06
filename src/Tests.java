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


//public class Tests {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Vvedite vremja: ");
//        float time1 = scan.nextFloat();
//        if ( time1 < 12 && time1 >= 6 ) {
//            System.out.println("Dobroe utro!");
//        }else if (time1 <= 18 && time1 >= 12 ){
//            System.out.println("Dobrogo dnja!");
//        }else if (time1 <= 6 && time1 >= 0 ){
//            System.out.println("Dobroi no4i!");
//        }else {
//            System.out.println("Dobrogo ve4era!");
//        }
//    }
//}



//Примитивный калькулятор

//public class Tests {
//    public static void main(String[] args) {
//        Scanner scnan = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int num1 = scnan.nextInt();
//        System.out.println("Введите второе число: ");
//        int num2 = scnan.nextInt();
//        int res;
//        System.out.println("Введите действие: ");
//        String deistvie = scnan.nextLine();
//        deistvie = scnan.nextLine();
//
//        switch (deistvie){
//            case "+":
//                res = num1 + num2;
//                System.out.println("Результат: " + res);
//                break;
//            case "*":
//                res = num1 * num2;
//                System.out.println("Результат: " + res);
//                break;
//            case "/":
//                if (num2 == 0)
//                    System.out.println("На ноль делить нельзя!");
//                else{
//                res = num1 / num2;
//                System.out.println("Результат: " + res);
//                }
//                break;
//            case "-":
//                res = num1 - num2;
//                System.out.println("Результат: " + res);
//                break;
//            default:
//                System.out.println("Вы ввели что-то не то!");
//        }
//    }
//}







//public class Tests {
//    public static void main(String[] args) {
//        // Циклы
//         for(float i = 100; i >= 10; i /=2){
//             System.out.println("Element: " + i);
//         }
//    }
//}




//public class Tests {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int pin = 1234;
//        int attempt = 0;
//        System.out.println("Введите пинкод: ");
//        int usercode = scan.nextInt();
//        if (usercode == pin) {
//            System.out.println("Ваш пинкод верен!");
//
//        }else{
//           do {
//               for (attempt = 3; attempt >= 0; attempt--) {
//                   System.out.println("Вы ввели неверный код у вас осталось " + attempt + " попыток");
//               }
//           }   while (usercode == pin) ;
//
//        }
//    }
//}








//public  class Tests {
//    public static void main(String[] args) {
//        //Циклы
//
//        for (int i = 30; i >= 0; i--){
//        System.out.println("Patron: " + i);
//        if (i == 20) {
//            System.out.println("Ostalosj 20 patronov");
//        }if (i == 10) {
//                System.out.println("Ostalosj 10 patronov");
//            }if    (i == 0){
//                    System.out.println("Net patronov perezarjadite oruzie");
//             }
//        }
//    }
//}





//public class Tests {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10){
//            System.out.println("element " + i);
//            i++;
//        }
//    }
//}




//public class Tests {
//    public static void main(String[] args) {
//        //Massivq
//
//        int[] nums = new int[5];
//        nums[0] = 45;
//        nums[1] = 32;
//        nums[2] = 1;
//        nums[3] = 9;
//        nums[4] = 3;
//        int res = nums[2] + nums[3];
//        System.out.println(res);
//
//        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
//        System.out.println(nums2[1]);
//
//        for(int i = 0; i < nums2.length; i++ ){
//            System.out.println( "Element: " + nums2[i]);
//        }
//    }
//}



//public class Tests {
//    public static void main(String[] args) {
//        // Massivq
//
//        int[] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//        for( int i = 0; i < arr.length; i++){
//            System.out.println("Vvedite 4islo; ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//
//        int min = arr[0];
//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//            System.out.println("Minimal: " + min);
//        }
//    }
//}






public class Tests {
    public static void main(String[] args) {
        // OOP klasq i objektq

        Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "white";
        bmw.coordinate = new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "red";
        truck.coordinate = new byte[] {100, 0, 100};

        System.out.print("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed);
    }
}

















