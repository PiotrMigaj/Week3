package homework.ex3;

import java.util.*;

public class Ex3Solution {

    public static TreeSet<Integer> integerArrayListMethod(Integer... numbersArray){

        List<Integer> integerList = Arrays.asList(numbersArray);
        TreeSet<Integer> integerArrayList = new TreeSet<>(integerList);

        return integerArrayList;

    }
}
