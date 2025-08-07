package lab5;

import java.util.HashMap;

public class Zoo {
	public static HashMap<String, Integer> animalMap = new HashMap<>();
	String[ ] originalAnimals = {"Zebra", "Lion", "Buffalo"};
	String[ ] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	
	
	Zoo() {
		addAnimals(originalAnimals);
		addAnimals(newAnimals);
		
		displayAnimalData();
	}
	
	public void displayAnimalData() {
		for (String animal : animalMap.keySet()) {
			System.out.println(animal + "\t\t" + animalMap.get(animal));
		}
	}
	
	public void addAnimals(String[ ] animals) {
		for (String animal : animals) {
			//animalMap.add(animal);
			if (animalMap != null && animalMap.containsKey(animal)) {
				animalMap.put(animal, animalMap.get(animal)+1);
			} else {
				animalMap.put(animal, 1);
			}
		}
	}
	

}
