public class FibonacciSeries
{

   public static void main(String[] args)
{
     //0,1,1,2,3,5,8,13......

     int no1=0; int no2=1;
   System.out.print(no1+ "," +no2);

      int time =10;
     for(int i=1;i<=time;i++)
         {
            int sum=no1+no2;
           System.out.print(","+sum);
           no1=no2;
           no2=sum;


         }

    
     


}





}