public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        System.out.print("10 cm = ");
        System.out.print(10/2.54);
        System.out.print(" inch" );
        System.out.println("");

        System.out.print("25 inch = ");
        System.out.print(25*2.54);
        System.out.print(" cm" );
        System.out.println("");
        // Task 2
        System.out.println("Task 2");
        System.out.print("10000 uah = ");
        System.out.print(10000/28);
        System.out.print(" eur" );
        System.out.println("");
        // Task 3
        System.out.println("Task 3");
        int in = 45;
        String strInt = String.valueOf(in);
        char s1 = strInt.charAt(1);
        char s2 = strInt.charAt(0);
        System.out.print(s1);
        System.out.print(" ");
        System.out.print(s2);
        System.out.println("");
        // Task 4
        System.out.println("Task 4");
        in = 34;
        int ten = in/10;
        int one = in-ten*10;
        System.out.print(ten*10);
        System.out.print(" + ");
        System.out.print(one);
        System.out.println("");
        // Task 5
        System.out.println("Task 5");
        in = 34;
        ten = in/10;
        one = in-ten*10;
        System.out.print("weight: ");
        System.out.print(ten+one);
        System.out.println("");
        // Task 6
        System.out.println("Task 6*");
        in = 44;
        ten = in/10;
        one = in-ten*10;
        int count = 0;
        if (one%2==0) {
            count +=1;
        }
        if (ten%2==0){
            count +=1;
        }
        System.out.print("степень четности: ");
        System.out.print(count);
        System.out.println("");
        // Task 7
        System.out.println("Task 7");
        in = 2;
        if (in==0) {
            System.out.print("Ноль");
        }
        if (in<0) {
            System.out.print("Отрицательное");
        }
        if (in>0) {
            System.out.print("Положительное");
        }
        System.out.println("");
        // Task 8
        System.out.println("Task 8");
        in = 333;
        if (in>=100) {
            System.out.print(in-1);
        }
        System.out.println("");
        // Task 9
        System.out.println("Task 9");
        in = 22;
        if (in>=10&in<=99) {
            ten = in/10;
            one = in-ten*10;
            if (in>=ten*one){
                System.out.print(in);
            } else {
                System.out.print(ten*one);
            }
        }





    }

}