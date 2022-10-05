import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0 ; i < n-1 ; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i = 1 ; i <= n ; i++){
                int c= 0 ;
                for(int j = 0 ; j < n ; j++){
                    if(i==arr[j]){
                        c++;
                    }
                }
                if(c==0){
                    System.out.format("%d
",i);
                    break;
                }
		    }
		}
	}
}