import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++){
		    String s = sc.next();
		    int c = 0 ;
		    for(int j = 1  ; j < s.length() ; j++){
		        if(s.charAt(j-1)==s.charAt(j)){
		            c++;
		        }
		    }
		    System.out.format("%d
",c);
		}
	}
}