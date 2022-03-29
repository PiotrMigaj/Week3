package homework.ex3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;

public class Ex3Main {
    public static void main(String[] args) {

        System.out.println(Ex3Solution.countEvenNumbers(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));

        ArrayList<Integer> integerArrayList = Ex3Solution.integerArrayListMethod(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);

        //integerArrayList.sort(new IntegerComparator());

        //integerArrayList.sort(new Ex3Solution().new IntegerComparator());

        System.out.println(integerArrayList);

        //int result = (int a,int b)->a+b;

        //System.out.println((int a, int b));

        //System.out.println((int)Math.sqrt(26));

        //System.out.println(Arrays.toString(Ex3Solution.sitoEratostenesa(new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26})));

    }
}
