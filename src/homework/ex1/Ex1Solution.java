package homework.ex1;

public class Ex1Solution {

    public static int myMethodAdd(int... array){

        int sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }

        return sum;
    }

}
