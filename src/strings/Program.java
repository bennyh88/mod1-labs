package strings;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//part2();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Bruce Springsteen ");
		sb.append("is the artist ever");
		
		System.out.println(sb.toString());
		
		System.out.println(sb.indexOf("artist"));
		sb.insert(sb.indexOf("artist"), "bossest ");
		
		System.out.println(sb.toString());
		
		sb.replace(sb.indexOf("artist"), sb.indexOf("artist") + 6, "rockstar");
		System.out.println(sb.toString());
		
	}
	
	public static void part2() {
		
		String name = "Benny";
		
		// Display the 3rd Character
		System.out.println(name.charAt(2));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		
		for (char letter : name.toCharArray()) {
			System.out.printf("%s\t", letter);
		}
		System.out.printf("\n");
		
		
		System.out.println(name.startsWith("Ben"));
		System.out.println(name.startsWith("ny"));
		
		
		System.out.println(name.endsWith("Ben"));
		System.out.println(name.endsWith("ny"));
		
		System.out.println(name.indexOf("n"));
		System.out.println(name.indexOf("Z"));
		
		String fullname = name + " H88";
		System.out.println(fullname);
		
		fullname = String.format("%s H88\n", name);
		System.out.printf(fullname);
	}

}
