package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String response=JOptionPane.showInputDialog(null,"Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("sure"))
		{
			JOptionPane.showMessageDialog(null,"Than you will rule the world!");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null,"Good luck on your career!");
		}
	}
	
	/*
	 * if(something is true)
	 * {
	 * then do something;
	 * }
	 * else
	 * {
	 * do something else;
	 * }
	 */
	
	
}

