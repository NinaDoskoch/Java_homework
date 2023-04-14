package example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running the tests...");

        MyTestRunner testRunner = new MyTestRunner(ExampleTestClassTest.class);
        testRunner.runTests();
    }
}

