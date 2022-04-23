
class IterativeMethod 
{ 
	
	

	static int bSearch(int arr[], int n, int x)
	{
		int low = 0;
       int high = arr.length-1;
       while(high>=low ){
         int mid = low + (high -  low )/2;
         if (arr[mid]==K){
             return 1;
         }else if(arr[mid]>K){
             high = mid-1;
         }else{
             low = mid +1;
         }
       }
        return -1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

		int x = 25;
    
        System.out.println(bSearch(arr, n, x));
		
    } 

}