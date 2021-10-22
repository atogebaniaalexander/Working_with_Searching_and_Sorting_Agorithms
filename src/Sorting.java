import java.util.*;
public class Sorting {
    //method to sort list using the selection sort algorithm
    public void selectionSortForString(String[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_element = i;
            String minString = list[i];
            for (int j = i + 1; j < n; j++)
                if (list[j].compareTo(minString) < 0) {
                    minString = list[j];
                    min_element = j;
                }
            // Swap the found minimum element with the first
            if (min_element != i) {
                String temp = list[min_element];
                list[min_element] = list[i];
                list[i] = temp;
            }
        }
        orderOfStringSort(list);
    }
    //method to sort list using the bubble sort algorithm
    public void bubbleSortForString(String[] arr) {
        int n = arr.length;
        String temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }
        }
        orderOfStringSort(arr);
    }
    //method to sort list using the insertion sort algorithm
    public void insertionSortForString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j= i + 1;j<arr.length;j++){
                if (arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Please how do you want your list sorted\n1.ascending order\t\t2.descending order");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if(order ==1)

        {
        System.out.println("==========================================================================================");
        System.out.println("Sorted array in ascending order:");
        for (int a = 0; a < arr.length; a++) {
                System.out.print(arr[a] + " ");
            }

        System.out.println();
        System.out.println("==========================================================================================");
    } else if(order ==2)

        {
        System.out.println("Sorted array in descending order:");
        for (int a = arr.length - 1; a >= 0; a--) {
                System.out.print(arr[a] + " ");
            }
        System.out.println();
        System.out.println("==========================================================================================");
    } else

        {
        System.out.println("==========================================================================================");
        System.out.println("Sorry! you have entered a wrong input.");
    }
    }
    //
    //method to sort list using the selection sort algorithm
    public static void selectionSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_element = i;
            for (int j = i + 1; j < n; j++)
                if (list[j] < list[min_element])
                    min_element = j;
            // Swap the found minimum element with the first
            // element
            int temp = list[min_element];
            list[min_element] = list[i];
            list[i] = temp;
        }
        orderOfIntSort(list);
    }
    //method to sort list using the bubble sort algorithm
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        orderOfIntSort(arr);
    }
    //method to sort list using the nearly sorted algorithm
    public void nearlySorted(int[] arr) {
        int n = arr.length;
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        orderOfIntSort(arr);
    }
    //method to sort list using the shell sort algorithm
    public void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gaped insertion sort for this gap size.
            // The first gap elements a[0.gap-1] are already in gaped order
            // keep adding one more element until the entire array is
            // gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap sorted
                // save a[i] in temp and make a hole at position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until the correct
                // location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                //  put temp (the original a[i]) in its correct location
                arr[j] = temp;
            }
        }
        orderOfIntSort(arr);
    }
    //method to determine and sort list in ascending of descending
    public void orderOfStringSort(String[] list) {
        System.out.println("Please how do you want your list sorted\n1.ascending order\t\t2.descending order");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if (order == 1) {
            System.out.println("==========================================================================================");
            System.out.println("Sorted array in ascending order:");
            System.out.println("==========================================================================================");
            for (int a = 0; a < list.length; a++) {
                System.out.print(list[a] + " ");
            }
            System.out.println();
            System.out.println("==========================================================================================");
        } else if (order == 2) {
            System.out.println("==========================================================================================");
            System.out.println("Sorted array in descending order:");
            System.out.println("==========================================================================================");
            for (int a = list.length - 1; a >= 0; a--) {
                System.out.print(list[a] + " ");
            }
            System.out.println();
            System.out.println("==========================================================================================");
        } else {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    //
    public static void orderOfIntSort(int[] list) {
        System.out.println("==========================================================================================");
        System.out.println("Please how do you want your list sorted\n1.ascending order\t\t2.descending order");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if (order == 1) {
            System.out.println("==========================================================================================");
            System.out.println("Sorted array in ascending order:");
            for (int a = 0; a < list.length; a++) {
                System.out.print(list[a] + " ");
            }
            System.out.println();
            System.out.println("==========================================================================================");

        } else if (order == 2) {
            System.out.println("==========================================================================================");
            System.out.println("Sorted array in descending order:");
            for (int a = list.length - 1; a >= 0; a--) {
                System.out.print(list[a] + " ");
            }
            System.out.println();
            System.out.println("==========================================================================================");
        } else {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    //method sort list before binary search
    public static void ascendingOrderSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_element = i;
            for (int j = i + 1; j < n; j++)
                if (list[j] < list[min_element])
                    min_element = j;
            // Swap the found minimum element with the first
            // element
            int temp = list[min_element];
            list[min_element] = list[i];
            list[i] = temp;
        }
    }
    public static void ascendingOrderSortString(String[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_element = i;
            String minString = list[i];
            for (int j = i + 1; j < n; j++)
                if (list[j].compareTo(minString) < 0) {
                    minString = list[j];
                    min_element = j;
                }
            // Swap the found minimum element with the first
            if (min_element != i) {
                String temp = list[min_element];
                list[min_element] = list[i];
                list[i] = temp;
            }
        }
    }
    public static void merge(int[] list,int startPoint,int midPoint,int endPoint){
        //create temporary arrays
        int n1 = midPoint-startPoint+1;
        int n2 = endPoint - midPoint;
        int[] temp = new int[n1];
        int[] tempRight = new int[n2];
        //copy data into temporary arrays
        for(int i = 0;i < n1;++i) {
            temp[i]=list[startPoint + i];
        }
        for (int j = 0; j < n2; ++j) {
            tempRight[j]=list[midPoint + 1 + j];
        }
        int i= 0;
        int j= 0;
        // Initial index of merged subarray array
        int k = startPoint;
        while(i<n1 && j<n2){
            if (temp[i]<=tempRight[j]){
                list[k] = temp[i];
                i++;
            }else{
                list[k] = tempRight[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of temp[] if any */
        while(i<n1){
            list[k]=tempRight[i];
            i++;
            k++;
        }
        /* Copy remaining elements of tempRight[] if any */
        while(j<=n2){
            list[k]=tempRight[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] list1,int start,int end){
        if(start<end){
            int mid = start + (end - start)/2;
            mergeSort(list1, start, mid);
            mergeSort(list1, mid + 1, end);
            merge(list1,start,mid,end);
        }
    }

}




