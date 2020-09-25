package packageProject;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PianoMain {

		static  int numOfNotes;	
    	
	    public static void main(String[] args) { 

	    	pianoDesign();
}//main
	    

	    
	     static void pianoDesign(){ 
	    	 
	    	JFrame frame = new JFrame("Piano Spelare!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,300);frame.setLayout(null);frame.setVisible(true);
            
	          JButton b1 = new JButton("10"); b1.setBounds(50,50,50,100);
	          b1.setBackground(Color.BLACK); 
	            JButton b2 = new JButton("20"); b2.setBounds(100,50,50,100); 
	            b2.setBackground(Color.WHITE);
	               JButton b3 = new JButton("40"); b3.setBounds(150,50,50,100);
	               b3.setBackground(Color.BLACK);
	                 JButton b4 = new JButton("60"); b4.setBounds(200,50,50,100);
	                 b4.setBackground(Color.WHITE);
	              JButton b5 = new JButton("85"); b5.setBounds(250,50,50,100);
	              b5.setBackground(Color.BLACK);
	           JButton b6 = new JButton("95"); b6.setBounds(300,50,50,100);
	           b6.setBackground(Color.WHITE);
        JButton bx = new JButton("random"); bx.setBounds(150,200,100,30);
        bx.setBackground(Color.ORANGE); 
	          
	            frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);
	            frame.add(b5);frame.add(b6); frame.add(bx); 
	        
	        
	        //-------------manual b
	        JButton infob = new JButton("manual"); infob.setBounds(400,100,100,30);
	        infob.setBackground(Color.GRAY); 
	        frame.add(infob);
	        
	        infob.addActionListener(new ActionListener(){ 
	        	public void actionPerformed(ActionEvent e) {
	        		PianoInfo.pianoInfo();        	}   });
	        
	        
	        //-------- b1
           b1.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	   numOfNotes=Integer.parseInt(b1.getText());
        	   PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
           //-------- b2
           b2.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	   numOfNotes=Integer.parseInt(b2.getText());
        	   PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
           //-------- b3
           b3.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	   numOfNotes=Integer.parseInt(b3.getText());
        	   PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
           //-------- b4
           b4.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	   numOfNotes=Integer.parseInt(b4.getText());
        	   PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
           //-------- b5
           b5.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	   numOfNotes=Integer.parseInt(b5.getText());
        	   PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
           //-------- b6
           b6.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	   numOfNotes=Integer.parseInt(b6.getText());
        	   
        	  PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
           //-------- random b
           bx.addActionListener(new ActionListener(){ 
        	public void actionPerformed(ActionEvent e) {
        	int random = (int) (Math.random() * 75);  numOfNotes= random;
        	PlayPiano player = new PlayPiano(); 
                player.playPiano(numOfNotes); }   }); 
	           }   
    		        
           }	  



