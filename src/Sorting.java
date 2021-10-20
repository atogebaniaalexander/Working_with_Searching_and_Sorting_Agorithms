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
        //create a temporary array
        int[] temp = new int[endPoint-startPoint+1];
        int i= startPoint;
        int j= midPoint + 1;
        int k = 0;
        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(i<midPoint&&j<=endPoint){
            if (list[i]<=list[j]){
                temp[k] = list[i];
                k += 1;
                i += 1;
            }else{
                temp[k] = list[j];
                k += 1;
                j += 1;

            }
        }//add elements left in the first interval
        while(i<=midPoint){
            temp[k]=list[i];
            k += 1;
            i += 1;
        }
        //add elements left in the second interval
        while(j<=endPoint){
            temp[k]=list[j];
            k += 1;
            j += 1;
        }for (i=startPoint;i<=endPoint;i++){
            list[i]=temp[i-startPoint];
        }
    }
    public static void mergeSort(int[] list1,int start,int end){
        if(start<end){
            int mid = (start + end)/2;
            mergeSort(list1, mid + 1, end);
            mergeSort(list1, start, end);
            merge(list1,start,mid,end);
        }
    }

}




