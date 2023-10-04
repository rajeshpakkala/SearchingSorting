public class SelectionSorting {
    public static void main(String[] args) {
       int arr[]={6,7,4,2,5};
       int size=arr.length;
       int temp=0;
       int minIndex=0;

       System.out.println("before sorting");
       for(int a:arr){
        System.out.print(a+" ");
       }
         System.out.println();
       
         
       for(int i=0;i<size-1;i++)
       {
         minIndex=i;
         for(int j=i;j<size;j++)
           {
             if(arr[minIndex]>arr[j])
                minIndex=j;
          
           }
           

           if(minIndex!=i){

            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            System.out.println();
            
            for(int a:arr){
        System.out.print(a+" ");
       
    }
}
    
        
       }
  



       System.out.println();
        System.out.println("after sorting");
       for(int a:arr){
        System.out.print(a+" ");
       }
    }
    
}
