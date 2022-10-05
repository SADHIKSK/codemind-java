import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0 , count = 0;
            for(int i = 0 ; i < n ; i++){
                for(int j = i+1 ; j < n ; j++){
                    for(int k = 0 ; k < n ; k++){
                        if(arr[i]+arr[j]==arr[k] && j!=k){
                            count++;
                        }
                    }
                }
            }
            if(count == 0 ){
                System.out.format("-1
");
            }
            else{
                System.out.format("%d
",count);
            }
        }
    }
}