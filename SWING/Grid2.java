import java.awt.*;
import javax.swing.*;
class Grid2{
	
	JFrame frame;
	
	Grid2(){
		JPanel lab = new JPanel();
		lab.setLayout(new BorderLayout());
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4,4));
		
		frame = new JFrame("Grid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("LABEL");
		lab.add(label);   
		
		JButton b1 = new JButton("1");
		buttons.add(b1);
		
		JButton b2 = new JButton("2");
		buttons.add(b2);
		
		JButton b3 = new JButton("3");
		buttons.add(b3);
		
		JButton b4 = new JButton("+");
		buttons.add(b4);
		
		JButton b5 = new JButton("4");
		buttons.add(b5);
		
		JButton b6 = new JButton("5");
		buttons.add(b6);
		
		JButton b7 = new JButton("6");
		buttons.add(b7);
		
		JButton b8 = new JButton("-");
		buttons.add(b8);
		
		JButton b9 = new JButton("7");
		buttons.add(b9);
		
		JButton b10 = new JButton("8");
		buttons.add(b10);
		
		JButton b11 = new JButton("9");
		buttons.add(b11);
		
		JButton b12 = new JButton("*");
		buttons.add(b12);
		
		JButton b13 = new JButton("Clear");
		buttons.add(b13);
		
		JButton b14 = new JButton("0");
		buttons.add(b14);
		
		JButton b15 = new JButton("=");
		buttons.add(b15);
		
		JButton b16 = new JButton("/");
		buttons.add(b16);
		
		frame.getContentPane().add(lab,BorderLayout.NORTH);
		frame.getContentPane().add(buttons,BorderLayout.SOUTH);
		
		frame.setResizable(false);
		frame.setSize(300,300); 
		frame.setVisible(true);
	}
	public static void main(String[] args){
		Grid2 obj = new Grid2();
	}
}