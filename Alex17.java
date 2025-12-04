
import java.util.Scanner;

public class Alex17{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {10, 45, 32, 50, 20};
int highest = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int n : arr) {
    if (n > highest) {
        second = highest;
        highest = n;
    } else if (n > second && n != highest) {
        second = n;
    }
}

System.out.println("Second highest: " + second);
}
}