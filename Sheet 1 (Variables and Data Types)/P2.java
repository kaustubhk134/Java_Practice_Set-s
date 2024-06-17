// In a program,input the side of a square.You have to output the area of the square.(Hint : area of a square is (side x side))
import java.util.*;
public class P2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the side of SIDE of the square : ");
        int side = sc.nextInt();

        System.out.println("Area of Square : "+ (side * side));

    }
    
}
