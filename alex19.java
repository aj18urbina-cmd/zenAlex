
import java.util.Scanner;

public class alex19{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String[] names = {"Ana", "Ben", "Cara"};
int[] grades = {85, 92, 78};

for (int i = 0; i < names.length; i++) {
    System.out.println(names[i] + ": " + grades[i]);
}
}
}
