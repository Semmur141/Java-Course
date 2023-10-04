import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        // Коллекции в джава

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        for(Integer el : numbers) {
            System.out.println(el);
        }
    }
}
