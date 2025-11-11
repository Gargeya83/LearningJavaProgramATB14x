package ex_30_Collection_Framework.CF_01_LIST;
import java.util.Vector;

public class Lab241_Vector {

    public static void main(String[] args) {
        Vector v = new Vector(); // Array
        v.add("Gargeya");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));
    }
}
