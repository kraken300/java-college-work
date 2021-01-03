import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class Calc{
	
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	JTextField label;
	String result = "";
	double x1,x2;
	
	Boolean addBool = false;
	Boolean subBool = false;
	Boolean divBool = false;
	Boolean mulBool = false;
	
	Calc(){
		frame = new JFrame("CALCULATOR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		label = new JTextField();
		label.setBounds(0,0,300,100);
		frame.add(label);
		
		b1 = new JButton("1");
		b1.setBounds(0,100,70,100);
		frame.add(b1);
		b1.addActionListener(new For1());
		
		b2 = new JButton("2");
		b2.setBounds(70,100,70,100);
		frame.add(b2);
		b2.addActionListener(new For2());
		
		b3 = new JButton("3");
		b3.setBounds(140,100,70,100);
		frame.add(b3);
		b3.addActionListener(new For3());
		
		b4 = new JButton("+");
		b4.setBounds(210,100,70,100);
		frame.add(b4);
		b4.addActionListener(new ForAdd());
		
		b5 = new JButton("4");
		b5.setBounds(0,200,70,100);
		frame.add(b5);
		b5.addActionListener(new For4());
		
		b6 = new JButton("5");
		b6.setBounds(70,200,70,100);
		frame.add(b6);
		b6.addActionListener(new For5());
		
		b7 = new JButton("6");
		b7.setBounds(140,200,70,100);
		frame.add(b7);
		b7.addActionListener(new For6());
		
		b8 = new JButton("-");
		b8.setBounds(210,200,70,100);
		frame.add(b8);
		b8.addActionListener(new ForSub());
		
		b9 = new JButton("7");
		b9.setBounds(0,300,70,100);
		frame.add(b9);
		b9.addActionListener(new For7());
		
		b10 = new JButton("8");
		b10.setBounds(70,300,70,100);
		frame.add(b10);
		b10.addActionListener(new For8());
		
		b11 = new JButton("9");
		b11.setBounds(140,300,70,100);
		frame.add(b11);
		b11.addActionListener(new For9());
		
		b12 = new JButton("*");
		b12.setBounds(210,300,70,100);
		frame.add(b12);
		b12.addActionListener(new ForMul());
		
		b13 = new JButton("Clear");
		b13.setBounds(0,400,70,100);
		frame.add(b13);
		b13.addActionListener(new ForClear());
		
		
		b14 = new JButton("0");
		b14.setBounds(70,400,70,100);
		frame.add(b14);
		b14.addActionListener(new For0());
		
		b15 = new JButton("=");
		b15.setBounds(140,400,70,100);
		frame.add(b15);
		b15.addActionListener(new ForEqual());
		
		b16 = new JButton("/");
		b16.setBounds(210,400,70,100);
		frame.add(b16);
		b16.addActionListener(new ForDiv());
		
		frame.setSize(290,540);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	class ForClear implements ActionListener{
		public void actionPerformed(ActionEvent e){
			label.setText("");
			addBool = false;
			subBool = false;
			divBool = false;
			mulBool = false;
			
			x1 = 0;
			x2 = 0;
		}
	}
	
	class For1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "1");
		}
	}
	
	class For2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "2");
		}
	}
	
	class For3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "3");
		}
	}
	
	class For4 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "4");
		}
	}
	
	class For5 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "5");
		}
	}
	
	class For6 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "6");
		}
	}
	
	class For7 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "7");
		}
	}
	
	class For8 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "8");
		}
	}
	
	class For9 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "9");
		}
	}
	
	class For0 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			result = label.getText();
			label.setText(result + "0");
		}
	}
	
	class ForAdd implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x1 = Double.parseDouble(label.getText());
			label.setText("");
			addBool = true;
		}
	}
	
	class ForSub implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x1 = Double.parseDouble(label.getText());
			label.setText("");
			subBool = true;
		}
	}
	
	class ForMul implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x1 = Double.parseDouble(label.getText());
			label.setText("");
			mulBool = true;
		}
	}
	
	class ForDiv implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x1 = Double.parseDouble(label.getText());
			label.setText("");
			divBool = true;
		}
	}
	
	class ForEqual implements ActionListener{
		public void actionPerformed(ActionEvent e){
			x2 = Double.parseDouble(label.getText());
			if(addBool == true){
				x2 = x2 + x1;
			}
			
			else if(subBool == true){
				x2 = x2 - x1;
			}
			
			else if(mulBool == true){
				x2 = x2 * x1;
			}
			
			else if(divBool == true){
				x2 = x1 / x2;
			}
			
			label.setText(Double.toString(x2));
			
			addBool = false;
			subBool = false;
			divBool = false;
			mulBool = false;
			
		}
	}
	
	
	
	public static void main(String[] args){
		Calc obj = new Calc();
	}
}