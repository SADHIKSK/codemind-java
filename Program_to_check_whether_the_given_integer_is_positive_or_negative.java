import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>0){
            System.out.format("Positive Number");
        }
        else{
            System.out.format("Negative Number");
        }
    }
}