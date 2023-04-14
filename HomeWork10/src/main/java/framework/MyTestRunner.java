package framework;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MyTestRunner {
    private final Class<?> testClass;

    public MyTestRunner(Class<?> testClass) {
        this.testClass = testClass;
    }

    public void runTests() {
        Method[] methods = testClass.getDeclaredMethods();
        int passedTests = 0;
        int failedTests = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    Object instance = testClass.getConstructor().newInstance();
                    method.invoke(instance);
                    passedTests++;
                    System.out.println("Test " + method.getName() + " PASSED");
                } catch (Exception e) {
                    failedTests++;
                    System.err.println("Test " + method.getName() + " FAILED");
                }
            }
        }

        System.out.println("\nTest Results:");
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + failedTests);
    }
}
