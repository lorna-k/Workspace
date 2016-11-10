import java.util.*;
import java.io.*;


public class Brackets
{
   public static boolean isBalanced(String expression) 
   {
      boolean answer=true;
      LinkedList<String> input=new LinkedList<String>(Arrays.asList(expression.split("")));
      
      for(int i=0;i<(input.size())/2;i++)
      {
         if(answer)
         {
            String open_brace=input.pollFirst();
            String close_brace=input.pollLast();
            System.out.println(close_brace+" "+open_brace);


            if(!(match(open_brace,close_brace)))
            {
               answer=false;
            }
         }
         
         
      }
      
      return answer;
   }
     
     
   public static boolean match(String open_brace, String close_brace)
   {
       LinkedList<String> open=new LinkedList<String>(Arrays.asList("{","[","("));
       LinkedList<String> close=new LinkedList<String>(Arrays.asList("}","]",")"));
       boolean answer=true;
   
      if(open.indexOf(open_brace)==close.indexOf(close_brace))
      {
           answer=true;
      }
      else
      {
          answer=false;
      } 
      
      
      return answer;

    }
      
   public static void main(String[] args)
   {
      
      
                                                                     
      System.out.println(isBalanced("{[()]}"));
      
      
      /*
      String braces[]={"{}[]()","{[}]}"};
      LinkedList<String> input=new LinkedList<String>(Arrays.asList(braces));
      LinkedList<String> open=new LinkedList<String>(Arrays.asList("{","[","("));
      LinkedList<String> close=new LinkedList<String>(Arrays.asList("}","]",")"));
      String[] answers=new String[input.size()];
      
      
      //System.out.println(Arrays.asList(open).indexOf("{"));
      
      
      for(int i=0;i<input.size();i++)
      {
         
            
            String[] piece=input.get(i).split("");
            
            for(int j=0;j<piece.length;j++)
            {
                
                 if(j+1<piece.length)
                 {
                     if(open.indexOf(piece[j])==close.indexOf(piece[j+1]))
                     {
                        if(j+2==piece.length)
                        {
                          answers[i]="YES";
                           j+=2;
                        }
                        
                        else
                        {
                           j++;
                        }
                     }
                     else
                    {
                      answers[i]="NO";
                      j++;
                    }
                     
                 }
                 else
                 {
                   answers[i]="NO";
                   j++;
                 }
            
            
            } 
            
             
         
      }
      
      for(String answer:answers)
            {
               System.out.println(answer);
            } 
       */
      
   }
   
   
  
}