
import java.util.Scanner;

public class Alex12{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {1, 2, 3, 2, 2, 5};
int value = 2;
int count = 0;

for (int n : arr) {
    if (n == value) count++;
    if (count == 3) break;
}

if (count >= 3)
    System.out.println("Appears at least 3 times");
else
    System.out.println("Does not appear 3 times");
}
}

