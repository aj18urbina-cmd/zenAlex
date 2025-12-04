
import java.util.Scanner;

public class Alex5{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {3, 5, 7, 1, 4};
int target = 7;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index " + i);
        break;
    }
}
}
}