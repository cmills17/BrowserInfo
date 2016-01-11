import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Computer Electricity Consumption");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ArrayList options = new ArrayList();
    ArrayList wattage = new ArrayList();
    frame.pack();
    frame.setVisible(true);
        
    String[] computerTypes = { "Laptop", "Desktop"};
    JList compType = new JList(computerTypes);
    compType.setSelectedIndex(1);
    frame.add(new JScrollPane(compType));
    
    String[] screenSizes = { "15''", "17''","19''", "20''","21''","22''","24''","30''","32''","37''","42''","50''"};
    JList screenType = new JList(screenSizes);
    screenType.setSelectedIndex(1);
    frame.add(new JScrollPane(screenType));
    
    String[] coreNumber = {"1 Core","2 Cores","3 Cores","4 Cores","5 Cores","6 Cores","7 Cores","8 Cores" };
    JList coreType = new JList(coreNumber);
    coreType.setSelectedIndex(1);
    frame.add(new JScrollPane(coreType));
   
    String[] brandOfCPU = {"Intel Low End","Intel Mid End","Intel High End","Intel Top End","AMD Low End","AMD Mid End","AMD High End" };
    JList cpuType = new JList(brandOfCPU);
    cpuType.setSelectedIndex(1);
    frame.add(new JScrollPane(cpuType));
    
    String[] ramTypes = {"DDR1 RAM","DDR2 RAM","DDR3 RAM" };
    JList ramType = new JList(ramTypes);
    ramType.setSelectedIndex(1);
    frame.add(new JScrollPane(ramType));
    
    String[] possibleHardDrives = {"Solid State Drive SSD","2.5'' Hard Disk Drive HHD","3.5'' Hard Disk Drive HHD" };
    JList hardDriveType = new JList(possibleHardDrives);
    hardDriveType.setSelectedIndex(1);
    frame.add(new JScrollPane(hardDriveType));
    
    String[] possibleLocations = {"CA","CT","D.C.","FL","IL","MA","NH","NJ","NC","TX","United States","Canada","Hong Kong","India","Mexico","Singapore","United Kingdom" };
    JList locations = new JList(possibleLocations);
    locations.setSelectedIndex(1);
    frame.add(new JScrollPane(locations));
    
    options.add(compType.getSelectedValue());
    options.add(screenType.getSelectedValue());
    options.add(coreType.getSelectedValue());
    options.add(cpuType.getSelectedValue());
    options.add(ramType.getSelectedValue());
    options.add(hardDriveType.getSelectedValue());
    options.add(locations.getSelectedValue());
    
	if (Arrays.asList(options).contains("Desktop")){
		wattage.add(120);}
	if (Arrays.asList(options).contains("Laptop")){
		wattage.add(35);}
	if (Arrays.asList(options).contains("15''")){
		wattage.add(18);}
	if (Arrays.asList(options).contains("17''")){
		wattage.add(20);}
	if (Arrays.asList(options).contains("19''")){
		wattage.add(22);}
	if (Arrays.asList(options).contains("20''")){
		wattage.add(26);}
	if (Arrays.asList(options).contains("21''")){
		wattage.add(30);}
	if (Arrays.asList(options).contains("22''")){
		wattage.add(40);}
	if (Arrays.asList(options).contains("24''")){
		wattage.add(50);}
	if (Arrays.asList(options).contains("30''")){
		wattage.add(60);}
	if (Arrays.asList(options).contains("32''")){
		wattage.add(70);}
	if (Arrays.asList(options).contains("37''")){
		wattage.add(80);}
	if (Arrays.asList(options).contains("42''")){
		wattage.add(120);}
	if (Arrays.asList(options).contains("50''")){
		wattage.add(150);}
	if (Arrays.asList(options).contains("1 Core")){
		wattage.add(69);}
	if (Arrays.asList(options).contains("2 Cores")){
		wattage.add(74.5);}
	if (Arrays.asList(options).contains("3 Cores")){
		wattage.add(80);}
	if (Arrays.asList(options).contains("4 Cores")){
		wattage.add(86);}
	if (Arrays.asList(options).contains("5 Cores")){
		wattage.add(86);}
	if (Arrays.asList(options).contains("6 Cores")){
		wattage.add(86.5);}
	if (Arrays.asList(options).contains("7 Cores")){
		wattage.add(86.5);}
	if (Arrays.asList(options).contains("8 Cores")){
		wattage.add(86.5);}
	if (Arrays.asList(options).contains("Intel Low End")){
		wattage.add(64);}
	if (Arrays.asList(options).contains("Intel Mid End")){
		wattage.add(84);}
	if (Arrays.asList(options).contains("Intel High End")){
		wattage.add(86);}
	if (Arrays.asList(options).contains("Intel Top End")){
		wattage.add(140);}
	if (Arrays.asList(options).contains("AMD Low End")){
		wattage.add(80);}
	if (Arrays.asList(options).contains("AMD Mid End")){
		wattage.add(95);}
	if (Arrays.asList(options).contains("AMD High End")){
		wattage.add(110);}
	if (Arrays.asList(options).contains("DDR1 RAM")){
		wattage.add(4.75);}
	if (Arrays.asList(options).contains("DDR2 RAM")){
		wattage.add(3.75);}
	if (Arrays.asList(options).contains("DDR3 RAM")){
		wattage.add(2.5);}
	if (Arrays.asList(options).contains("Solid State Drive SSD")){
		wattage.add(1.7);}
	if (Arrays.asList(options).contains("2.5'' Hard Disk Drive HHD")){
		wattage.add(1.85);}
	if (Arrays.asList(options).contains("3.5'' Hard Disk Drive HHD")){
		wattage.add(7.75);}
	
	
	}
  }