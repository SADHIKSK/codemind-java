import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int len  = s.length();
        int c = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == 'I')
            {
                System.out.printf("%d ",c);
                c += 1;
            }
            if(s.charAt(i) == 'D')
            {
                System.out.printf("%d ",len);
                len -= 1;       
            }     
        }
        System.out.printf("%d ",c);
    }
}