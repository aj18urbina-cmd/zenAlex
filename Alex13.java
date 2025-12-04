
import java.util.Scanner;

public class Alex13{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] grades = {80, 74, 90, 60, 77};
int pass = 0, fail = 0;

for (int g : grades) {
    if (g >= 75) pass++;
    else fail++;
}

System.out.println("Passed: " + pass);
System.out.println("Failed: " + fail);
}
}

