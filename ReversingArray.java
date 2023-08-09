package ReversingArray;

import java.util.Arrays;

public class ReversingArray {

 public void reverseArray(int [] array){
     int start=0,end=array.length-1;
     while (start<end){
         int temp=array[start];
         array[start]=array[end];
         array[end]=temp;
         start++;
         end--;
     }
     System.out.println( "The reversed Array is" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        ReversingArray ra=new ReversingArray();
        ra.reverseArray(new int[] {1,2,3,4,5,6,7,8,9,10});
    }
}