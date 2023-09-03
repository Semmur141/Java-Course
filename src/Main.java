public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("World!");
        System.out.println("\"Hello!\"\nMen");
        /* Да уж... начало положено... будет тяжко!!! */


        int age;
        // int age=35
        age = 35;
        System.out.println("Vozrast: " + age + ".");
        age = 30;
        System.out.println(age);

        float num4 = 4.255f;
        double num5 = 5.564323d;
        short myShort = 12723;
        long myLong = 1233452452;
        byte myByte = 127;
        //-128 127

        char sem = 'T';
        String user_name = "Semjon";
        System.out.println(user_name);

        boolean isHappy = false;

        int x = 5;
        String s = "Hallo";
        String space = " ";
        String name = "Bob";
        System.out.println(s+space+name);
        System.out.println("Hello"+" "+"John");
        System.out.println("My number is " + x);

        //int value = 0;
        //boolean t = value>5;
        //5>=5; //5==5
        //System.out.println(t);
        int value = 0;
        while(value<5){
            System.out.println("Hello "+value);
            value = value+1;
        }
        for(int i = 0; i<=10; i++){  // i++ == i = i+1
            System.out.println("Hello "+i);

    }

}}


