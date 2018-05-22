import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lights implements ActionListener{
	public static JFrame frame = new JFrame();
	private MyPanel panelWithLights = new MyPanel();
	
	public static void main(String[] args){
		new Lights().start();
	}
	
	public void start(){
		JPanel panelWithButtons = new JPanel();
		
		JButton greenButton = new JButton("Green");
		JButton yellowButton = new JButton("Yellow");
		JButton redButton = new JButton("Red");
		JButton off = new JButton("off");
		
		panelWithButtons.add(redButton);
		panelWithButtons.add(yellowButton);
		panelWithButtons.add(greenButton);
		panelWithButtons.add(off);
		
		greenButton.addActionListener(this);
		yellowButton.addActionListener(this);
		redButton.addActionListener(this);
		off.addActionListener(this);
		
		
		frame.getContentPane().add(BorderLayout.CENTER, panelWithLights);
		frame.getContentPane().add(BorderLayout.EAST, panelWithButtons);
		
		frame.setSize(1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		int state;
		switch(event.getActionCommand()){
			case "Green":
				state = 1;
				break;
			case "Yellow":
				state = 2;
				break;
			case "Red":
				state = 3;
				break;
			default:
				state = 0;
				break;
		}
		if (frame != null){			
			panelWithLights.setState(state);
			frame.repaint();
		}		
	}
}

class MyPanel extends JPanel{
	private int state;
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
	}
	
	public void paintComponent(Graphics graphics){		
		Color color = new Color(255, 255, 255);
		
		graphics.setColor(color);
		graphics.fillRect(0, 0, Lights.frame.getWidth(), Lights.frame.getHeight());
		
		graphics.setColor(Color.black);
		graphics.fillRect(1, 1, 235, 80);
		graphics.setColor(Color.gray);
		graphics.fillOval(1, 3, 75, 75);
		graphics.fillOval(80, 3, 75, 75);
		graphics.fillOval(160, 3, 75, 75);
		
		switch(state){
			case 1:
				graphics.setColor(Color.green);
				graphics.fillOval(160, 3, 75, 75);
				break;
			case 2:
				graphics.setColor(Color.yellow);
				graphics.fillOval(80, 3, 75, 75);
				break;
			case 3:
				graphics.setColor(Color.red);
				graphics.fillOval(1, 3, 75, 75);
				break;
			case 0:
				break;
		}
		
	}
}