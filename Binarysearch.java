package binarysearch;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={1,34,56,66,94,78,94,109};
        int target=56;
        boolean result=false;// we are assuming that target is not present in the array.
        int n=arr.length;
        int l=0,r=n-1,mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(target<arr[mid]){
                r=mid-1;

            }

            else if(target>arr[mid]){
                l=mid+1;
            }
            else if(target==arr[mid]){
                result=true;
                break;

            }


        }
if(result){
    System.out.println("element is found at index:" + mid);
}
else{
    System.out.println("element is not found:");
}
       

    }
}
