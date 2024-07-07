// Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class P3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " +n +" = " + factorial);
    }
    
}
