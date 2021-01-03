import java.awt.*;
import javax.swing.*;
class Grid{
	
	JFrame frame;
	
	Grid(){
		frame = new JFrame("Grid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("LABEL");
		frame.add(label,BorderLayout.NORTH);      //b1.setBounds(100,100,50,20);
		
		JButton b1 = new JButton("1");
		frame.add(b1,BorderLayout.SOUTH);
		
		frame.setSize(400,300);                //frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		Grid obj = new Grid();
	}
}