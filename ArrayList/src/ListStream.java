import java.util.*;
import java.util.stream.Collectors;

public class ListStream {
    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);   // duplicate value

        // 1) forEach() → Print all elements
        list.stream().forEach(System.out::println);

        // 2) filter() → Select elements greater than 25
        System.out.println("\nFilter ( > 25 ) :");
        list.stream()
                .filter(n -> n > 25)   // condition
                .forEach(System.out::println);

        // 3) map() → Change each element (multiply by 2)
        System.out.println("\nMap ( * 2 ) :");
        list.stream()
                .map(n -> n * 2)       // modify element
                .forEach(System.out::println);

        // 4) sorted() → Sort elements in ascending order
        System.out.println("\nSorted :");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        // 5) distinct() → Remove duplicate elements
        System.out.println("\nDistinct (Remove duplicates) :");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        // 6) limit() → Take only first 3 elements
        System.out.println("\nLimit (First 3 elements) :");
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        // 7) skip() → Skip first 2 elements
        System.out.println("\nSkip (Skip first 2 elements) :");
        list.stream()
                .skip(2)
                .forEach(System.out::println);

        // 8) count() → Count total elements
        long count = list.stream().count();
        System.out.println("\nCount : " + count);

        // 9) anyMatch() → Check if any element > 45
        boolean any = list.stream().anyMatch(n -> n > 45);
        System.out.println("\nAnyMatch ( > 45 ) : " + any);

        // 10) allMatch() → Check if all elements > 5
        boolean all = list.stream().allMatch(n -> n > 5);
        System.out.println("AllMatch ( > 5 ) : " + all);

        // 11) noneMatch() → Check if no element < 0
        boolean none = list.stream().noneMatch(n -> n < 0);
        System.out.println("NoneMatch ( < 0 ) : " + none);

        // 12) findFirst() → Get first element
        int first = list.stream().findFirst().get();
        System.out.println("\nFindFirst : " + first);

        // 13) findAny() → Get any one element
        int anyOne = list.stream().findAny().get();
        System.out.println("FindAny : " + anyOne);

        // 14) collect() → Convert stream back to List
        List<Integer> newList = list.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println("\nCollect ( >20 into new list ) : " + newList);

        // 15) removeIf() → Remove elements less than 30
        list.removeIf(n -> n < 30);
        System.out.println("\nAfter removeIf ( <30 removed ) : " + list);

        // 16) replaceAll() → Multiply each element by 10
        list.replaceAll(n -> n * 10);
        System.out.println("\nAfter replaceAll ( *10 ) : " + list);

        // 17) sort() → Sort list normally
        list.sort(Comparator.naturalOrder());
        System.out.println("\nAfter sort : " + list);
    }
}
