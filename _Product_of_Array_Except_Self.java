import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
		    int pro = 1;
		    for(int j = 0 ; j < n ; j++){
		        if(i!=j){
		            pro*=arr[j];
		        }
		    }
		    System.out.format("%d ",pro);
		}
	}
}