package exespart1.ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2Main {
    public static void main(String[] args) {

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog("fgasdh","fsdhfgs",12));
//        dogs.add(new Dog("fgasdh","fsdhfgs",12));
//        dogs.add(new Dog("fgasdh","fsdhfgs",12));
//        System.out.println(Dog.numberOfDogs);

        Shelter shelter = new Shelter();
        System.out.println(Arrays.toString(shelter.dogsArray));
        shelter.addDog();
        shelter.addDog();

    }
}
