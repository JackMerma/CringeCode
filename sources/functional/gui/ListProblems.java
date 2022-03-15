/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 15/03/2022
 * @filename    : ListProblems
 */
package sources.functional.gui;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListProblems {
	
	public JPanel getListOfProblems(){
		JPanel content = new JPanel();


		return content;
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}


