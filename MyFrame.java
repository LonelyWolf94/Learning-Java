import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		MyPanel panel = new MyPanel();
		
		JButton button = new JButton("Just do it!");
		MyActionListener myActionListener = new MyActionListener();
		
		button.addActionListener(myActionListener);
		
		panel.add(button);
		
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,500);
		frame.setVisible(true);
	}
}


class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		System.out.println("Just do it!");
	}
}

class MyPanel extends JPanel{
	public void paintComponent(Graphics graphics){
		graphics.setColor(Color.yellow);
		graphics.fillRect(100, 100, 100, 100);
		graphics.setColor(Color.blue);
		graphics.fillRect(200, 100, 100, 100);
		graphics.setColor(new Color(255, 215, 0));
		graphics.fillOval(100, 200, 200, 100);
		graphics.setColor(Color.red);
		graphics.fillOval(185, 235, 30, 30);
	}
}