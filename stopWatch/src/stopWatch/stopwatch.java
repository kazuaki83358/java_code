package stopWatch;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;

public class stopwatch implements ActionListener {
	JFrame frame = new JFrame();
	JButton start_button = new JButton("START");
	JButton reset_button = new JButton("RESET");
	JLabel timeLabel = new JLabel();
	
	int elapsedtime =0;
	int seconds=0;
	int minutes=0;
	int hours=0;
	boolean starrted = false;
	
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_String = String.format("%02d", minutes);
	
	Timer timer = new Timer(1000,new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			elapsedtime = elapsedtime+1000;
			hours = (elapsedtime/3600000);
			minutes = (elapsedtime/60000)%60;
			seconds = (elapsedtime/1000)%60;
			
			 seconds_string = String.format("%02d", seconds);
			 minutes_string = String.format("%02d", minutes);
			 hours_String = String.format("%02d", minutes);
			 timeLabel.setText(hours_String+":"+minutes_string+":"+seconds_string);
		}
	});
	
	stopwatch(){
		timeLabel.setText(hours_String+":"+minutes_string+":"+seconds_string);
		timeLabel.setBounds(100,100,200,100);
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		
		start_button.setBounds(100,200,100,50);
		start_button.setFont(new Font("Ink Free",Font.PLAIN,20));
		start_button.setFocusable(false);
		start_button.addActionListener(this);
		
		reset_button.setBounds(200,200,100,50);
		reset_button.setFont(new Font("Ink Free",Font.PLAIN,20));
		reset_button.setFocusable(false);
		reset_button.addActionListener(this);
		
		frame.add(timeLabel);
		frame.add(start_button);
		frame.add(reset_button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == start_button) {
	        if (starrted == false) {
	            starrted = true;
	            start_button.setText("STOP");
	            start();
	        } else {
	            starrted = false;
	            start_button.setText("START");
	            stop();
	        }
	    }
	    // move the reset button code block outside of the start_button block
	    else if (e.getSource() == reset_button) {
	        starrted = false;
	        start_button.setText("START");
	        reset();
	    }
	}

	void start() {
		timer.start();
	}
	void stop() {
		timer.stop();
	}
	void reset() {
		timer.stop();
		int elapsedtime =0;
		int seconds=0;
		int minutes=0;
		int hours=0;
		
		seconds_string = String.format("%02d", seconds);
		 minutes_string = String.format("%02d", minutes);
		 hours_String = String.format("%02d", minutes);
		 timeLabel.setText(hours_String+":"+minutes_string+":"+seconds_string);
		
	}
	public static void main(String[] args) {
		new stopwatch();
	}

}