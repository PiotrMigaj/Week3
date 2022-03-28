package polimorphismfirststeps;

public class SecondClass extends FirstClass {

    public String secondName;

    public SecondClass(String name, int age, String secondName) {
        super(name, age);
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
