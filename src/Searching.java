public class Searching {

    public static int linearSearch(int[] a,int searchKey) {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == searchKey)
                return i;
        }
        return -1;
    }
    public static int linearSearchForString(String[] a,String searchKey) {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            if (a[i].equals(searchKey))
                return i;
        }
        return -1;
    }
    public static int binarySearchForString(String[] a,String searchKey) {
        int highest=a.length-1;
        int lowest=0;
        while (lowest<= highest) {
            int mid = lowest + (highest - lowest) / 2;
            int res = searchKey.compareTo(a[mid]);
            if (res == 0){
                return mid;
            }
            else if(res > 0){
                lowest = mid + 1;
            }
            else{
                highest=mid - 1;
            }
        }
        return -1;
    }
    public  static int searchIntItems(int[] array, int searchingFor) {
        int low=0;
        int high = array.length;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (array[middle] == searchingFor) {
                return middle;
            } else if (array[middle] < searchingFor) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
