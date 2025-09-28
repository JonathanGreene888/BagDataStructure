package bagdatastructure;

public class BagDataStructure {

	public static void main(String[] args) {
		
		 Bag<String> inventory = new Bag<>();
		 inventory.add("Sword");
		 inventory.add("Potion");
		 inventory.add("Map");
		 inventory.add("Crossbow");
		 inventory.add("Potion");
		 
		 Bag<String> other_inventory = new Bag<>();
		 other_inventory.add("Potion");
		 other_inventory.add("Potion");
		 other_inventory.add("Potion");
		 other_inventory.add("Potion");
		 other_inventory.add("Shield");
		 other_inventory.add("Staff of Pointing");
		 
		 Bag<String> combined_inventory = new Bag<>();


		 
		 
		 
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
	     System.out.println("Has Map: " + inventory.contains("Map"));
	     
	     for (String item : inventory) {
	            System.out.println(item);
	     }
	     
	     System.out.println("Number of Potions left: " + inventory.count("Potion"));
	     System.out.println("Number of Potions left: " + inventory.count("Helmet"));
	     
	     
		System.out.println("Size of your inventory is:" + inventory.size());
		System.out.println("Size of other inventory is:" + other_inventory.size());
		
		inventory.merge(other_inventory);
		
		System.out.println("Combined inventory contains: ");
		 for (String item : inventory) {
	            System.out.println(item);
	     }
		 
		 System.out.println("Removing all duplicates you get: ");
		 inventory.distinct();
		 for (String item : inventory) {
	            System.out.println(item);
	     }
		 
	
		
	}

}
