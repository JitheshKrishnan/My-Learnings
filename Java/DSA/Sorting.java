package DSA;

public class Sorting {
    public static void main(String a[]){
        int arr[] = {29,47,16, 16,12,33};
        int sorted_arr[] = selectionSortMaxValue(arr);
        quickSort(arr, 0, arr.length-1);
        for(int n : sorted_arr){
            System.out.print(n + " ");
        }
    }   
    public static int[] bubbleSort(int arr[]){
        int temp;
        System.out.println("Bubble Sort: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionSortMinValue(int arr[]){
        int temp;
        int min;
        System.out.println("Selection Sort Minimum Value Method: ");
        for(int i=0; i<arr.length; i++){
            min=i;
            for(int j=0+i; j<arr.length-1; j++){
                if(arr[j+1]<arr[j]){
                    min=j+1;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    //{29,47,16,12,33}
    public static int[] selectionSortMaxValue(int arr[]){
        int temp;
        System.out.println("Selection Sort Maximum Value Method: ");
        for(int i=0; i<arr.length; i++){
            int max=0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j+1]>arr[max]){
                    max=j+1;
                }
            }
            temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[max];
            arr[max]=temp;           
        }
        return arr;
    }
    public static int[] insertionSort(int arr[]){
        int temp;
        System.out.println("Insertion Sort: ");
        for(int i=1; i<arr.length; i++){
            temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp; 
        return i+1;
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }
    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x=0; x<n1; x++){
            lArr[x] = arr[l+x];
        }
        for(int x=0; x<n2; x++){
            rArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
