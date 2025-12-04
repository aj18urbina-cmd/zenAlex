
import java.util.Scanner;

public class Alex7{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {-3, 5, -7, 2};

for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 0) arr[i] = -arr[i];
}
}
}
