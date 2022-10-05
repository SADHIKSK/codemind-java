import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i = 0 ; i < m ; i++){
            brr[i] = sc.nextInt();
        }
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            int c = 0 ;
            for(int j = 0 ; j < m ; j++){
                if(arr[i]==brr[j]){
                    c++;
                }
            }
            if(c>0){
                count++;
            }
        }
        if(count==n && count==m){
            System.out.format("True");
        }
        else{
            System.out.format("False");
        }
    }
}