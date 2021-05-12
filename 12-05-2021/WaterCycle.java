class ProcessCycle {

	public void evaporation() {
		
		System.out.println("First step is evaporation:");
		System.out.println("Water in water bodies converts into vapour using heat from sun");
	}
	
	public void condensation() {
		
		System.out.println("Second step is condensation:");
		System.out.println("Rised water vapour starts condsing and forms as clouds");
	}
	
	public void percepitation() {
		
		System.out.println("Third step is condensation:");
		System.out.println("percepatation is a process in which clouds get cooled and start snowing or raining");
	}
	
		
}
public class WaterCycle extends ProcessCycle {
	
    static String sun="True";
	public static void main(String[] args) {
		
		
		System.out.println("Type 'Yes' if sun is present, otherwise type 'No");
	
		ProcessCycle nature= new ProcessCycle();
		
		while (sun=="True") {
			
			nature.evaporation();
			nature.condensation();
			nature.percepitation();
			
		}
		
	}

}
