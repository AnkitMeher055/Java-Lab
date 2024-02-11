import java.util.*;
public class Minimum_notes
{  
  public static void main(String args[])
  {
    int amt=Integer.parseInt(args[0]);
    System.out.println("Entered amount: "+amt);
    
    int c=0;
    if(amt>=2000)
    {
       c=amt/2000;
       amt=amt%2000;
 System.out.print("2000 x "+c);

    }
    if(amt>=500)
       {  
          c=amt/500;
          amt=amt%500;
           System.out.print(" + 500 x "+c);

        }
    if(amt>=200)
          {  
             c=amt/200;
             amt=amt%200;
 System.out.print(" + 200 x "+c);

           } 
     if(amt>=100)
             {  
                 c=amt/100;
                 amt=amt%100;
System.out.print(" + 100 x "+c);
             }
      if(amt>=50)
                 {  
                    c=amt/50;
                    amt=amt%50; 
System.out.print(" + 50 x "+c);

                  }
       if(amt>=20)
                    {  
                      c=amt/20;
                      amt=amt%20;
System.out.print(" + 20 x "+c);

                    }
     if(amt>=10)
                      {  
                         c=amt/10;
                         amt=amt%10;
System.out.print(" + 10 x "+c);

                      }
           if(amt>=5)
                         {   
                           c=amt/5;
                           amt=amt%5;
System.out.print(" + 5 x "+c);

                         } 
           if(amt>=2)
                      {  
                           c=amt/2;
                           amt=amt%2;
 System.out.print(" + 2 x "+c);

                       }
             if(amt>=1)
                                  {  
                                   c=amt/1;
                                   amt=amt%1;
System.out.print(" + 1 x "+c);

                                 }

}
}