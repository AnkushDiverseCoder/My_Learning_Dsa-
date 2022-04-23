package Array;
import java.util.*;

public class ContactArray{
    private static void Contactarray(int[] arr) {
       int[] Contactarr = new int[2*arr.length];
       for (int i = 0; i < Contactarr.length; i++) {
           if(i<4){
               Contactarr[i]=arr[i];
           }else{
               Contactarr[i]=arr[i-4];
           }
       }

       for (int i = 0; i < Contactarr.length; i++) {
        System.out.println(Contactarr[i]);
       }   
    } 
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int[] arr = new int [4];
           for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
           }
         Contactarray(arr);
    }    
}