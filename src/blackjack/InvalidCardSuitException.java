/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Regis
 */
public class InvalidCardSuitException extends Exception {

	private char suitIdentifier = '?';

	public InvalidCardSuitException (char invalidSuit) {

		suitIdentifier = invalidSuit;

		System.out.println("Invalid suit" + " " + invalidSuit);
	}

	private InvalidCardSuitException() {
		System.out.println("Invalid suit");
	}
	
	public String toString(){

		return ("Attempted to create card with invalid suit argument" + " " + this.suitIdentifier);

	}
	
	public char getSuitDesignator() {
		
		return suitIdentifier;
	}
} //End class