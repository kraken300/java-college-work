import java.awt.*;
import java.awt.event.*;

class ListDemo extends Frame{
	List li;
	
	ListDemo(){
		li = new List();
		li.setBounds(30,50,80,100);
		li.add("Book");
		li.add("Pencil");
		li.add("Eraser");
		li.add("Sharpner");
		li.add("Pen");
		add(li);
		
		setSize(720,480);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		ListDemo CHE = new ListDemo();
	}
}