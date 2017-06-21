package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck{

	
	private static final long serialVersionUID = -4686285366508321800L;
	
	public Deck() {

	}
	
	@Override
	public Card pick() {
		Collections.shuffle(this);
		Random randomcard = new Random();
		
		return this.removeFirst();
	}


	

	@Override
	public TreeSet<Card> pick(int number) {
		TreeSet<Card> treeSet = new TreeSet<>(); 
		for(int i = 1; i <= number; i++){
			
			treeSet.add(pick());
			
		}
		return treeSet;
	}

	@Override
	public Hand giveHand() {
		Hand hand = new Hand();
		hand.addAll(pick(5));
		return hand;
	}
	
	
	
}
