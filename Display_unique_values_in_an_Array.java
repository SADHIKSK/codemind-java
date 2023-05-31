import java.util.*;
public class Saadhik{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int c = 0 ;
		for(int i = 0 ; i < n ; i++){
		    int x = 0;
		    for(int j = 0 ; j < n ; j++){
		        if(arr[i]==arr[j]){
		            x++;
		        }
		    }
		    if(x==1){
		        c++;
		        System.out.format("%d ",arr[i]);
		    }
		}
		if(c==0){
		    System.out.format("-1");
		}
	}
}