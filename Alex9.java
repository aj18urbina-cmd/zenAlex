
import java.util.Scanner;

public class Alex9{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int sum = 0, n;

while (true) {
    System.out.print("Enter number (0 to stop): ");
    n = sc.nextInt();
    if (n == 0) break;
    sum += n;
}

System.out.println("Sum = " + sum);
}
}
