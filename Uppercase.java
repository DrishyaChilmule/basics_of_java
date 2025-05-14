public class Uppercase
{
  public static void main(String[] args)
{
     String s ="DrIsHyA";
     char[] ch =s.toCharArray();
        int uppercase = 0;
        int lowercase = 0;

        for(int i=0; i<s.length();i++)
         {
            if(Character.isUpperCase(ch[i]))
              {
                   uppercase++;
              }

              if(Character.isLowerCase(ch[i]))
               {
                  lowercase++;

               }

         }    
                System.out.println("count of uppercase is:"+uppercase);
                System.out.println("count of lowercase is:"+lowercase);

}


}