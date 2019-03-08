import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalFrame extends JFrame  implements ActionListener
{
Container c;

String s0,s1,s2;

JTextField t=new JTextField();

JButton btn20=new JButton("C");;
JButton btn11=new JButton("7");
JButton btn12=new JButton("8");
JButton btn13=new JButton("9");
JButton btn14=new JButton("/");
JButton btn15=new JButton("%");
JButton btn16=new JButton("4");
JButton btn17=new JButton("5");
JButton btn18=new JButton("6");
JButton btn19=new JButton("*");
JButton btn21=new JButton("1");
JButton btn22=new JButton("2");
JButton btn23=new JButton("3");
JButton btn24=new JButton("-");
JButton btn25=new JButton("=");
JButton btn26=new JButton("0");
JButton btn27=new JButton(".");
JButton btn28=new JButton("+");





CalFrame()
{

s0=s1=s2="";

c=this.getContentPane();
c.setLayout(null);

t.setBounds(1,1,308,50);


btn11.setBounds(7,52,55,25);
btn12.setBounds(65,52,55,25);
btn13.setBounds(125,52,55,25);
btn14.setBounds(185,52,55,25);
btn15.setBounds(245,52,55,25);
btn16.setBounds(7,82,55,25);
btn17.setBounds(65,82,55,25);
btn18.setBounds(125,82,55,25);
btn19.setBounds(185,82,55,25);
btn20.setBounds(245,82,55,25);
btn21.setBounds(7,112,55,25);
btn22.setBounds(65,112,55,25);
btn23.setBounds(125,112,55,25);
btn24.setBounds(185,112,55,25);
btn25.setBounds(245,112,55,54);
btn26.setBounds(7,142,112,25);
btn27.setBounds(125,142,55,25);
btn28.setBounds(185,142,55,25);





c.add(t);



c.add(btn20);

c.add(btn11);
c.add(btn12);
c.add(btn13);
c.add(btn14);
c.add(btn15);
c.add(btn16);
c.add(btn17);
c.add(btn18);
c.add(btn19);
c.add(btn21);
c.add(btn22);
c.add(btn23);
c.add(btn24);
c.add(btn25);
c.add(btn26);
c.add(btn27);
c.add(btn28);



btn20.addActionListener(this);
btn11.addActionListener(this);
btn12.addActionListener(this);
btn13.addActionListener(this);
btn14.addActionListener(this);
btn15.addActionListener(this);
btn16.addActionListener(this);
btn17.addActionListener(this);
btn18.addActionListener(this);
btn19.addActionListener(this);
btn21.addActionListener(this);
btn22.addActionListener(this);
btn23.addActionListener(this);
btn24.addActionListener(this);
btn25.addActionListener(this);
btn27.addActionListener(this);
btn28.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
  String s = e.getActionCommand();
  if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
  {
     if (!s1.equals("")) 
				s2 = s2 + s; 
else
				s0 = s0 + s;
t.setText(s0+s1+s2);
}

else if (s.charAt(0) == 'C') { 
			 
			s0 = s1 = s2 = ""; 
 
			t.setText(s0 + s1 + s2); 
		} 

		else if (s.charAt(0) == '=') { 

			double te; 
 
			if (s1.equals("+")) 
				te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
			else if (s1.equals("-")) 
				te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
			else if (s1.equals("/")) 
				te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

			 
			t.setText(s0 + s1 + s2 + "=" + te); 

			
			s0 = Double.toString(te); 

			s1 = s2 = ""; 
		} 


		else {  
			if (s1.equals("") || s2.equals("")) 
				s1 = s; 
			
			else { 
				double te; 

				
				if (s1.equals("+")) 
					te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
				else if (s1.equals("-")) 
					te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
				else if (s1.equals("/")) 
					te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

				 
				s0 = Double.toString(te); 

				 
				s1 = s; 

				
				s2 = ""; 
			} 

			 
			t.setText(s0 + s1 + s2); 
		} 




}






















}








class github
{
public static void main(String[] args)
{
CalFrame f=new CalFrame();
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setBounds(100,50,310,200);
f.setTitle("CALCULATOR");
f.setResizable(false);
}
}