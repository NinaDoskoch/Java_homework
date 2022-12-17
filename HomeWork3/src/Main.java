import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        for (int start=1000; start<=1015;start+=3) {
            System.out.print(start);
            System.out.println(" ");
        }
        // Task 2
        System.out.println("Task 2");
        int[] seq = {10, 6, 2,-2,-6,-10};
        for (int out : seq) {
            if (out >= 0){
                System.out.print(out);
                System.out.println(" ");
            }
        }
        // Task 3
        System.out.println("Task 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int res = 1;
        int number = sc.nextInt();
        for (int i = 1; i<= number; i=i+1 ){
            res *= number;
        }
        System.out.print("Результат: ");
        System.out.print(res);
        System.out.println(" ");
        // Task 4
        System.out.print("Task 4");
        System.out.println(" ");
        Scanner keyboard = new Scanner (System.in);
        String dig = keyboard.nextLine();

        int sum = 13513451;
        System.out.println(Integer.toBinaryString(sum));

        for (int i=0; i<=dig.length()-1; i++) {
            System.out.println(String.format("index: %s value: %s",i, dig.charAt(i)));
            sum+=Integer.valueOf(dig.charAt(i));
        }

        System.out.println(String.format("Sum: %s",sum));

    }
}