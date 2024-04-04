package Sorting;

import java.util.Scanner;

public class Bubblesort {
    //bubble sort is stable sort
    public static void main(String[] args) {
        //to check whether a array is sorted or not.
//        int[] arr={34,39,45,46,98,101};
//        boolean flag=true; //by default, we are assuming it is sorted
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]>arr[i+1]){
//                flag=false;
//                break;
//            }
//        }
//      if(flag){
//          System.out.println("given array is sorted");
//      }
//      else{
//          System.out.println("the given array is not sorted");
//      }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort code 1;
        //worst case
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            //optimisation of the code
            //after each pass we will check whether the array is sorted or not
            boolean flag=true ;
            for(int k=0; k<arr.length-1-i;k++){
                if(arr[k]>arr[k=1]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        //after sorting
        for(int item: arr){
            System.out.println(item+" ");
        }
    }

}
//**** stable and unstable sort
//stable sort:
// Given : 6,1,3,2,3*  ... two three after stable sort 1,2,3,3*,6
//unstable sort:  ... 1,2,3*,3,6


//best case me when already sorted O(n)
