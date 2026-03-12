import java.util.*;

public class twosum_2pointer {
   
    public static void main(String[] mohan){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
  
        Arrays.sort(arr);

        int left=0,right=n-1;
        boolean found=false;

        while(left<right){
            int sum =arr[left]+arr[right];

                             if(sum==k){
                               found=true;
                               break;
                             }
                             else if(sum<k){
                                 left++;
                             }
                             else{
                                 right--;
                             }
       }
     
       if(found){
      System.out.println("found");
       }
       else{
        System.out.println("not found");
       }

    }

}
