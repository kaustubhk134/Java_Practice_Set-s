// Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;
public class P4 {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NON LEAP YEAR");
        }

        
    }
    
}

