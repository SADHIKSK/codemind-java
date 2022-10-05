import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int f=-1,s=-1;
		for(int i = 0 ; i < n ; i++){
		    if(f==-1 && arr[i]==t){
		        f=i;
		    }
		    if(arr[i]==t && f!=-1){
		        s=i;
		    }
		}
		System.out.format("%d %d",f,s);
	}
}