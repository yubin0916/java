package test.java;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={23,34,12,6,45,32};
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
