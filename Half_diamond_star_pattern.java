import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<3){
            System.out.format("The pattern is not possible");
        }
        else{
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ; j++){
                    if(i>=j){
                        System.out.format("*");
                    }
                }
                System.out.format("
");
            }
            for(int i = 1 ; i < n ; i++){
                for(int j = 1 ; j < n ; j++){
                    if(i<=j){
                        System.out.format("*");
                    }
                }
                System.out.format("
");
            }
        }
    }
}