package FileHandler;

import java.io.File;
import core.MainFrame;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;



public class FileHandler  {
	
	/**
	 * Opening Dialog from FileChooser
	 */
	public static void filechooserOpenDialog() {
	     JFileChooser  fileDialog = new JFileChooser();
	     FileNameExtensionFilter sessionFileFilter = new FileNameExtensionFilter("Files", "txt");
	     fileDialog.setFileFilter(sessionFileFilter);
		
	int returnVal = fileDialog.showOpenDialog(MainFrame.frame);
	
	 if (returnVal == JFileChooser.APPROVE_OPTION) {
		 File file = fileDialog.getSelectedFile();
		 
		    try {
		    	
		    	System.out.println(fileDialog.getCurrentDirectory()+ "\\" +  file.getName());
		    	MainFrame.uploadTextField.setText(fileDialog.getCurrentDirectory()+ "\\" +  file.getName());
			
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
           
           } 
     }
	/**
	 * Saving Dialog from FileChooser
	 */
	public static void filechooserSaveDialog() {
		JFileChooser  fileDialog = new JFileChooser();
		int returnVal = fileDialog.showSaveDialog(MainFrame.frame);
		     
		 if (returnVal == JFileChooser.APPROVE_OPTION) {
			 File file = fileDialog.getSelectedFile();
			 
			    try {
			    	System.out.println(file.getName());
			    	
			    	MainFrame.saveAsTextField.setText(fileDialog.getCurrentDirectory()+ "\\" +  file.getName());
				
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
	           
	           } 
	     }
	
}
