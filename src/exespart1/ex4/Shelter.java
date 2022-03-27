package exespart1.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelter {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Dog> dogsArray;


    public Shelter() {
        this.dogsArray = new ArrayList<>();
    }

    public void addDog(){

        System.out.println("Podaj imię psa: ");
        String name = scanner.nextLine();
        System.out.println("Podaj rasę psa: ");
        String breed = scanner.nextLine();
        System.out.println("Podaj wiek psa: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        dogsArray.add(new Dog(name,breed,age));
        if (dogsArray.size()==2){
            System.out.println("Liczba psów w schronisku (zagnieżdzone):"+Dog.numberOfDogs);
        }




    }

    static class Dog {

        private String name;
        private String breed;
        private int age;
        public static int numberOfDogs;

        public Dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
            numberOfDogs++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
