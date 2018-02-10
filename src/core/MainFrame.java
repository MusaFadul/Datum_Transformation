package core;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javafx.scene.text.Font;
import toolset.Tools;
//import FileHandler.FileHandler;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class MainFrame {

	public static JFrame frame = new JFrame("Geodetic Transformation");;
	public static JTextField uploadTextField;
	public static JTextField saveAsTextField;

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
		
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 794, 265);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(516, 0, 278, 286);
		lblNewLabel.setIcon(Tools.getIconImage("/images/Geodetic_Transformation_Icon.jpg", 280, 280));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Geodetic Transformation");
		lblNewLabel_2.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 25));
		lblNewLabel_2.setBounds(12, 48, 304, 63);
		panel.add(lblNewLabel_2);
		
		JLabel lblVBasic = new JLabel("v.1.0 Basic");
		lblVBasic.setFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 16));
		lblVBasic.setBounds(22, 102, 176, 38);
		panel.add(lblVBasic);
		
		JLabel lblTransformGeographicCoordinates = new JLabel("Transform Geographic Coordinates to Geocentric and Vise Versa.");
		lblTransformGeographicCoordinates.setFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 18));
		lblTransformGeographicCoordinates.setBounds(12, 153, 492, 83);
		panel.add(lblTransformGeographicCoordinates);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 269, 794, 439);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		saveAsTextField = new JTextField();
		saveAsTextField.setBounds(240, 79, 422, 45);
		saveAsTextField.setColumns(10);
		panel_1.add(saveAsTextField);
		
		JButton SaveAsButton = new JButton("Save as..");
		SaveAsButton.setBounds(674, 79, 97, 45);
		SaveAsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FileHandler.FileHandler.filechooserSaveDialog();
			}
		});
		panel_1.add(SaveAsButton);
		
		uploadTextField = new JTextField();
		uploadTextField.setBounds(240, 23, 422, 45);
		uploadTextField.setColumns(10);
		panel_1.add(uploadTextField);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.setBounds(674, 23, 97, 45);
		UploadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileHandler.FileHandler.filechooserOpenDialog();
				
			}
			
		});
		panel_1.add(UploadButton);
		
		JPanel geographicToGeocentricPanel = new JPanel();
		geographicToGeocentricPanel.setBounds(12, 154, 384, 281);
		geographicToGeocentricPanel.setBackground(Color.GRAY);
		geographicToGeocentricPanel.setToolTipText("");
		panel_1.add(geographicToGeocentricPanel);
		geographicToGeocentricPanel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 35, 360, 117);
		geographicToGeocentricPanel.add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(207, 48, 141, 22);
		panel_4.add(textArea_1);
		
		JLabel lblNewLabel_4 = new JLabel("Select Datum");
		lblNewLabel_4.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 13));
		lblNewLabel_4.setBounds(14, 9, 156, 31);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblGeocentricCoordinates = new JLabel("Set  Parameters");
		lblGeocentricCoordinates.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 13));
		lblGeocentricCoordinates.setBounds(12, 62, 130, 22);
		panel_4.add(lblGeocentricCoordinates);
		String[] datums = {"WGS84","Bessel","Krassowsky","GRS80","GaüseKrüger","Lambert"};
		         
		         
		         
		
		JComboBox comboBox = new JComboBox(datums);
		comboBox.setBounds(207, 13, 141, 22);
		
		panel_4.add(comboBox);
		
		JLabel lblOr = new JLabel("Or");
		lblOr.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 17));
		lblOr.setBounds(12, 44, 211, 16);
		panel_4.add(lblOr);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(207, 82, 141, 22);
		panel_4.add(textArea);
		
		JLabel lblSemiMajorAxis = new JLabel("Semi Major Axis (a)");
		lblSemiMajorAxis.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
		lblSemiMajorAxis.setBounds(87, 45, 110, 31);
		panel_4.add(lblSemiMajorAxis);
		
		JLabel lblSemiMinorAxis = new JLabel("Semi Minor Axis (b)");
		lblSemiMinorAxis.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
		lblSemiMinorAxis.setBounds(87, 79, 110, 31);
		panel_4.add(lblSemiMinorAxis);
		
		JLabel lblNumberOfDecimal = new JLabel("Number of decimal places");
		lblNumberOfDecimal.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		lblNumberOfDecimal.setBounds(12, 154, 211, 16);
		geographicToGeocentricPanel.add(lblNumberOfDecimal);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(12, 177, 360, 100);
		geographicToGeocentricPanel.add(panel_5);
		
		JLabel label_1 = new JLabel("Geographic Coordinates");
		label_1.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
		label_1.setBounds(40, 13, 209, 31);
		panel_5.add(label_1);
		
		JLabel label_2 = new JLabel("Geocentric Coordinates");
		label_2.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
		label_2.setBounds(40, 50, 170, 31);
		panel_5.add(label_2);
		
		
		// setting the number of decimal places using JSpinner
		JSpinner geographicSpinner = new JSpinner();
		geographicSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		geographicSpinner.setBounds(261, 13, 57, 27);
		panel_5.add(geographicSpinner);
		JComponent geographicEditor = geographicSpinner.getEditor();
		JSpinner.DefaultEditor spinnerGeogrphicEditor = (JSpinner.DefaultEditor)geographicEditor;
		spinnerGeogrphicEditor.getTextField().setHorizontalAlignment(JTextField.CENTER);
		
		
		JSpinner geocentricSpinner = new JSpinner();
		geocentricSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		JComponent geocentricEditor = geocentricSpinner.getEditor();
		JSpinner.DefaultEditor spinnerGeocentricEditor = (JSpinner.DefaultEditor)geocentricEditor;
		spinnerGeocentricEditor.getTextField().setHorizontalAlignment(JTextField.CENTER);
		geocentricSpinner.setBounds(261, 53, 57, 27);
		panel_5.add(geocentricSpinner);
		
		JLabel lblReferenceEllipsoid = new JLabel("Reference Ellipsoid");
		lblReferenceEllipsoid.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		lblReferenceEllipsoid.setBounds(12, 13, 211, 16);
		geographicToGeocentricPanel.add(lblReferenceEllipsoid);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(408, 154, 374, 281);
		panel_3.setToolTipText("");
		panel_3.setBackground(Color.GRAY);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(12, 36, 350, 102);
		panel_3.add(panel_6);
		
		JCheckBox GeogToGeoCenCHeckBox = new JCheckBox("Geographic to Geocentric");
		GeogToGeoCenCHeckBox.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		GeogToGeoCenCHeckBox.setBounds(12, 9, 350, 25);
		panel_3.add(GeogToGeoCenCHeckBox);
		
		JCheckBox GeoCenToGeogCHeckBox = new JCheckBox("Geocentric to Geographic ");
		GeoCenToGeogCHeckBox.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		GeoCenToGeogCHeckBox.setBounds(12, 147, 350, 25);
		panel_3.add(GeoCenToGeogCHeckBox);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(12, 175, 350, 102);
		panel_3.add(panel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Settings");
		lblNewLabel_3.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		lblNewLabel_3.setBounds(12, 137, 200, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblGeocentricToGeographic = new JLabel("Transformation");
		lblGeocentricToGeographic.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		lblGeocentricToGeographic.setBounds(408, 137, 200, 16);
		panel_1.add(lblGeocentricToGeographic);
		
		
		 
		JLabel statusLable = new JLabel();
		statusLable.setText("status!!!!");
		statusLable.setBounds(12, 60, 227, 30);
		panel_1.add(statusLable);
		statusLable.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 713, 794, 52);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton run = new JButton("Run");
		run.setBounds(678, 2, 104, 47);
		run.setBackground(Color.green);
		panel_2.add(run);
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String statusMeasge = "Transformation completed..";
				
				statusLable.setText(statusMeasge);
				//statusLable.setFont(new Font("Serif", Font.PLAIN, 14));
				statusLable.setForeground(new Color(0,180,0));
				
			}
		});
		
		JButton close = new JButton("Cancel");
		close.setBackground(Color.red);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		close.setBounds(568, 2, 98, 47);
		panel_2.add(close);
		
		JLabel lblLisensedUnderThe = new JLabel();
		lblLisensedUnderThe.setText("(c) Musa Fadul, Omer Hassan (https://github.com/MusaFadul/Geodetic_Transformation)");
		lblLisensedUnderThe.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 15));
		lblLisensedUnderThe.setBounds(10, 23, 546, 18);
		panel_2.add(lblLisensedUnderThe);
		
		JLabel label = new JLabel();
		label.setText("licensed under the apache license, Version 2.0 ");
		label.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 15));
		label.setBounds(10, 5, 424, 17);
		panel_2.add(label);
		frame.setBounds((int) (screenSize.getWidth()/2) - ((int)appDim.getWidth()/2), (int)screenSize.getHeight()/2 - (int)appDim.getHeight()/2, (int)appDim.getWidth(), (int)appDim.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
