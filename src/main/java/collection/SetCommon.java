package collection;

import java.util.*;

public class SetCommon {

    public static void main(String[] args) {
        aboutHashSet();
        aboutTreeSet();
    }


    /**
     * 1. No duplicate
     * 2. Allows null values
     * 3. Does not guarantee in the insertion order of elements.
     * 4. Not thread safe
     * 5. Collection.synchronize(set) //perf hit
     * 6. HashSet iterator fail-fast
     * 7. Supports Generic
     * 8. Uses hashmap for storing element
     *
     */
    public static  void aboutHashSet(){
      Set<String> set = new HashSet<>();
        System.out.println("Fruits is empty :" + set.isEmpty());
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        System.out.println("Fruits contains :" + set.size() +" fruits.");
        Iterator<String>  it = set.iterator();
        while(it.hasNext()){
            System.out.println("Fruit is : " + it.next());
        }
        //convert to array
        String []arr = new String[]{};
        arr =  set.toArray(arr);
        System.out.println(Arrays.asList(arr));
        //Set to List directly
        List<String> fruitList = new ArrayList(set);
        System.out.println(fruitList);
        set.clear();
        System.out.println("Fruits is empty :" + set.isEmpty());

    }

    /**
     * 1.Natural Ordering
     * */

    public static void aboutTreeSet(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        Iterator<Integer> treeSet = set.iterator();
        while(treeSet.hasNext()){
            System.out.println(treeSet.next());
        }
        System.out.println("--------");
        treeSet = set.descendingIterator();
        while(treeSet.hasNext()){
            System.out.println(treeSet.next());
        }

        System.out.println("First element :" + set.pollFirst());
        System.out.println("First element :" + set.pollLast());

        //To create one user defined object
        //Over


    }




}
