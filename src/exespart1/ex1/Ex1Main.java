package exespart1.ex1;

import java.util.ArrayList;

public class Ex1Main {
    public static void main(String[] args) {

        YearOfBirthClass yearOfBirthClass1 = new YearOfBirthClass();
        YearOfBirthClass yearOfBirthClass2 = new YearOfBirthClass();
        YearOfBirthClass yearOfBirthClass3 = new YearOfBirthClass();
        YearOfBirthClass yearOfBirthClass4 = new YearOfBirthClass();

        ArrayList<YearOfBirthClass> yearOfBirthClassesArray = new ArrayList<>();
        //yearOfBirthClassesArray.add(new YearOfBirthClass());

        for(int i=0;i<4;i++){
            yearOfBirthClassesArray.add(new YearOfBirthClass());
        }

        for(int i=0;i<4;i++){
            yearOfBirthClassesArray.get(i).yearOfBirth = i+10;
        }

        for(int i=0;i<4;i++){
            System.out.println(yearOfBirthClassesArray.get(i).yearOfBirth);
        }

        YearOfBirthClass.yearOfBirth = 20;
        System.out.println(YearOfBirthClass.yearOfBirth);




    }
}
