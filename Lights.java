import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lights implements ActionListener{
	public static JFrame frame = new JFrame();
	
	public static void main(String[] args){
		new Lights().start();
	}
	
	public void start(){				
		JPanel panelWithLights = new MyPanel();
		JPanel panelWithButtons = new JPanel();
		
		JButton greenButton = new JButton("Green");
		JButton yellowButton = new JButton("Yellow");
		JButton redButton = new JButton("Red");
		
		panelWithButtons.add(greenButton);
		panelWithButtons.add(yellowButton);
		panelWithButtons.add(redButton);
		
		greenButton.addActionListener(this);
		
		
		frame.getContentPane().add(BorderLayout.CENTER, panelWithLights);
		frame.getContentPane().add(BorderLayout.EAST, panelWithButtons);
		
		frame.setSize(1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		if (frame != null){
			frame.repaint();
		}
		System.out.println(event.getActionCommand());
	}
}

class MyPanel extends JPanel{
	public void paintComponent(Graphics graphics){		
		Color color = new Color(255, 255, 255);
		
		graphics.setColor(color);
		graphics.fillRect(1, 1, Lights.frame.getWidth(), Lights.frame.getHeight());
	}
}