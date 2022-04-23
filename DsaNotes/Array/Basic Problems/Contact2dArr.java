
import java.util.*;
public class Contact2dArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt(); 
            }
        }
        sc.close();
        contactSumOf2dArr(arr);
    }

    private static void contactSumOf2dArr(int[][] arr) {
        int SumMax = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];               
            }
               if(SumMax < sum){
                   SumMax = sum;
               }
        }
        System.out.println(SumMax);

    }
}
