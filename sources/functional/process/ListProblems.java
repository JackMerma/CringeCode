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

	private JPanel box;

	public ListProblems(JPanel content){
		this.box = content;
	}
	
	public JPanel getListOfProblems(){
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		createBorders(content);
		content.add(createContent());
//		content.setAlignmentX(Component.LEFT_ALIGNMENT);

		return content;
	}

	private JPanel createContent(){
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
//		content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//		content.setLayout(new FlowLayout(FlowLayout.LEFT));



		//generacion de lista de problemas con GUI
		//


		File problems = new File("sources/files/problems");

		content.add(new JLabel("\n\n"));
		if(problems.list()!= null){
			for(String problem : problems.list()){
				content.add(createProblemPanelList(problem));
				content.add(new JLabel("\n\n"));
			}
		}else{
			System.out.println("Vacio");
		}


		return content;
	}

	private JPanel createProblemPanelList(String problem){
		JPanel content = new JPanel(new GridLayout(2,1));
		content.setPreferredSize(new Dimension(680,70));
		content.setMaximumSize(content.getPreferredSize());
		content.setMinimumSize(content.getPreferredSize());
		content.setAlignmentX(Component.LEFT_ALIGNMENT);
		

		//problema
		String path = "sources/files/problems/"+problem;
//		pro = pro.read(path);
		Problem pro = new Problem();
		pro = Problem.read(path);

		String title = pro.getTitle();
		String description = processDescription(pro.getDescription());

		
		/*
		 * Titulo y boton de solucionar
		 */
		JPanel superContent = new JPanel(new FlowLayout());
		JLabel titleLabel = new JLabel(title);
		JButton solve = new JButton("Solucionar");

		//es necesario que sea estatico
		static Problem staticProblem = pro;

		//listerner para solcionar
		solve.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				box.removeAll();

				System.out.println("holaaaaa");
				ProblemDescription pd = new ProblemDescription(box, staticProblem);

				JScrollPane scroll = new JScrollPane(pd.getProblemDescription(),
						JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

				box.add(scroll);
				box.revalidate();
			}
		});

		superContent.add(titleLabel);
		superContent.add(solve);
		/*
		 * Pequeña descripcion del problema (vista previa)
		 */
		JPanel upperContent = new JPanel(new BorderLayout());
		//createBorders(upperContent);

		JTextArea desc = new JTextArea(description);
		upperContent.add(desc);

		//principales
		content.add(superContent);
		content.add(upperContent);

		return content;
	}

	private String processDescription(String desc){
		if(desc.length()>100){
			String out = desc.substring(0,100) + "\n";
			desc = desc.substring(101,desc.length());

			if(desc.length()>100)
				out += desc.substring(0,100);
			else
				out += desc;
			desc = out;
		}
		return desc+"...";
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}
