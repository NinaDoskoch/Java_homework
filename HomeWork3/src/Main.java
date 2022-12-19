import java.util.Scanner;
import java.util.Random;
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

        System.out.println(" ");
	
	sc = new Scanner(System.in);
	System.out.println("Введите число(Введите число(sum)): ");
	int sum = sc.nextInt();

        for (int i=0; i<=dig.length()-1; i++) {
            System.out.println(String.format("index: %s value: %s",i, dig.charAt(i)));
            sum+=Integer.valueOf(dig.charAt(i));
        }

        System.out.println(String.format("Sum: %s",sum));

	//Task 5 (Arrays # 1)
	System.out.println(" ");
	System.out.println("Arrays. Task 1");
	int[] arr;
	for (int i = 2; i<=20; i+=2) {
	    arr.push(i);
	} 

	for (int i = 0; i<=arr.length(); i++){
	    System.out.print(arr[i]);
	    System.out.print(" ");
	}
	
	System.out.println("");
	
	for (int i = 0; i<=arr.length(); i++){
 	    System.out.println(arr[i]);
	}
	// Task 6 (Arrays # 2)
	System.out.println("Arrays.Task 2");
	int[] oddArr;
	for (int i = 0; i<=99;i++){
	    if (i%2 != 0){
		oddArr.push(i);
	    }
	}
	
	for (int i = 0; i<=oddArr.length(); i++){
	    System.out.print(oddArr[i]);
	    System.out.print(" ");
	}

	System.out.println(" ");

	
	for (int i = oddArr.length(); i>=0; i--){
	    System.out.print(oddArr[i]);
	    System.out.print(" ");
	}

	System.out.println(" ");

	// Task 7 (Arrays # 3)
	System.out.println("Arrays.Task 3");
	int[] fArr;
	int[] sArr;
	int fSum = 0;
	int sSum = 0;
	Random rand = new Random();
	for (int i=0;i<=5;i++){
	    fArr.push(rand.nextInt(5));
	    sArr.push(rand.nextInt(5));
	    fSum+=fArr[fArr.length()-1];
	    sSum+=sArr[sArr.length()-1];

	}
	System.out.println(String.format("Array1: %s", fArr));
	System.out.println(String.format("Arrat2: %s", sArr));

	if (fSum/fArr.length() > sSum/sArr.length()){
	    System.out.println(String.format("Array1 is biggest. Avg.: %s"), fSum/fArr.length());

	} 

	if (fSum/fArr.length() < sSum/sArr.length()){
	    System.out.println(String.format("Array2 is biggest. Avg.: %s"), sSum/sArr.length());

	} else {
	    System.out.println("Arrays are equal");
	}

 

    }
}

/*
import java.util.Scanner;
import java.util.Random;  
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

        System.out.println(" ");
	
	sc = new Scanner(System.in);
	Systeme.out.println("Введите число(Введите число(sum)): ");
	int sum = sc.nextInt();

        for (int i=0; i<=dig.length()-1; i++) {
            System.out.println(String.format("index: %s value: %s",i, dig.charAt(i)));
            sum+=Integer.valueOf(dig.charAt(i));
        }

        System.out.println(String.format("Sum: %s",sum));

	//Task 5 (Arrays # 1)
	System.out.println(" ");
	System.out.println("Arrays. Task 1");
	int[] arr;
	for (i = 2; i<=20; i+=2) {
	    arr.push(i);
	} 

	for (i = 0; i<=arr.length(); i++){
	    System.out.print(arr[i]);
	    System.out.print(" ");
	}
	
	System.out.println("");
	
	for (i = 0; i<=arr.length(); i++){
 	    System.out.println(arr[i]);
	}
	// Task 6 (Arrays # 2)
	System.out.println("Arrays.Task 2");
	int[] oddArr;
	for (i = 0; i<=99;i++){
	    if (i%2 != 0){
		oddArr.push(i);
	    }
	}
	
	for (i = 0; i<=oddArr.length(); i++){
	    System.out.print(oddArr[i]);
	    System.out.print(" ");
	}

	System.out.println(" ");

	
	for (i = oddArr.length(); i>=0; i--){
	    System.out.print(oddArr[i]);
	    System.out.print(" ");
	}

	System.out.println(" ");

	// Task 7 (Arrays # 3)
	System.out.println("Arrays.Task 3");
	int[] fArr;
	int[] sArr;
	int fSum = 0;
	int sSum = 0;
	Random rand = new Random()
	for (i=0;i<=5;i++){
	    fArr.push(rand.nextInt(5));
	    sArr.push(rand.nextInt(5));
	    fSum+=fArr[fArr.length()-1];
	    sSum+=sArr[sArr.length()-1];

	}
	System.out.println(String.format("Array1: %s", fArr));
	System.out.println(String.format("Arrat2: %s", sArr));

	if (fSum/fArr.length() > sSum/sArr.length()){
	    System.out.println(String.format("Array1 is biggest. Avg.: %s"), fSum/fArr.length());

	} 

	if (fSum/fArr.length() < sSum/sArr.length()){
	    System.out.println(String.format("Array2 is biggest. Avg.: %s"), sSum/sArr.length());

	} else {
	    System.out.println("Arrays are equal");
	}

 

    }
}
*/

