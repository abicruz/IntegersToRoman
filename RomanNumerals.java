
import javax.swing.JOptionPane;

/**
 *
 * @author Abigail
 */
public class RomanNumerals 
{
public static String IntegerToRoman(int a)
    {
        
        String romanNum = "";
        int numLet;
        
        int numbers[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String letters[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", 
            "V", "IV", "I"};
  
        for(int x=0; a>0; x++)
        {
            numLet = a/numbers[x];
            for(int i = 1; i <= numLet; i++)
            {
                romanNum = romanNum + letters[x];
            }
              a = a % numbers[x];
        }
        return romanNum;
    }
 
    public static void main(String args[])
    {
        
        String number = JOptionPane.showInputDialog("Enter the number you wish to "
                + "convert to Roman Numerals:") ;
        int num = Integer.parseInt(number) ;
        System.out.println(number + ": "+IntegerToRoman(num));
       
        String another = "";
       
         do
            {
      
        
             another = JOptionPane.showInputDialog("Do you wish to convert "
                       + "another number? (Write Y/y for yes, N/n for no, or "
                       + "click 'Cancel' to quit)") ;

             if (another == null || another.equalsIgnoreCase("n"))
              {
                  System.out.println("\nThank you! :-)") ;
              }

             else if (another.equalsIgnoreCase("Y"))
              {
               number = JOptionPane.showInputDialog("Enter the number you wish to "
                       + "convert to Roman Numerals:") ;
               num = Integer.parseInt(number) ;
               System.out.println(number + ": "+IntegerToRoman(num));		

              }
            }              
      while (!(another == null || another.equalsIgnoreCase("n"))) ;
      
     
    
    }
}
