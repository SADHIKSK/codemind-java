import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[n];
		int c = 0 , count = 0 ,s1 = 0 , s2 = 0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    if(arr[i]==-1){
		        c++;
		    }
		    else{
		        s1+=arr[i];
		    }
		}
		for(int i = 0 ; i < n ; i++){
		    brr[i] = sc.nextInt();
		    if(brr[i]==-1){
		        c++;
		    }
		    else{
		        s2+=brr[i];
		    }
		}
		if(c==2){
		    System.out.format("Infinite");
		}
		else{
		    for(int i = 0 ; i < 1000000 ; i++){
		        if(i+s1 == s2){
		            count++;
		        }
		    }
		    System.out.format("%d",count);
		}
	}
}