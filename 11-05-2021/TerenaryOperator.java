//checking size using terenary operator

public class TerenaryLottery {

   public static void main(String args[]) {

      int measurement = 30;
	  
	  String size= measurement==34?"extra large":(measurement==32?"large":((measurement==30)?"medium":((measurement==28)?"small":"unknown size")));
	  
   }
}   
