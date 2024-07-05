// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;
public class P2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of Integers : ");
        int n = sc.nextInt();

        int oddInt = 0;
        int evenInt = 0;

        for (int i = 1; i <= n; i++){
            System.out.println("Enter the Interge : ");
            int integer = sc.nextInt();

            if(integer % 2 == 0){
                evenInt = evenInt + integer;
            }else{
                oddInt = oddInt + integer;
            }
        }
        System.out.println("Sum of EVEN Integer : "+ evenInt);
        System.out.println("Sum of ODD Integer : "+ oddInt);
        
    }
    
}