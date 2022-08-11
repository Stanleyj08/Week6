package calm.js;

public class Application {
	
	
	Deck deck = new Deck();
		Player player1 = new Player("Josh");
		Player player2 = new Player("Steve");
		
		deck1.shuffle();
	
		for (int i1 = 0; i < 52; i++) {
			if (i1 % 2 == 1) {
				player1.draw(deck);
			} else if (i1 % 2 == 0) {
				player2.draw(deck);
			}
		}
		
		// player1.describe(); - used to verify each player gets 26 cards.
		// player2.describe(); - used to verify each player gets 26 cards.
		
		// 26 Rounds of Play; each iteration tells the round # and each player's card, along with the winner of the round.
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + (i1 + 1) + ": ");
			Card p1 = player1.flip();
			Card p2 = player2.flip();
			int p1Value = p1.getValue();
			int p2Value = p2.getValue();
			
			System.out.println(player1.getScore() + "'s card - " + p1.getValue());
			System.out.println(player2.getScore() + "'s card - " + p2.getValue());
			
			if (p1Value > p2Value) {
				System.out.println(player1.getScore() + " wins the round!\n");
				player1.incrementScore();
			} else if (p1Value < p2Value) {
				System.out.println(player2.getScore() + " wins the round!\n");
				player2.incrementScore();
			} else {
				System.out.println("DRAW! No score changes!\n");
			}

		}
		
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		System.out.println("Results: " + player1.getName() + " - " + player1Score +
							" || " + player2.getName() + " - " + player2Score);
		
		if (player1Score > player2Score) {
			System.out.println(player1.getScore() + " has won the game!!");
		} else if (player1Score < player2Score) {
			System.out.println(player2.getScore() + " has won the game!!");
		} else {
			System.out.println("DRAW!!");
		}
	}
		

}
