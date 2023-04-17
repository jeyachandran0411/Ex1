import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<Integer> jeya= Arrays.asList(156,3,99,64,22);
        List<String> chan= Arrays.asList("xxx","yyy","zzz","iii","uuu");


        List<Integer> str= (List<Integer>)jeya.stream().map(y->y/y).collect(Collectors.toList());
        System.out.println(str);
       
    }
}
