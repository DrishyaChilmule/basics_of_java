public class CountEachOccurance
{
  public static void main(String[] args)
{
     String str = "aabbccc";
     System.out.println(str.length());
        int count=0;

         for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)=='c')
             {
             count++;
             }

          }
 System.out.println("count of c is:"+count);
 


}




}