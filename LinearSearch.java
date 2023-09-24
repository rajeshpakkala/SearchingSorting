class New{
    public int methodd(int arr[],int target){
        int n=arr.length; 
        if(arr.length==0 || arr==null){
            return -1;
        }   
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
            else{
                i=i++;
                
            }
        }
        return -1;
    }
}
public class LinearSearch{
    public static void main(String[]args){
        int arr[]=new int[]{2,3,4,5,6,7,55,444};
        New obj=new New();
        System.out.println(obj.methodd(arr,444));
    }

}