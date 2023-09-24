import java.util.Arrays;
class Binary{
 public int methodd(int arr[],int target){
        int n=arr.length;
        int start=arr[0];
        int end=arr.length-1; 
        if(arr.length==0 || arr==null){
            return -1;
        }
        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
        
        else if(arr[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
}
return -1;
}
}
public class BinarySearch {
    public static void main(String[]args){
 int arr[]=new int[]{2,3,4,5,6,7,1,55,4444};
     Binary obj=new Binary();
        System.out.println(obj.methodd(arr,4));
      
    }
    
}
