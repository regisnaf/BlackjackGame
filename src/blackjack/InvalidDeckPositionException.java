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
public class InvalidDeckPositionException extends Exception {

	private int positionIdentifier = 0;

	public InvalidDeckPositionException(int inValidPosition) {

		positionIdentifier = inValidPosition;

		System.out.println("Invalid Position" + inValidPosition);

	}

	private InvalidDeckPositionException() {
		System.out.println("Invalid Position");
	}

	public String toString() {

		return ("Attempted to get a card from a position not in Deck" + " " + this.positionIdentifier);
	}

	public int getPositionValue() {
		return positionIdentifier;
	}
} //End class
