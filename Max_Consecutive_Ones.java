import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0 ,m = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            if(arr[i]==1){
                c++;
            }
            if(arr[i]==0){
                if(m<c){
                    m=c;
                }
                c=0;
            }
        }
        if(m<c){
            System.out.format("%d",c);
        }
        else{
            System.out.format("%d",m);
        }
    }
}