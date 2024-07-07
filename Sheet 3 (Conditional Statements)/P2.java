// Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
import java.util.*;
public class P2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your TEMPRATURE : ");
        float temp = sc.nextFloat();
        if (temp > 100){
            System.out.println("You Have Fever");
        }else{
            System.out.println("You Don't have Fever");
        }
    }
}
