import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Sample {

    private String name;
    private int age;

    Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return " name: " + name + " age: " + age;
    }

    public static void main(String[] args) {
        List<Sample> list = Arrays.asList(new Sample("jey", 23),
                                          new Sample("ram", 22),
                                          new Sample("hari", 11),
                                          new Sample("naren", 62),
                                          new Sample("karthi", 51));

        // list.stream().max(Comparator.comparing(Sample::getName))
        // .ifPresent(p -> System.out.println( p));

    //     list.stream().min(Comparator.comparing(Sample::getAge))
    //             .ifPresent(q -> System.out.println(q));
    //     list.stream().min(Comparator.comparing(Sample::getName))
    //   .ifPresent(s -> System.out.println("sort by alphabet order person min " + s));



      List<Sample> j1= list.stream().filter(p->p.getName().startsWith("k").collect(Collector.tolist()));
      j1.stream().forEach(System.out::println);
    
    }

    
}
