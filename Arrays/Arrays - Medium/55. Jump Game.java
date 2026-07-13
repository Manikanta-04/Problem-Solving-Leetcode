import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=ss.nextInt();
        }
        int flag=n-1;
        for(int i=n-2;i>=0;i--){
            if((arr[i]+i)>=flag){
                flag=i;
            }
        }
        if(flag==0) System.out.print("true");
        else System.out.print("false");
    }
}