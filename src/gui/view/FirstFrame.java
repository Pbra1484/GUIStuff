package gui.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{
	
	private GUIController baseController;
	
	public FirstFrame(GUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(new Dimension(600, 400));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
