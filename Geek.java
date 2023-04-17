import java.io.*;
import java.util.Objects;
  
public class Geek 
{
      
    public String name;
    public int id;
    
 
          
    Geek(String name,Integer id ) 
    {
              
        this.name = name;
        this.id=id;
        
        // this.id = id;
    }
      
    @Override
    public boolean equals(Object obj)
    {
          
    
    if(this == obj)
            return true;
          
       
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        
        Geek geek = (Geek) obj;
   
        return (geek.name == this.name && geek.id== this.id);
    }
      
    @Override
    public int hashCode()
    {
      
    
        return this.id;
     }
      
}
  