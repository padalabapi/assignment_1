
import java.util.Scanner;
class problem_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int var = arr[i];
        }
        int min=arr[0]-0;
        for(int i=0;i<n;i++)
        {
            if(min<(arr[i]-i))
            {
                while((arr[i]-i)!=min)
                {
                    System.out.print((min+i)+" ");
                    min++;
                } 
            }           
        }   
        
    }
}