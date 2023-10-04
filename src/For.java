public class For {
    public static void main (String[] args){
        for(int i = 0; i<10; i++){
            for( int k = 0; k<10; k++){
                System.out.printf("%5d", (i+1) * (k+1));
            }
            System.out.println();
        }
    }
 }
