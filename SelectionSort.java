package sortingalogrithms;

import java.util.Arrays;
/*
 * This class is to demonstrate the selection-sort algorithm
 *
 * */
public class SelectionSort {
  public static void main(String[] args) {
    int temp, index;
    int[] array = {10,32,43,21,89,24};
    System.out.println("Input Array is "+Arrays.toString(array));
    for(int i = 0;i<array.length-1;i++){
      index =i;
      for(int j = i+1; j<array.length;j++){
        if (array[j] < array[i]) {
          index = j;
        }
      }
      temp = array[i];
      array[i] = array[index];
      array[index] = temp;
    }
    System.out.println("Output Array is "+Arrays.toString(array));
  }
}
