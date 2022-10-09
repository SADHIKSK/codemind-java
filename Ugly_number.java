import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0 ;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                x++;
                break;
            }
        }
        if(x==1){
            System.out.format("Not Ugly Number");
        }
        else{
            System.out.format("Ugly Number");
        }
    }
}