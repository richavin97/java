package sortingalogrithms;

import java.util.Arrays;
/*
 * This class is to demonstrate the bubble-sort algorithm
 *
 * */
public class BubbleSort {
  static int[] swap(int[] arr, int i,int j){
    int temp;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
    }
  public static void main(String[] args) {
    int[] array = {6,5,4,3,2,1};
    System.out.println("Input Array is "+Arrays.toString(array));
    //swapArr = swap(array,0,4);
    for(int i=0; i < array.length; i++){
      for(int j = 0; j<array.length; j++ ){
        if(array[i]< array[j]){
          array = swap(array,i,j);
          }
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
