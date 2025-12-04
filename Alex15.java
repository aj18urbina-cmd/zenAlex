
import java.util.Scanner;

public class Alex15{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];

for (int i = 0; i < 5; i++) {
    System.out.print("Enter number " + (i+1) + ": ");
    arr[i] = sc.nextInt();
}

for (int n : arr) {
    if (n > 50) System.out.println(n);
}
}}
