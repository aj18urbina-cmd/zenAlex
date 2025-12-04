
import java.util.Scanner;

public class alex18{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {3, 5, 7, 3, 9};
boolean duplicate = false;

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            duplicate = true;
            break;
        }
    }
}

if (duplicate) System.out.println("Duplicates found");
else System.out.println("No duplicates");
}
}