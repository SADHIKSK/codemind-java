import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int i = 1;
        while(true){
            int c=0;
            for(int j = 0 ; j < n ; j++){
                if(arr[j]==i){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.format("%d",i);
                break;
            }
            i++;
        }
    }
}