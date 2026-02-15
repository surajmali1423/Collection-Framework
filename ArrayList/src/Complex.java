import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Complex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(15);
        list.add(6);
        list.add(20);

        System.out.println("Write a program to select numbers greater than 20 and store them into a new list using");
        List<Integer> list2 = list.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("Write a program to skip first 3 elements and print remaining elements");
        list.stream()
                .skip(3L)
                .forEach(System.out::println);

        System.out.println("Write a program to print only first 5 elements using");
        list.stream()
                .limit(5)
                .forEach(System.out::println);

//        System.out.println("Write a program to remove numbers less than 15 using");
//        list.removeIf(n -> n < 15);
//        System.out.println("remove the List : " + list);

//        System.out.println("Write a program to replace every element by its square using");
//        list.replaceAll(n -> n * n);
//        System.out.println("List Replace All : "+list);

//        System.out.println("From a list, filter even numbers, multiply them by 10, and store into a new list.");
//        List<Integer> List3 = list.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 10)
//                .collect(Collectors.toList());
//        System.out.println(List3);

        System.out.println("From a list, remove duplicate numbers, sort them, and print");
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("From a list, find the first number greater than 25");
        list.stream()
                .findFirst()
                .filter(n -> n > 25)
                .ifPresent(System.out::println);

        System.out.println("From a list, check if no number is negative.");
        boolean result = list.stream()
                .noneMatch(n -> n < 0);
        System.out.println(result);

        System.out.println("From a list, count how many numbers are even");
        long Count = list.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(Count);

    }
}
