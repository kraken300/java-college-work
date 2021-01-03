import java.awt.*;
import java.awt.event.*;

class CheckBoxes extends Frame{
	
	Checkbox chk1,chk2,chk3;
	
	CheckBoxes(){
		chk1 = new Checkbox("Select Class",true);
		chk1.setBounds(10,30,100,20);
		add(chk1);
		
		chk2 = new Checkbox("Select Class");
		chk2.setBounds(10,60,100,20);
		add(chk2);
		
		chk3 = new Checkbox("Select Class");
		chk3.setBounds(10,90,100,20);
		add(chk3);
		
		setSize(720,480);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		CheckBoxes CB = new CheckBoxes();
	}
}