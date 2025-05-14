//REVERSE STRING
public class RevSTR
{
   public static void main(String[] args)
{
                      //012
          String input="ABC";
          String output="";

       for(int i=input.length()-1;i>=0;i--)
           {
              output =output+input.charAt(i);
             

           }
 System.out.println("reverse string:"+output);

}




}