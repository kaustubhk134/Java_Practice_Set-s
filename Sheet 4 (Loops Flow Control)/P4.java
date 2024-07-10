// Write a program to print the multiplication table of a number N, entered by theuser.
import java.util.*;
public class P4 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int mul = 0;
        for (int i = 1; i <= 10; i++){
            mul = n * i;
            System.out.println(mul);
        }
    }   
}