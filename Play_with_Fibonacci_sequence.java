import java.util.*;
public class saadhik{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int s = 1;
        int ne = f+s;
        System.out.format("%d %d %d ",f,s,ne);
        n-=3;
        while(n-->0){
            f=s;
            s=ne;
            ne=f+s;
            System.out.format("%d ",ne);
        }
    }
}