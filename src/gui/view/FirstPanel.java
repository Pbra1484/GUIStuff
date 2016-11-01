package gui.view;

import gui.controller.GUIController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class FirstPanel extends JPanel
{
	private GUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	
	public FirstPanel(GUIController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();	
		this.colorButton = new JButton("colors");	
	
		this.randomButton = new JButton("random colors");
		
		
		setupPanel();
		setupLayout();
		setupListeners();

		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLACK);
		this.add(colorButton);
		this.add(randomButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 98, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -77, SpringLayout.SOUTH, this);	
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -214, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -98, SpringLayout.EAST, this);
	
		
		
		
		
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.ORANGE);
			}
		});
		
		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});
		
		
		
		
	}
	
	
	
	
	
	
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
