public class BobbleSort {

    // https://www.geeksforgeeks.org/bubble-sort/
    // the algorithms described above
    private void sort(int[] arr){
        boolean swapped = true;
        while(swapped){
            for (int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    swapped = true;
                }
            }
            swapped = false;
        }

    }

    private void printArray(int[] arr){
        for(int a: arr){
            System.out.println(a+" ");
        }
    }

    public static void main(String[] arg){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BobbleSort ob = new BobbleSort();
        ob.sort(arr);
        ob.printArray(arr);

    }
}
