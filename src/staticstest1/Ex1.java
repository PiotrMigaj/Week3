package staticstest1;

import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        StaticTest.myStaticMethod();
        //StaticTest.aStatic=20;
        System.out.println(StaticTest.aStatic);

        StaticTest staticTest = new StaticTest();
        StaticTest staticTest1 = new StaticTest();

        staticTest.aStatic = 10;
        staticTest1.aStatic=20;

        System.out.println(staticTest.aStatic);
        System.out.println(staticTest1.aStatic);


    }
}
