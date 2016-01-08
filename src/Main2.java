import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Component;

public class Main2 {
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Computer Electricity Consumption");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    String[] computerTypes = { "Laptop", "Desktop"};
    JList compType = new JList(computerTypes);
    compType.setSelectedIndex(1);
    System.out.println(compType.getSelectedValue());
    frame.add(new JScrollPane(compType));
    
    String[] screenSizes = { "15''", "17''","19''", "20''","21''","22''","24''","30''","32''","37''","42''","50''"};
    JList screenType = new JList(screenSizes);
    screenType.setSelectedIndex(1);
    System.out.println(screenType.getSelectedValue());
    frame.add(new JScrollPane(screenType));
    
    String[] coreNumber = {"1 Core","2 Cores","3 Cores","4 Cores","5 Cores","6 Cores","7 Cores","8 Cores" };
    JList coreType = new JList(coreNumber);
    coreType.setSelectedIndex(1);
    System.out.println(coreType.getSelectedValue());
    frame.add(new JScrollPane(coreType));
   
    String[] brandOfCPU = {"Intel Low End","Intel Mid End","Intel High End","Intel Top End","AMD Low End","AMD Mid End","AMD High End" };
    JList cpuType = new JList(brandOfCPU);
    cpuType.setSelectedIndex(1);
    System.out.println(cpuType.getSelectedValue());
    frame.add(new JScrollPane(cpuType));
    
    String[] ramTypes = {"DDR1 RAM","DDR2 RAM","DDR3 RAM" };
    JList ramType = new JList(ramTypes);
    ramType.setSelectedIndex(1);
    System.out.println(ramType.getSelectedValue());
    frame.add(new JScrollPane(ramType));
    
    String[] possibleHardDrives = {"Solid State Drive SSD","2.5'' Hard Disk Drive HHD","3.5'' Hard Disk Drive HHD" };
    JList hardDriveType = new JList(possibleHardDrives);
    hardDriveType.setSelectedIndex(1);
    System.out.println(hardDriveType.getSelectedValue());
    frame.add(new JScrollPane(hardDriveType));
    
    String[] possibleLocations = {"CA","CT","D.C.","FL","IL","MA","NH","NJ","NC","TX","United States","Canada","Hong Kong","India","Mexico","Singapore","United Kingdom" };
    JList locations = new JList(possibleLocations);
    locations.setSelectedIndex(1);
    System.out.println(locations.getSelectedValue());
    frame.add(new JScrollPane(locations));
    
    frame.pack();
    frame.setVisible(true);
  }  
}