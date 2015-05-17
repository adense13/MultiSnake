package ClientSide;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;

public class View implements KeyListener{

	private JFrame frmMultisnake;
	Level level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frmMultisnake.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMultisnake = new JFrame();
		frmMultisnake.setResizable(false);
		frmMultisnake.setTitle("MultiSnake");
		frmMultisnake.setBounds(100, 100, 512, 512);
		frmMultisnake.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMultisnake.getContentPane().setLayout(new BorderLayout(0, 0));
		
		level = new Level();
		level.setToolTipText("");
		level.setBackground(new Color(160, 82, 45));
		frmMultisnake.getContentPane().add(level, BorderLayout.CENTER);
		frmMultisnake.addKeyListener(this);
	}

	
	//------------------------------------------------
	//        KEY LISTENER PART
	//------------------------------------------------
	public void keyPressed(KeyEvent key) {
		if(key.getKeyCode() == KeyEvent.VK_UP){
			System.out.println("UP KEY");
			//level.getPlayer().pressUp();
			level.pressUp();
		}
		else if(key.getKeyCode() == KeyEvent.VK_DOWN){
			System.out.println("DOWN KEY");
			//level.getPlayer().pressDown();
			level.pressDown();
		}
		else if(key.getKeyCode() == KeyEvent.VK_LEFT){
			System.out.println("LEFT KEY");
			//level.getPlayer().pressLeft();
			level.pressLeft();
		}
		else if(key.getKeyCode() == KeyEvent.VK_RIGHT){
			System.out.println("RIGHT KEY");
			//level.getPlayer().pressRight();
			level.pressRight();
		}
		
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
}
