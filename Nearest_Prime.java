import java.util.*;
class Love{
    public static void prime(int a){
        int left=0,l=0,r=0,right=0,fact=0;
        for(int i=a;left==0;i--){
            fact=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                fact++;
            }
            if(fact==1){
                left=i;
                l=a-left;
                break;
            }
        }
        for(int i=a;right==0;i++){
            fact=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                fact++;
            }
            if(fact==1){
                right=i;
                r=right-a;
                break;
            }
        }
        if(r>l || r==l)
        System.out.format("%d
",left);
        else if( r<l )
        System.out.format("%d
",right);
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0){
		    int num = sc.nextInt();
		    prime(num);
		}
	}
}