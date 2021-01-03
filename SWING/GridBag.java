import java.awt.*;
import javax.swing.*;
class GridBag{
	
	JFrame frame;
	
	GridBag(){
		frame = new JFrame("Grid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JLabel label = new JLabel("LABEL");
		//frame.add(label,BorderLayout.NORTH);      
		
		JButton b1 = new JButton("1");
		b1.setBounds(100,100,50,30);
		frame.add(b1);
		
		JButton b2 = new JButton("2");
		frame.add(b2);
		
		JButton b3 = new JButton("3");
		frame.add(b3);
		
		JButton b4 = new JButton("+");
		frame.add(b4);
		
		JButton b5 = new JButton("4");
		frame.add(b5);
		
		JButton b6 = new JButton("5");
		frame.add(b6);
		
		JButton b7 = new JButton("6");
		frame.add(b7);
		
		JButton b8 = new JButton("-");
		frame.add(b8);
		
		JButton b9 = new JButton("7");
		frame.add(b9);
		
		JButton b10 = new JButton("8");
		frame.add(b10);
		
		JButton b11 = new JButton("9");
		frame.add(b11);
		
		JButton b12 = new JButton("*");
		frame.add(b12);
		
		JButton b13 = new JButton("Clear");
		frame.add(b13);
		
		JButton b14 = new JButton("0");
		frame.add(b14);
		
		JButton b15 = new JButton("=");
		frame.add(b15);
		
		JButton b16 = new JButton("/");
		frame.add(b16);
		
		frame.setSize(400,300); 
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		GridBag obj = new GridBag();
	}
}