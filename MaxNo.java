// check max no
public class MaxNo
{
     public static void main(String[] args)
     {
              int[] a = {2,10,50,32,7};
                   
                int max = a[0];
              
              for(int i=1;i<a.length;i++)
                {
                  if(a[i]>max)
                    {
                       max=a[i];

                       
                    }
                   
                }
                  System.out.println("max value is:"+max);


     }




}