public class Min {
    public static void main(String[] args) {
      
    int arr[]={3,4,2,1};
    int n=arr.length;
    int temp=0;
   int min=-1;

    System.out.println("before sorting");

     for(int a:arr){
        System.out.print(a+" ");
    }
    System.out.println();

    for(int i=0;i<n-1;i++)
    {
        min=i;
        for(int j=i;j<n;j++){
            if(arr[j]<=arr[min])
                min=j; 
        }
        if(min!=i)//min and i will be pointing same
        {
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
             
            }
        System.out.println();
            for(int a:arr){
                System.out.print(a+" ");
        }
  }
    System.out.println();
    System.out.println("after sorting");
    for(int a:arr){
        System.out.print(a+" ");
    }
}
   
}

