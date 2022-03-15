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

import java.io.File;

public class ListProblems {
	
	public JPanel getListOfProblems(){
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		createBorders(content);
		content.add(createContent());

		return content;
	}

	private JPanel createContent(){
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
		content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//		content.setLayout(new FlowLayout(FlowLayout.LEFT));

		//String[] problems = getProblems();


		//generacion de lista de problemas con GUI



		content.add(new JButton("HOLA"));
		content.add(new JButton("Si"));
		content.add(new JButton("CLARO"));
		content.add(new JButton("YEAH"));
		
		//for(String str : problems){
		//	System.out.println(str);
		//}


		return content;
	}

	private String[] getProblems(){
		File file = new File("../../files/problems");
		return file.list();
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}


