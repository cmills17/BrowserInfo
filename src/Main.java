import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Main {
   
	//set up JFrame interface
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Main(){
      prepareGUI();
   }

   public static void main(String[] args){
      Main  swingControlDemo = new Main();      
      swingControlDemo.showCombobox();
   }

   //Show the JFrame, set up layout, make it so the computer interprets the user's actions in window
   private void prepareGUI(){
      mainFrame = new JFrame("Computer Electricity Consumption");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showCombobox(){                                    
      headerLabel.setText("Control in action: JComboBox"); 

      final DefaultComboBoxModel computersName = new DefaultComboBoxModel();

      computersName.addElement("Laptop");
      computersName.addElement("Desktop");

      final JComboBox computerCombo = new JComboBox(computersName);    
      computerCombo.setSelectedIndex(0);

      final DefaultComboBoxModel ramName = new DefaultComboBoxModel();

      ramName.addElement("1");
      ramName.addElement("2");

      final JComboBox ramCombo = new JComboBox(ramName);    
      ramCombo.setSelectedIndex(0);
      
      JScrollPane computerListScrollPane = new JScrollPane(computerCombo);    

      JButton showButton = new JButton("Show");
 
      showButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) { 
            String data = "";
            if (computerCombo.getSelectedIndex() != -1) {                     
               data = "Computer Type Selected: " 
                  + computerCombo.getItemAt
                    (computerCombo.getSelectedIndex());             
            }              
            statusLabel.setText(data);
         }
      }); 
      controlPanel.add(computerListScrollPane);          
      controlPanel.add(showButton);    
      mainFrame.setVisible(true);             
   }
}
