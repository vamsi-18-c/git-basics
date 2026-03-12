import java.util.*;

public class movezeroes {

    public static void main(String[] mohan){
         Scanner sc=new Scanner(System.in);

         int n=sc.nextInt();
         int[] arr=new int[n];
         //read array
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }

         move(arr);
         for(int e:arr){
            System.out.println(e);
         }
    }

    //method to move zeroes
    static void move(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                         
                                int temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                                 
                          }  
                          j++;            
           }

        }
        
    }
    
