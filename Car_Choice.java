import java.util.*;
public class cars
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t,x1,x2,y1,y2;
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            x1=s.nextInt();
            y1=s.nextInt();
            x2=s.nextInt();
            y2=s.nextInt();
            float c1=(float)x1/y1;
            float c2=(float)x2/y2;
            if(c1<c2)
            {
                System.out.println("1");
            }
            else if(c1==c2)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}