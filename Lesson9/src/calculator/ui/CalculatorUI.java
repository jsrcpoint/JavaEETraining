package calculator.ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.*;

public class CalculatorUI 
{
	
	public CalculatorUI()
	{
		
		 JButton button;
	        JPanel contentPane = new JPanel();
	        GridBagLayout gridbag = new GridBagLayout();
	        GridBagConstraints c = new GridBagConstraints();
	        contentPane.setLayout(gridbag);

	            c.fill = GridBagConstraints.HORIZONTAL; 

	   
	        button = new JButton("1");

	            c.weightx = 0.5;

	        c.gridx = 0;
	        c.gridy = 0;
	        gridbag.setConstraints(button, c);
	        contentPane.add(button);

	        button = new JButton("2");
	        c.gridx = 1;
	        c.gridy = 0;
	        gridbag.setConstraints(button, c);
	        contentPane.add(button);

	        button = new JButton("3");
	        c.gridx = 2;
	        c.gridy = 0;
	        gridbag.setConstraints(button, c);
	        contentPane.add(button);

	        button = new JButton("4");
	        //c.ipady = 40;      //make this component tall
	     //   c.weightx = 0.0;
	  //      c.gridwidth = 3;
	        c.gridx = 0;
	        c.gridy = 1;
	        gridbag.setConstraints(button, c);
	        contentPane.add(button);

	        button = new JButton("5");
	//        c.ipady = 0;       //reset to default
	//        c.weighty = 1.0;   //request any extra vertical space
	//        c.anchor = GridBagConstraints.SOUTH; //bottom of space
	     //   c.insets = new Insets(10,0,0,0);  //top padding
	        c.gridx = 1;       //aligned with button 2
	        c.gridwidth = 2;
	        //2 columns wide
	        c.gridy = 1;       //third row
	        gridbag.setConstraints(button, c);
	        contentPane.add(button);

		
		//cPanel.setLayout(gbl);
		/*
		constr = new GridBagConstraints();
		constr.fill = GridBagConstraints.BOTH;
		
		jtf = new JTextField(10);
		//constr.ipady = 0;		
		constr.weightx = 5.5;
		constr.weighty = 1.0;
		constr.gridwidth = 1;
		constr.anchor = GridBagConstraints.WEST;
		constr.gridx = 0;
		constr.gridy = 0;
		//constr.gridheight = 1;
		

		
		
		//mf = new MaskFormatter();
		//jftf = new JFormattedTextField(mf);
		gbl.setConstraints(jtf, constr);
		cPanel.add(jtf);
		
		
		button = new JButton("1");
		//constr.ipady = 40;
		constr.weightx = 0.0;
		constr.gridwidth = 3;
		constr.gridx = 0;
		constr.gridy = 1;
		//constr = new GridBagConstraints();
		//button = new JButton();

		//constr.gridheight = 3;
		
		
		//constr.fill = constr.HORIZONTAL;
		
		//constr.weighty = 1.0;
		//constr.anchor = constr.;
		
		gbl.setConstraints(button, constr);
		cPanel.add(button);
		*/
		JFrame jfm = new JFrame("Calculator");
		jfm.setContentPane(contentPane);
		//jfm.setSize(400, 200);
		//jfm.setResizable(false);
		jfm.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		CalculatorUI calc = new CalculatorUI();
	}
	
}
