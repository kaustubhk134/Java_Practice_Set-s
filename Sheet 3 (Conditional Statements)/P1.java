// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;
public class P1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the NUMBER : ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("POSSITIVE NUMBER");
        }else if (num < 0){
            System.out.println("NEGATIVE NUMBER");
        }else{
            System.out.println("NUMBER is ZERO");
        }
    }
    
}
