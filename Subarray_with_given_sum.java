import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int c = 0 , s = 0 ;
            int[] arr = new int[n];
            for(int i = 0 ; i < n ;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n ; i++){
                s = 0;
                for(int j = i ; j < n ; j++){
                    s += arr[j];
                    if(s == k){
                        System.out.format("%d %d
",i+1,j+1);
                        c+=1;
                        break;
                    }
                }
                if(s == k ){
                    break;
                }
            }
            if(c==0){
                System.out.format("-1
");
            }
        }
    }
}