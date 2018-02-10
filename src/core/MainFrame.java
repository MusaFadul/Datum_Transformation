package core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javafx.scene.text.Font;
import toolset.Tools;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Look and Feel Using JTatoo
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension appDim = new Dimension(800, 800);
		
		frame = new JFrame("Geodetic Transformation");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 794, 286);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(Tools.getIconImage("/images/Geodetic_Transformation_Icon.jpg", 280, 280));
		//lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/images/Geodetic_Transformation_Icon.jpg")));
		lblNewLabel.setBounds(516, 0, 278, 286);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 290, 794, 427);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		 
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 27));
		lblNewLabel_1.setBounds(12, 10, 313, 30);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 721, 794, 44);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton run = new JButton("Run");
		run.setBounds(555, 10, 89, 31);
		panel_2.add(run);
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String successMeasge = "Transformation completed Successfully";
				
				lblNewLabel_1.setText(successMeasge);
				//lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 14));
				lblNewLabel_1.setForeground(new Color(0,180,0));
				
			}
		});
		
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		close.setBounds(693, 10, 89, 31);
		panel_2.add(close);
		panel_2.add(lblNewLabel_1);
		frame.setBounds((int) (screenSize.getWidth()/2) - ((int)appDim.getWidth()/2), (int)screenSize.getHeight()/2 - (int)appDim.getHeight()/2, (int)appDim.getWidth(), (int)appDim.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
