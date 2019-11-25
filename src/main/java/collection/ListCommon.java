package collection;

import java.util.ArrayList;
import java.util.List;

public class ListCommon {

    /** *
     * 1. add() or add(index,value)
     * 2. addAll() or addAll(index,AddAll)
     * 3. set(index,value)
     * 4. get(index)
     * 5. remove(index)
     *
     *
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(0,1);
        myList.add(1,2);
        System.out.println(myList);


        List<Integer> myList2 = new ArrayList<>();
        myList2.addAll(0,myList);

        // Search
        System.out.println(myList.indexOf(1));

        //sublist

        System.out.println(myList.subList(1,2));


    }




}
