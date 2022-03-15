/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 15/03/2022
 * @filename    : ListProblems
 */
package sources.functional.process;

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



		//generacion de lista de problemas con GUI
		//


		File problems = new File("sources/files/problems");

		if(problems.list()!= null){
			for(String problem : problems.list()){
				content.add(createProblemPanelList(problem));
			}
		}else{
			System.out.println("Vacio");
		}


		return content;
	}

	private JPanel createProblemPanelList(String problem){
		JPanel content = new JPanel(new BorderLayout());
		
		Reader reader = new Reader("sources/files/problems");
		Problem pro = reader.read(problem);

		//optencion de recursos


		return content;
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}


