public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={3,4,22,3333,2,333,23,66,55,77,34,45};
        int size=arr.length;
        int temp=0;
         System.out.print("before sorting");
        for(int n:arr){
           
            System.out.print(n+" ");
        }

        System.out.println();
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
               
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
             for(int n:arr){
            System.out.print(n+" ");
        }
        }

System.out.println();
 System.out.print("after sorting");
         for(int n:arr){
            System.out.print(n+" ");
        }
    }
    
}
