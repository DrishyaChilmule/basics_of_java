public class Countvovels
{
  public static void main(String[] args)
{
     String str = "aabbeccci";
     System.out.println(str.length());
        int count=0;

         for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' && str.charAt(i)=='i')
             {
             count++;
             }

          }
 System.out.println("count of vovels is:"+count);
 


}




}