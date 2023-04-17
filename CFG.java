public class CFG
{
      
    public static void main (String[] args)
    {
      
        // creating the Objects of Geek class.
        Geek g1 = new Geek("aa", 22);
        Geek g2 = new Geek("aa", 22);
          
        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. "); 
    } 
}