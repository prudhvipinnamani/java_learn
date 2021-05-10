// Create a class with all operaters

public class Alloperators {
	public static void main(String[] args) {
	    int a=10;
	    int b=20;
	    int c=25;
		int d=a+b-c;
		int e=a*b%c;
		boolean f= (d==e);
		d=d++;
		e=e++;
		
		if(d>e || d<e || d!=e ) {
		
			System.out.println("d is not equal to e");
		}
		if(!(d==e) != f) {
			System.out.println("d is not equal to e");
		}
	}
}	
