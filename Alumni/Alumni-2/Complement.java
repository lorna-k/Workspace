import java.io.*;
import java.util.*;

public class Complement
{
  
  public static void main(String[]args)
  {
        int []a={1,5,3,4,2};
        int len=a.length-1;
        int k=2; 
         
        int count=0;
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;i<len;j++)
            {
                if(a[i]!=a[j])
                {
                    if(a[i]-a[j]==k )
                     {
                        count++;
                    }
                }
            }
        }
        
        System.out.println( count);
    }
  
}