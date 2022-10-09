import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n ; i > 0 ; i--){
            for(int j = n ; j > 0 ; j--){
                if(j==i){
                    System.out.format("%d ",j);
                }
                else if(i+j==n+1){
                    System.out.format("%d ",i);
                }
                else
                System.out.format(" ");
            }
            System.out.format("
");
        }
    }
}