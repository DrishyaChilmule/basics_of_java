public class Leafyear
{
   public static void main(String[] args)
   {
     int year = 2028;
      if((year%400==0)|| (year%4==0 && year%100!=0))
      {
         System.out.println("year is leaf year");
     }
     else
     {
        System.out.println("year is not leaf year");
    }


 }


}