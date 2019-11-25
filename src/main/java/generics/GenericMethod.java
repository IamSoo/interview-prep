package generics;

import java.util.List;

public class GenericMethod {

    //Generic method
    public static<T> boolean isEqual(GenericTypes g1, GenericTypes g2){
        return g1.get().equals(g2.get());
    }

    public static<T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        GenericTypes<String> g1 = new GenericTypes<>();
        g1.set("Soonam");

        GenericTypes<String> g2 = new GenericTypes<>();
        g2.set("kalyan");

        boolean isEqual = GenericMethod.isEqual(g1,g2);
    }

    public static double sum(List<? extends Number> numbers){
        double sum =0;
        for(Number n : numbers){
            sum += n.doubleValue();
        }
        return sum;

    }
}
