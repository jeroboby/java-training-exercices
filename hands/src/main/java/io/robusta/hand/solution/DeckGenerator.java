package io.robusta.hand.solution;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeckGenerator;

public class DeckGenerator implements IDeckGenerator {

	@Override
	public Deck generate() {
		Deck deck = new Deck();

		
		for (int i = 1; i <= 52; i++) {
			int value = i/4;
			CardColor c = CardColor.getByValue(i%4 +1);
			Card card = new Card(value,c);
			deck.add(card);
			

		}
		return deck;
	}

}
