package exespart1.ex3;

import java.util.Scanner;

public class Shelter {

    Scanner scanner = new Scanner(System.in);
    public Dog[] dogsArray;


    public Shelter() {
        this.dogsArray = new Dog[2];
    }

    public void addDog(){
        for (int i=0;i< dogsArray.length;i++){
            if (dogsArray[i]==null){

                System.out.println("Podaj imię psa: ");
                String name = scanner.nextLine();
                System.out.println("Podaj rasę psa: ");
                String breed = scanner.nextLine();
                System.out.println("Podaj wiek psa: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                dogsArray[i]=new Dog(name,breed,age );
                if (i== dogsArray.length-1){
                    System.out.println("Liczba psów w schronisku (zagnieżdzone): "+ Dog.numberOfDogs);
                }
                break;
            }
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
