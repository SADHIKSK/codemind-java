import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0 ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i]<arr[i+1]){
                s+=arr[i+1]-arr[i];
            }
        }
        System.out.format("%d",s);
    }
}