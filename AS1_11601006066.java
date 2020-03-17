public class AS1_116010060 {
	
    private static int find(int[] data, int k) {

        if (data == null || data.length == 0)						//Check the validity of the array
        	{System.out.println("The data input is empty");
            return -1;}
        if (k < 0 || k > data.length - 1)
        	{System.out.println("The index is out of bound");
            return -1;}
        
        
        int left = 0, right = data.length - 1;
        
        int pivot = quicksort(data, left, right);
        
        while (pivot != k) {								//This is the optimized part, we don't need to sort the while array
            if (pivot > k) {
                right = pivot - 1;
                pivot = quicksort(data, left, right);

            } else {
                left = pivot + 1;
                pivot = quicksort(data, left, right);
            }
        }
        
        System.out.print("The "+(k+1)+"th smallest number is: " + data[pivot]);
        return data[pivot];
       
    }
	
    private static int quicksort(int[] data, int left, int right) {	//The ordinary quicksort method
		
        int middle = data[left];
        
        while (left < right) {
            while (left < right && data[right] >= middle)
                right--;
            data[left] = data[right];
            while (left < right && data[left] <= middle)
                left++;
            data[right] = data[left];
        }
        
        data[left] = middle;
        return left;
    }


	
	public static void main(String[] args) {

	    int[] data = {6,3,66,423,45,69,77};				//Note that this is the input of data, input the array you would like to sort
	    
		int k = 1;										//Note that this is the input of k, aimed at finding the kth smallest number 		
		
		long starttime = System.currentTimeMillis();	
		find(data,k-1);									//Do not input anything here, k-1 is because there is no 0th smallest number in pratice
		long finishtime = System.currentTimeMillis();
		
		System.out.println("  ");						
		System.out.println("The running time of optimized quicksort is:"+(finishtime-starttime)+"ms");
														//This help test the program running time
 
	}
}
