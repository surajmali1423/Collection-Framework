import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        List<Integer> ArrayList = new ArrayList<>();

        ArrayList.add(1);
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.add(4);
        ArrayList.add(5);
        ArrayList.add(6);

        for (int x : ArrayList){
            System.out.print(x +" ");
        }

        System.out.println(ArrayList.size());
        System.out.println(ArrayList.contains(4));
        System.out.println(ArrayList.contains(60));
        ArrayList.remove(3);
        System.out.println(ArrayList.size());

        ArrayList.add(3 , 400);
        System.out.println(ArrayList)   ;

    }
}
