package homework.ex3;

import java.util.*;

public class Ex3Solution {

    public static List<Integer> integerArrayListMethod(Integer... numbersArray){

        List<Integer> integerList = Arrays.asList(numbersArray);

        integerList.sort((p1,p2)->p1.compareTo(p2));

        //TreeSet<Integer> integerArrayList = new TreeSet<>(integerList);

        return integerList;

    }
}
