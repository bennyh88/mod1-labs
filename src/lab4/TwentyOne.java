package lab4;

import lab4.Utils;

public class TwentyOne {

	public static void main(String[] args) {
		Utils utils = new Utils();
		// TODO Auto-generated method stub
		String[] cards = {"Ace Spades","2 Spades","3 Spades","4 Spades","5 Spades","6 Spades","7 Spades","8 Spades","9 Spades","10 Spades","Jack Spades","Queen Spades","King Spades","Ace Hearts","2 Hearts","3 Hearts","4 Hearts","5 Hearts","6 Hearts","7 Hearts","8 Hearts","9 Hearts","10 Hearts","Jack Hearts","Queen Hearts","King Hearts","Ace Clubs","2 Clubs","3 Clubs","4 Clubs","5 Clubs","6 Clubs","7 Clubs","8 Clubs","9 Clubs","10 Clubs","Jack Clubs","Queen Clubs","KingClubs","Ace Diamonds","2 Diamonds","3 Diamonds","4 Diamonds","5 Diamonds","6 Diamonds","7 Diamonds","8 Diamonds","9 Diamonds","10 Diamonds","Jack Diamonds","Queen Diamonds","King Diamonds"};
		
		// shuffle to prepare the game
		suffle_deck(cards, 100);
		//print_deck(cards);
		
		// used to keep track of cards dealt
		int cards_remaining = cards.length;
		
		// Players Go
		System.out.printf("Players Go!\n");
		boolean stick = false;
		int player_score = 0;
		while (stick != true) {
			char val = utils.getChar("Stick? (Y or N)");
			
			if (val == 'N') {
				// Deal user a card
				player_score += get_card_value(cards[cards_remaining-1]);
				System.out.printf("%s, \t\t%d\n", cards[cards_remaining-1], player_score);
				cards_remaining--;
				
				if (player_score > 21) {
					System.out.printf("Bust!\n");
					player_score = 0;
					stick = true;
				}
				
			} else if (val =='Y') {
				// Break out of the loop
				stick = true;
				System.out.printf("Stick!\n");
			} else {
				System.out.println("Option NOT recognised");
			}
		}
		
		// Computers Go
		System.out.printf("Computers Go!\n");
		
		int computer_score = 0;
		stick = false;
		while (stick != true) {
			//Deal Computer a card
			computer_score += get_card_value(cards[cards_remaining-1]);
			System.out.printf("%s, \t\t%d\n", cards[cards_remaining-1], computer_score);
			cards_remaining--;
			
			if (computer_score > 21) {
				System.out.printf("Bust!\n");
				computer_score = 0;
				stick = true;
				
			} else if (computer_score >= player_score) {
				stick = true;
			}
		}
		
		
		// Evaluate results
		if (player_score > computer_score) {
			System.out.printf("Player Wins! :-(\n");
		} else if (player_score < computer_score) {
			System.out.printf("Computer Wins! :-P\n");
		} else {
			System.out.printf("It's a draw <3\n");
		}
		
	}
	
	
	
	public static int get_card_value(String card) {
		char val = card.charAt(0);
		switch(val) {
		  case 'A', 'K', 'Q', 'J':
			  return 10;
		  default:
		    return Character.getNumericValue(val);
		}
	}
	
	public static void print_deck(String[] cards) {
		for (String card : cards) {
			System.out.println(card + " \t-> " + get_card_value(card));
		}
	}
	
	public static int random_card() {
		return (int)(Math.random() * 52);
	}
	
	public static String[] suffle_deck(String[] cards, int shuffles) {
		int shuffle_count = 0;
		
		while (shuffle_count < shuffles) {
			int card_a = random_card();
			int card_b = random_card();
			String a = cards[card_a];
			cards[card_a] = cards[card_b];
			cards[card_b] = a;
			shuffle_count++;
		}
		
		return cards;
	}
	

}
