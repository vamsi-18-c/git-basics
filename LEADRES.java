import java.util.Scanner;

class LEADRES {

    public static void main(String[] mohan) {
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int leader =a[n-1];
        System.out.print(leader+" ");
        for(int i=n-2;i>=0;i--){
            if(a[i]>leader){
                leader=a[i];
                System.out.print(leader+" "); 
            }
        }
    }
}