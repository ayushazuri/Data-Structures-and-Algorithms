import java.util.*;

public class Activity_Selection
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int s[]=new int[n];
        int f[]=new int[n];
        System.out.println("Enter the Starting point and the final point, ie, Each Activity duration");
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextInt();
            f[i]=sc.nextInt();
        }
        int temp1,temp2;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(f[i]>f[j])
                {
                    temp1=f[i];
                    f[i]=f[j];
                    f[j]=temp1;

                    temp2=s[i];
                    s[i]=s[j];
                    s[j]=temp2;
                }

            }
        }
        activitySelection(s,f,n);

    }
    static void activitySelection(int s[], int f[], int n)
    {
        int j=0;
        System.out.println(s[j]+"  "+f[j]+"  index "+j);
        for(int i=1;i<n;i++)
        {
            if(s[i]>=f[j])
            {
                System.out.println(s[i]+"  "+f[i]+"  index "+ i);
                j=i;
            }
        }

    }
}
