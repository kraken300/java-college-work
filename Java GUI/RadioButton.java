import java.awt.*;
import java.awt.event.*;

class RadioButton extends Frame{
	Checkbox rd1,rd2,rd3;
	CheckboxGroup cbg = new CheckboxGroup();
	
	RadioButton(){
		//cbg = new CheckboxGroup();
		rd1 = new Checkbox("Vada",cbg,true);
		rd1.setBounds(10,30,50,20);
		add(rd1);
		
		rd2 = new Checkbox("Bhajia",cbg,false);
		rd2.setBounds(10,60,50,20);
		add(rd2);
		
		rd2 = new Checkbox("Samosa",cbg,false);
		rd2.setBounds(10,90,50,20);
		add(rd2);
		
		setSize(720,480);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		RadioButton RB = new RadioButton();
	}
}