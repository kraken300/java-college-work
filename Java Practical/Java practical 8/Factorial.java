import java.awt.*;  
import java.awt.event.*;  

class Factorial implements ActionListener 
{
    Button b1,b2;
    TextField t1;
    Label lb1, lb2, lb3;
    Frame f;

    Factorial() 
    {
        f = new Frame("Awt factorial calculator");

        lb1 = new Label("Enter a Number :");
        lb1.setBounds(5, 50, 150, 30);
        f.add(lb1);  //add to frame

        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);

        lb2 = new Label("Result :");
        lb2.setBounds(90, 140, 150, 30);
        f.add(lb2);
		
		lb3 = new Label(null);
        lb3.setBounds(120, 140, 150, 30);
        f.add(lb3);

        b1 = new Button("Find ");
        b1.setBounds(90, 200, 100, 30);
        f.add(b1);
		
		b2=new Button("Clear");
		b2.setBounds(220, 200, 100, 30);
        f.add(b2);

        b1.addActionListener(this);
		b2.addActionListener(this);
        f.addWindowListener(new WindowAdapter() 
	{
            public void windowClosing(WindowEvent we) 
	    {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e)
    {
        int n = Integer.parseInt(t1.getText());  //4
        int fact = 1;
        if (e.getSource().equals(b1)) 
	{
            for (int i = 1; i <= n; i++) 
	    {
                fact = fact * i;
            }

            lb2.setText(String.valueOf("Result  :    " + fact));
			//lb2.setText(String.valueOf(fact));
        }
	else
	{
		t1.setText(null); //textfield null
		lb2.setText("Result  :    ");
		t1.requestFocus();  //textfield focus
	}
    }

    public static void main(String args[]) 
    {
        Factorial f = new Factorial();
    }
}