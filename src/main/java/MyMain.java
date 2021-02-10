import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++){
            int b = list.get(i);
            int c = i - 1;
            while ((c > -1) && (list.get(c) > b )){
                list.set(c+1, list.get(c));
                c -= 1;
            }
            list.set(c + 1, b);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int c = 0;
        int b = 0;
        int t = 0;
        int[] oa = new int[arr1.length + arr2.length];
        while(arr2[b] < arr1[c]){
            arr2[b] = oa[t];
            b++;
            t++;
        }
        while(arr2[b] > arr1[c]){
            arr1[c] = oa[t];
            c++;
            t++;
        }   
        return oa;        
     
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
