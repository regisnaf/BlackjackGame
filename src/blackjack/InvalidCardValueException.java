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
public class InvalidCardValueException extends Exception
{
	private int valueIdentifier = 0;

	public InvalidCardValueException(int invalidValue) {

		valueIdentifier = invalidValue;

		System.out.println("Invalid value " + invalidValue);
	}

	private InvalidCardValueException() {


		System.out.println("Invalid value");
	}

	public String toString() {
		

		return ("Attempted to create card with invalid suit argument" + " " + this.valueIdentifier);
	}

	public int getValue() {
		
		return valueIdentifier;
	}

} //End class
