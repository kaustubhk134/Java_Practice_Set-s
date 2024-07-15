// In a program,input 3 numbers: A, B and C .You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;
public class P1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter FIRST no : ");
        int a = sc.nextInt();
        System.out.println("Enter SECOND no : ");
        int b = sc.nextInt();
        System.out.println("Enter THIRD no : ");
        int c = sc.nextInt();

        System.out.println("The Average is : "+ (a + b + c) / 3 );
    }
    
}
