package toolset;

import javax.swing.ImageIcon;

import com.sun.prism.Image;

import core.MainFrame;

public class Tools {
	
	public static ImageIcon getIconImage(String path) {
		ImageIcon icon = new ImageIcon(MainFrame.class.getResource(path));
		java.awt.Image img = icon.getImage() ;  
		java.awt.Image newimg = img.getScaledInstance( 60, 60,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		return icon;
	}
	
	public static ImageIcon getIconImage(String path, int x, int y) {
		ImageIcon icon = new ImageIcon(MainFrame.class.getResource(path));
		java.awt.Image img = icon.getImage() ;  
		java.awt.Image newimg = img.getScaledInstance( x, y,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		return icon;
	}

}
