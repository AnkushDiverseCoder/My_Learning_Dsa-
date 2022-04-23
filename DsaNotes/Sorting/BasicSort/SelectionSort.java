package Sorting.BasicSort;
/*
   1:- Selection Sort Is Unstable 
   2:- Space Complexity is 0(1) Time Complexity O(n*n)
   3:- Does less Memory Writes than anyother sorting algorithm except cycle sort
   4:- Basic Idea of Heap Sort 
*/
class GFG {
    
    
    static void selectionSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            int min_ind = i;
            
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }
    
    
	public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    selectionSort(a, 4);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}