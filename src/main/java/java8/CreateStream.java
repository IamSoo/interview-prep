package java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        //createDateStream();
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        //createStreamChars();

        streamFilter(memberNames);
        streamMap(memberNames);
    }

    public void createListStream(){
        List<Integer> integerList = new ArrayList<>();
        Stream<Integer> listStream = integerList.stream();
        listStream.forEach(p-> System.out.println(p));

    }

    public static void createDateStream() {
        Stream<Integer> data = Stream.generate(() -> {return 1;});
        data.forEach(p -> System.out.println(p));

    }

    public static void createStreamChars() {
       Stream<String> eachChars = Stream.of("A$B$C$".split("\\$"));
       eachChars.forEach(p -> System.out.println(p));

    }

    public static void streamFilter(List<String> streamOfData){
        streamOfData.stream()
                .filter(a -> a.startsWith("A"))
                .forEach(System.out::println);
    }

    public static void streamMap(List<String> streamOfData) {
        streamOfData
                .stream()
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);


    }

    //stream.sorted
    //reduce
    //
    public static void reduceNames(List<String> streamOfData){
        Optional<String> reduced =
                streamOfData
                        .stream()
                .reduce((s1,s2) -> s1 +"#"+ s2);

        reduced.ifPresent(System.out::println);
    }

    //short-circuit operations
    //anyMatch
    //findFirst().get()
    //`

}
