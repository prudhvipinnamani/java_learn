//Checking size using else-if-ladder

public class ElseIfLottery {

   public static void main(String args[]) {

      int measurement = 30;

      if( measurement == 28 ) {
         System.out.print("small");
      }
	  
	  else if( measurement == 30 ) {
         System.out.print("medium");
      }
	  
	  else if( measurement == 32 ) {
         System.out.print("large");
	  }
	  
	  else if( measurement == 34 ) {
         System.out.print("Extra large");
      }
	  
	  else {
         System.out.print("measurement is in valid");
      }
   }
}
