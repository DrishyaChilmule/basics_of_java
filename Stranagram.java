public class Stranagram
{
   public static void main(String[] args)
    {
            String name1 = "ram";
            String name2 = "arm";

          char[] c1 =name1.toCharArray();
          char[] c2= name2.toCharArray();
         
            Arrays.sort(c1);  //a,m,r
            Arrays.sort(c2); // a,m,r
		
		//we varify both element are equal or not
		if (Arrays.equals(c1, c2)==true)
		{
	          System.out.println("given string is Anagram");
		}
		else
		{
                   System.out.println("given string is not Anagram");
		}
   }

}