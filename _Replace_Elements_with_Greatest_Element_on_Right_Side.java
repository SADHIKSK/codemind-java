import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++){
            int m = -1 ;
            for(int j = i+1 ; j < n ;j++){
                if(m<arr[j]){
                    m = arr[j];
                }
            }
            System.out.format("%d ",m);
        }
        System.out.format("-1");
    }
}