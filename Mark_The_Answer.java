import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0 , s = 0 ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>k && s==1){
                break;
            }
            else if(arr[i]>k){
                s++;
            }
            else{
                count++;
            }
        }
        System.out.format("%d",count);
    }
}