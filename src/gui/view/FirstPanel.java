package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;
import java.awt.Color;
import javax.swing.JButton;

public class FirstPanel extends JPanel
{
	private GUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	
	public FirstPanel(GUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		this.colorButton = new JButton("colors");
		this.randomButton = new JButton("random colors");
		
		setupPanel();
		setupLayout();
		setupListeners();

		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.add(colorButton);
		this.add(randomButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
