
import java.util.Scanner;

public class alex20{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {10, 22, 35, 40, 18, 50};

for (int n : arr) {
    if (n % 2 == 0 && n > 20) System.out.println(n);
}
}
}