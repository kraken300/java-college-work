import java.awt.*;
import java.awt.event.*;

class ChoiceDemo extends Frame{
	
	Choice ch;
	
	ChoiceDemo(){
		ch = new Choice();
		ch.setBounds(30,50,80,20);
		ch.add("Book");
		ch.add("Pencil");
		ch.add("Eraser");
		ch.add("Sharpner");
		ch.add("Pen");
		add(ch);
		
		setSize(720,480);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		ChoiceDemo CHE = new ChoiceDemo();
	}
}