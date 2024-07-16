// Enter cost of 3 items from the user (using float data type)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
public class P3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Cost of PENCIL : ");
        float pencil = sc.nextFloat();
        System.out.println("Cost of PEN : ");
        float pen = sc.nextFloat();
        System.out.println("Cost of ERASER : ");
        float eraser = sc.nextFloat();

        float sum = (pencil + pen + eraser);
        float addgst = (sum * 0.18f);
        float finalsum = (addgst + sum);

        System.out.println("Total Bill with 18% GST : "+ finalsum);
    }
}
