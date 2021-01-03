package PracticalPractice;

import java.awt.*;
import java.awt.event.*;

class MyCalculator implements ActionListener{
	int x,y,z;
	String s1,temp1,temp2,symbol;
	Frame frame;
	Label label;
	Button lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb0,sum,sub,div,mul,equal,clear;
	//Button btnEqual,btnClear;
	
	MyCalculator(){
		frame = new Frame();
		
		label = new Label();
		label.setBounds(50,20,200,40);
		frame.add(label);
		
		lb1 = new Button("1");
		lb1.setBounds(50,70,50,40);
		frame.add(lb1);
		
		lb2 = new Button("2");
		lb2.setBounds(100,70,50,40);
		frame.add(lb2);
		
		lb3 = new Button("3");
		lb3.setBounds(150,70,50,40);
		frame.add(lb3);
		
		sum = new Button("+");
		sum.setBounds(200,70,50,40);
		frame.add(sum);
		
		lb4 = new Button("4");
		lb4.setBounds(50,110,50,40);
		frame.add(lb4);
		
		lb5 = new Button("5");
		lb5.setBounds(100,110,50,40);
		frame.add(lb5);
		
		lb6 = new Button("6");
		lb6.setBounds(150,110,50,40);
		frame.add(lb6);
		
		sub = new Button("-");
		sub.setBounds(200,110,50,40);
		frame.add(sub);
		
		lb7 = new Button("7");
		lb7.setBounds(50,150,50,40);
		frame.add(lb7);
		
		lb8 = new Button("8");
		lb8.setBounds(100,150,50,40);
		frame.add(lb8);
		
		lb9 = new Button("9");
		lb9.setBounds(150,150,50,40);
		frame.add(lb9);
		
		mul = new Button("*");
		mul.setBounds(200,150,50,40);
		frame.add(mul);
		
		equal = new Button("=");
		equal.setBounds(50,190,50,40);
		frame.add(equal);
		
		lb0 = new Button("0");
		lb0.setBounds(100,190,50,40);
		frame.add(lb0);
		
		clear = new Button("C");
		clear.setBounds(150,190,50,40);
		frame.add(clear);
		
		div = new Button("/");
		div.setBounds(200,190,50,40);
		frame.add(div);
		
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent e){
		
		String s = e.getActionCommand();
		
		if(s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")){
			s1 = label.getText();
			label.setText(s1+s);
		}
		
		else if(s.equals("8")||s.equals("9")||s.equals("0")){
			s1 = label.getText();
			label.setText(s1+s);
		}
		
		if(s.equals("+")){
			temp1 = label.getText();
			label.setText("");
			symbol = s;
		}
		
		if(s.equals("-")){
			temp1 = label.getText();
			label.setText("");
			symbol = s;
		}
		
		if(s.equals("*")){
			temp1 = label.getText();
			label.setText("");
			symbol = s;
		}
		
		if(s.equals("/")){
			temp1 = label.getText();
			label.setText("");
			symbol = s;
		}
		
		if(s.equals("=")){
			if(symbol.equals("+")){
				temp2 = label.getText();
				x = Integer.parseInt(temp1);
				y = Integer.parseInt(temp2);
				z = x+y;
				label.setText(""+z);
			}
			
			else if(symbol.equals("-")){
				temp2 = label.getText();
				x = Integer.parseInt(temp1);
				y = Integer.parseInt(temp2);
				z = x-y;
				label.setText(""+z);
			}
			
			else if(symbol.equals("*")){
				temp2 = label.getText();
				x = Integer.parseInt(temp1);
				y = Integer.parseInt(temp2);
				z = x-y;
				label.setText(""+z);
			}
			
			else if(symbol.equals("/")){
				temp2 = label.getText();
				x = Integer.parseInt(temp1);
				y = Integer.parseInt(temp2);
				z = x/y;
				label.setText(""+z);
			}
			
		}
		
	}
	
	public static void main(String[] args){
		MyCalculator obj = new MyCalculator();
	}
}