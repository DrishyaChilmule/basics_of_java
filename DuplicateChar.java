// here we find duplicatechar

public class DuplicateChar
{
    public static void main(String[] args)
{

              String s = "pallavi";  // a,l
               int count = 0;

              char[] ch =s.toCharArray();

             for(int i=0;i<s.length();i++)
              {
                for(int j=i+1;j<s.length();j++)
                 {
                    if(ch[i]==ch[j])
                        
                     {
                         count++;
                     System.out.println("duplicate char is:"+ch[j]);
                     }

                 }


               }          
                 System.out.println("count of the duplicate char:" +count); 
}

}