import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String cost_input;
		cost_input = JOptionPane.showInputDialog("What is the cost of your computer?");	//This creates a pop-up input field.
		double cost = Double.parseDouble(cost_input);	//Converts the value into a double.
		
		
		System.out.print("Computer Cost: $");
		System.out.println(cost);

	}

}
