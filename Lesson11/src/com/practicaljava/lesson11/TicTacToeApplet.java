package com.practicaljava.lesson11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.util.Random;

public class TicTacToeApplet extends JApplet implements MouseListener
{
    private static final String PLAYERX = "Player X";
    private static final String PLAYERO = "Player O";
	
    private String playerName = PLAYERX;
	
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();
    private JButton button5 = new JButton();
    private JButton button6 = new JButton();
    private JButton button7 = new JButton();
    private JButton button8 = new JButton();
    private JButton button9 = new JButton();
    private JButton[] button = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
    JButton resetButton = new JButton("New Game");
    private Random moveGen = new Random();
    private JButton randButton;
    //private int randMove;
    
    private javax.swing.JLabel playerNumber;
    private java.awt.Panel buttonsPanel;

    public void init(){
        initComponents();
    }

    private void initComponents(){
        buttonsPanel = new java.awt.Panel();
        playerNumber = new javax.swing.JLabel(playerName, SwingConstants.CENTER);
        for(JButton but : button)
        	but.addMouseListener(this);
        resetButton.addMouseListener(this);
    
        Font buttonFont = new Font("Times New Roman", Font.PLAIN, 30);
        for(JButton but : button)
        but.setFont(buttonFont);
	    
        buttonsPanel.setLayout(new java.awt.GridLayout(4, 3));
        for(JButton but : button)
        buttonsPanel.add(but);
        
        setPlayerName(PLAYERX); 
        buttonsPanel.add(playerNumber);
        
        add(buttonsPanel);
    }
	
    private void setPlayerName(String playerName){
        this.playerName = playerName;
        playerNumber.setText(playerName  + " your turn. ");
    }
	
    private void reset(){
    	for(JButton but : button){
    		but.setText("");
    		but.setBackground(null);
    		//resetButton.setText("");
    		
    	}
        setPlayerName(PLAYERX);
    }
	
   public void checkForWinner(){
        //String [] str = {"New Game"};
        
        if(findThreeInARow()){
        	
            String winnerName=(playerName == PLAYERX)?PLAYERO:PLAYERX;
      //  playerNumber.setText(winnerName.concat(" won!!! Congratulations!!!"));
            //JOptionPane.(this, winnerName.concat(" won!!! Congratulations!!!"),
        	//	"Congratulations!", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, null, str, "New Game");
            //JOptionPane.showMessageDialog(this, winnerName.concat(" won!!! Congratulations!!!"));
            playerNumber.setText(winnerName.concat(" won!!! Congratulations!!!"));
            
            
            buttonsPanel.add(resetButton);
            
            
           // resetButton.
            //reset();
        }    
        
    }

	
    public void mouseClicked(MouseEvent e) {
    	//JButton randButton;
        javax.swing.JButton currentButton = (JButton)e.getComponent();
        if (currentButton.getText() == ""){
            if (playerName == PLAYERX) {
            	
                currentButton.setText("X");
                setPlayerName(PLAYERO);
            }
            if(playerName == PLAYERO)
            {
    	        while((currentButton = button[moveGen.nextInt(8)]).getText() != "")
    	        {
    	        	randButton = button[moveGen.nextInt(8)];
    	        }
    	    	currentButton.setText("0");
    	    	setPlayerName(PLAYERX);
            }
            checkForWinner();

            
            
            
        
        }
        else if(currentButton.getText() == "New Game")
        {
        	reset();
        	buttonsPanel.remove(10);
        	buttonsPanel.repaint();
        }
       
    }

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
	
	private boolean findThreeInARow(){
	    if (button1.getText() == button2.getText() && button2.getText() == button3.getText() && button1.getText() != "")
	    {
	    	button1.setBackground(Color.RED);
	    	button2.setBackground(Color.RED);
	    	button3.setBackground(Color.RED);
	    	return true;
	    }
	    else if (button4.getText() == button5.getText() && button5.getText() == button6.getText() && button4.getText() != "")
	    {
    		button4.setBackground(Color.RED);
    		button5.setBackground(Color.RED);
    		button6.setBackground(Color.RED);
    		return true;
	    }
	    else if (button7.getText() == button8.getText() && button8.getText() == button9.getText() && button7.getText() != "")
	    {
	    	button7.setBackground(Color.RED);
    		button8.setBackground(Color.RED);
    		button9.setBackground(Color.RED);
    		return true;
	    }
	    else if(button1.getText() == button4.getText() && button4.getText() == button7.getText() && button1.getText() != "")
	    {
	    	button1.setBackground(Color.RED);
    		button4.setBackground(Color.RED);
    		button7.setBackground(Color.RED);
    		return true;
	    }
	    else if(button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != "")
	    {
	    	button2.setBackground(Color.RED);
    		button5.setBackground(Color.RED);
    		button8.setBackground(Color.RED);
    		return true;
	    }
	    else if(button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != "")
	    {
	    	button2.setBackground(Color.RED);
    		button5.setBackground(Color.RED);
    		button8.setBackground(Color.RED);
    		return true;
	    }
	    else if(button3.getText() == button6.getText() && button6.getText() == button9.getText() && button3.getText() != "")
	    {
	    	button3.setBackground(Color.RED);
    		button6.setBackground(Color.RED);
    		button9.setBackground(Color.RED);
    		return true;
	    }
	    else if(button1.getText() == button5.getText() && button5.getText() == button9.getText() && button1.getText() != "")
	    {
	    	button1.setBackground(Color.RED);
    		button5.setBackground(Color.RED);
    		button9.setBackground(Color.RED);
    		return true;
	    }
	    else if(button3.getText() == button5.getText() && button5.getText() == button7.getText() && button3.getText() != "")
	    {
	    	button3.setBackground(Color.RED);
    		button5.setBackground(Color.RED);
    		button7.setBackground(Color.RED);
    		return true;
	    }
	    
	    else
	        return false;
    }
}