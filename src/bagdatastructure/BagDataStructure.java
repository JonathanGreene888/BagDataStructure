package bagdatastructure;

public class BagDataStructure {

	public static void main(String[] args) {
		
		 Bag<String> inventory = new Bag<>();
		 inventory.add("Sword");
		 inventory.add("Potion");
		 inventory.add("Map");
		 inventory.add("Crossbow");
		 inventory.add("Potion");
		 
		 
		 for (String item : inventory) {
	            System.out.println(item);
	     }
		 
		 
		 System.out.println("Has Sword: " + inventory.contains("Sword"));
	     System.out.println("Has Helmet: " + inventory.contains("Helmet"));
	     
	     System.out.println("Number of Potions left: " + inventory.count("Potion"));
	     System.out.println("Number of Potions left: " + inventory.count("Helmet"));
		
	     inventory.remove("Potion");
	     inventory.remove("Potion");

	     System.out.println("Has Potion: " + inventory.contains("Potion"));
	     System.out.println("Has Helmet: " + inventory.contains("Map"));
	     
	     for (String item : inventory) {
	            System.out.println(item);
	     }
	     
	     System.out.println("Number of Potions left: " + inventory.count("Potion"));
	     System.out.println("Number of Potions left: " + inventory.count("Helmet"));
		
	}

}
