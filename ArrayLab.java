import java.util.Arrays;
import java.util.Collections;

public class ArrayLab {

    public static int findIndex(int[] arr, int targetValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }
    

    public static void swapValues(int[] arr, int index1, int index2) {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("Error: Cannot swap because index is not in range.");
        }
    }

    public static void sortDescending(int[] arr) {
        Integer[] tempArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        
        Arrays.sort(tempArr, Collections.reverseOrder());
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }
    }
    
  
    public static int linearSearch(int[] arr, int targetValue) {
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int targetValue) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == targetValue) {
                return mid;
            } else if (arr[mid] < targetValue) {
                low = mid + 1;
            } else { 
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] array = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1};
        System.out.println(" Array Operations ");
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println(" ");

        
        int index10 = findIndex(array, 10);
        System.out.println("1) findIndex(10): Index " + index10 + " (Value " + (index10 != -1 ? array[index10] : "N/A") + ")");
        System.out.println(" ");

        
        swapValues(array, 0, 9);
        System.out.println("2) swapValues(0, 9): " + Arrays.toString(array));
        System.out.println(" ");
        
      
        array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1}; 

       
        Arrays.sort(array); 
        System.out.println("3a) Ascending Sort: " + Arrays.toString(array));
        
        
        sortDescending(array);
        System.out.println("3b) Descending Sort: " + Arrays.toString(array));
        System.out.println(" ");
        
        
        array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1}; 

        int linearResult = linearSearch(array, 8);
        System.out.println("4. Linear Search for 8: Index " + linearResult + " (Original Array)");
        System.out.println(" ");
        
        
        Arrays.sort(array); 
        System.out.println("Array Sorted for Binary Search: " + Arrays.toString(array));
        int binaryResult = binarySearch(array, 5);
        System.out.println("5. Binary Search for 5: Index " + binaryResult);
        System.out.println(" ");
    }
}