/**
 * Card
 * @author Yizhi Hu, Ti Chen
 * @version 1.1
 * File name: Card.java
 * Status = Completed
 */
package model.gameSystem;

public class Card {
	
	private int value;	
	private int suit;
	
	/**
	 * @param value 2-14 represent 2-10,J,Q,K,A 
	 * @param suit 1-4 represent Club, Diamonds, Hearts and Space
	 */
	public Card(int value, int suit) {
		setValue(value);
		setSuit(suit);
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	/**
	 * @return formated card
	 */
	public String toString() {
		return "Card value: " + getValue()
			   + ", suit: " + getSuit() 
			   + "\n";
	}

	public String getCardStr(){
		StringBuilder sb = new StringBuilder();
		Character suit;
		if(this.suit == 1){
			suit = 'C';
		}
		else if(this.suit == 2){
			suit = 'D';
		}
		else if(this.suit == 3){
			suit = 'H';
		}
		else{
			suit = 'S';
		}

		String value;
		if(this.value == 14){
			value = "A";
		}
		else if(this.value == 13){
			value = "K";
		}
		else if(this.value == 12){
			value = "Q";
		}
		else if(this.value == 11){
			value = "J";
		}
		else if(this.value == 10){
			value = "10";
		}
		else{
			value = Integer.toString(this.value);
		}
		System.out.println(this.value + " to " + value);

		sb.append(value);
		sb.append(suit);

		return sb.toString();

	}

}
