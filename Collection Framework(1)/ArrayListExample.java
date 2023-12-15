import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ram");
        nameList.add("Dev");
        nameList.add("Roy");
        nameList.add("Sanket");

        System.out.println("Forward traversal using ListIterator:");
        ListIterator<String> forwardIterator = nameList.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        System.out.println("\nReverse traversal using ListIterator:");
        ListIterator<String> reverseIterator = nameList.listIterator(nameList.size());
        while (reverseIterator.hasPrevious()) {
            System.out.println(reverseIterator.previous());
        }
    }
}
