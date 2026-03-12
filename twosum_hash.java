import java.util.*;
public class twosum_hash {

    public static void main(String[] mohan){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),k=sc.nextInt();
       int[] arr=new int[n];
               for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
               }
                    Set<Integer> set=new HashSet<>();
                    boolean b=false;

                             for(int i=0;i<n;i++){
                              int compliment=k-arr[i];
                              if(set.contains(compliment)){
                                  b=true;
                                  break;
                              }
                              set.add(arr[i]);
                             }
       
       if(b){
        System.out.println("found");
       }
       else{
        System.out.println("not found");
       }
       
       
          }
}
