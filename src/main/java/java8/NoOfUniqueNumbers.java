package java8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NoOfUniqueNumbers {
    public static void main(String[] args) {
        //generateUniuqeNumbers();
        generateWithList();
    }


    public static void generateUniuqeNumbers(){
        ThreadLocalRandom.current()
                .ints(0,10)
                .distinct()
                .limit(5)
                .forEach(System.out::println);
    }

    public static void generateWithList(){
        ArrayList<Integer> data = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < 10; i++){
            data.add(i);
        }
        Collections.shuffle(data);

        System.out.println(data);
    }

}
