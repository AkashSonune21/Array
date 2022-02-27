import java.util.ArrayList;
import java.util.List;

class ArrayDemo {
    // Main driver method
    public static void main(String[] args) {
        // Creating an object of List interface with
        // reference to ArrayList class
        List<Integer> al = new ArrayList<>();

        // Adding elements to our ArrayList
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        // Printing the current ArrayList
        System.out.println(al);
        al.remove(1);
        al.remove(1);

        // Printing the updated ArrayList
        System.out.println(al);
    }
}
