package containdigitonly.com;

public class CheckIfDigitOnly {

  public static void main(String[] args) {

  String str = "457863219";
  
   boolean result= str.matches("[0-9]+");

   System.out.println("Original String   " + str);

   System.out.println("Does string contain only Digits?: "+ result);
   
   }
} 
  
