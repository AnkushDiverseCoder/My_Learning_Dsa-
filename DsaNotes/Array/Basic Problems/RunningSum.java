package Array;
import java.util.*;
class RunningSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      RunningSumOf1d(arr);
    }

    private static void RunningSumOf1d(int[] arr) {
        int last_element = 0;
        int[] RunningSumArr = new int[4];
        for (int i = 0; i < RunningSumArr.length; i++) {
            int sum = last_element + arr[i];
            RunningSumArr[i]= sum;
            int temp = sum;
            sum= last_element;
            last_element =temp; 
        }
        for (int i = 0; i < RunningSumArr.length; i++) {
            System.out.println(RunningSumArr[i]);
        }
    }
}