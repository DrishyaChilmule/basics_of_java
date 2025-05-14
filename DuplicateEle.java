// here we find duplicate ele

public class DuplicateEle
{
     public static void main(String[] args)
      
      {
            int[] a = {2,3,5,2,4,5};     //2,5
    
           for(int i=0;i<a.length;i++)
             {
             for(int j =i+1;j<a.length;j++)
             {
                if(a[i]==a[j])
                {
                  System.out.println("duplicate ele is:"+a[j]);
                }

             }

             }
      }

}