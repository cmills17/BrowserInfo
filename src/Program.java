import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program {
	
	JTextField computercost = new JTextField();
	JLabel computercost_q = new JLabel ("What is the cost of the computer?");

	String[] laptoptype_choices = {"Laptop","Desktop"};
	JComboBox laptoptype = new JComboBox(laptoptype_choices);
	JLabel laptoptype_q = new JLabel ("Laptop type");

	String[] screensize_choices = {"11","13","14","15","16","17"};
	JComboBox screensize = new JComboBox(screensize_choices);
	JLabel screensize_q = new JLabel ("Screen size");

	String[] corenumber_choices = {"1","2","3","4","5","6"};
	JComboBox corenumber = new JComboBox(corenumber_choices);
	JLabel corenumber_q = new JLabel ("Number of cores");

	String[] brandOfCPU_choices = {"Intel Low End","Intel Mid End","Intel High End","Intel Top End","AMD Low End","AMD Mid End","AMD High End"};
	JComboBox brandOfCPU = new JComboBox(brandOfCPU_choices);
	JLabel brandOfCPU_q = new JLabel ("Brand of CPU");

    String[] ramTypes_choices = {"DDR1 RAM","DDR2 RAM","DDR3 RAM" };
	JComboBox ramTypes = new JComboBox(ramTypes_choices);
	JLabel ramTypes_q = new JLabel ("RAM type");



	JButton b = new JButton("Calculate");
	JLabel l = new JLabel ("Display Combo items");
	
	

	
	public Program() {
		
		frame();
	}
	
public void frame() {
	
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setSize(600,600);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel p = new JPanel(new GridLayout(0,2));
	p.add(computercost_q);
	p.add(computercost);
	p.add(laptoptype_q);
	p.add(laptoptype);
	p.add(screensize_q);
	p.add(screensize);
	p.add(corenumber_q);
	p.add(corenumber);
	p.add(brandOfCPU_q);
	p.add(brandOfCPU);
	p.add(ramTypes_q);
	p.add(ramTypes);





	p.add(b);
	p.add(l);


	
	f.add(p);


	
}
	

public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	new Program();
	}

}
