package polimorphismfirststeps;

public class Main {

    public static void main(String[] args) {

        FirstClass firstClass = new SecondClass("Piotr",32,"Migaj");

        System.out.println(firstClass.getName());

        SecondClass secondClass = (SecondClass) firstClass;

        System.out.println(secondClass.secondName);


    }

}
