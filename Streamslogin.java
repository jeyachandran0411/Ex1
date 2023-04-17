import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamslogin {

    
    public static void main(String[] args) {

        List<String> names = Arrays.asList("jeyachandran.k", "alas", "kiran", "thiyagu");
        names.stream().map(x -> x.length()).forEach(System.out::println);

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        number.stream().map(x -> x * 2).forEach(System.out::println);
       

        // List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10);
        // List<Integer> list2 = Arrays.asList(10, 8, 6, 4, 2);
        
        // List<Integer> sortedList1 = list1.stream().sorted().collect(Collectors.toList());
        // List<Integer> sortedList2 = list2.stream().sorted().collect(Collectors.toList());
        // sortedList1.forEach(System.out::println);
        // sortedList2.forEach(System.out::println);
        // List<Integer> evenList1 = list1 .stream().map(x->list1 % list2);
        // if (sortedList1.equals(sortedList2)) {
        //     System.out.println("The two lists are equal.");
        // } else {
        //     System.out.println("The two lists are not equal.");
        // }    
    }
    // public class MyClass {
    //     public void myMethod(int x) {
    //         System.out.println("This method takes an integer: " + x);
    //     }       
    //     public void myMethod(String str) {
    //         System.out.println("This method takes a string: " + str);
    //     }      
    //     public void myMethod(int x, String str) {
    //         System.out.println("This method takes an integer and a string: " + x + ", " + str);
    //     }
    // }        
}
