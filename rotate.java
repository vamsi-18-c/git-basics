 import java.util.*;

class rotate {

    public static void main(String[] mohan){
        Scanner sc=new  Scanner(System.in); // read input 
        int d=sc.nextInt(),n=sc.nextInt();
        
        int[] array = new int[n];

        for(int i=0;i<n;i++) {
             array[i]=sc.nextInt();
        }

        rotate(array,d);

        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }

    static void rotate(int[] array,int d){
        int n=array.length;
        d%=n;
     reverse(array,0,n-1);

     reverse(array,0,d-1);

     reverse(array,d,n-1);
    }

    static void reverse(int[] array,int start, int end){
         
      while(start<end){
         int temp=array[start];
         array[start]=array[end];
         array[end]=temp;

         start++;
         end--;
      }



    }

}
