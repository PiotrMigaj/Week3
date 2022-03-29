package homework.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//class IntegerComparator implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1-o2;
//    }
//}

public class Ex3Solution {

    public static int countEvenNumbers(int... numbersArray) {

        sitoEratostenesa(numbersArray);

        int result = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] != 0) {
                result++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> integerArrayListMethod(int... numbersArray){

        sitoEratostenesa(numbersArray);
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i=0;i<numbersArray.length;i++){
            if (numbersArray[i]!=0){
                integerArrayList.add(numbersArray[i]);
            }
        }

        integerArrayList.sort(new Ex3Solution().new IntegerComparator());

        //Collections.sort(integerArrayList);

        return integerArrayList;

    }

    class IntegerComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }

    private static void sitoEratostenesa(int[] array){

        Arrays.sort(array);

        int maxIterator = (int)Math.sqrt(array[array.length-1]);

        for (int i=2;i<=maxIterator;i++){
            for (int j=0;j< array.length;j++){
                if(array[j]!=i&&array[j]%i==0){
                    array[j]=0;
                }
            }
        }
    }

}
