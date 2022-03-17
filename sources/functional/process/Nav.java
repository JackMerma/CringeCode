/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 27/02/2022
* @filename    : Nav
* @description : _
*/

package sources.functional.process;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nav{

	public JPanel box;

	public Nav(JPanel content){
		this.box = content;
	}
	
	public JPanel getNavigatorPanel(){
		JPanel global = new JPanel();
		global.setLayout(new BorderLayout());

		JPanel content = getContent();

		global.add(content);
		createBorders(global);

		return global;
	}

	private JPanel getContent(){
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(2,1));

		JPanel superPanel = getSuperPanel();
		JPanel upperPanel = getUpperPanel();

		center.add(superPanel);
		center.add(upperPanel);

		return center;
	}

	private JPanel getSuperPanel(){
		JPanel global = new JPanel();
		global.setLayout(new BorderLayout());

		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());

		//logo
		JLabel logo = new JLabel("CRINGEcode");


		
		
		principal.add(logo, BorderLayout.WEST);
		global.add(principal);
		createBorders(global);

		return global;
	}

	private JPanel getUpperPanel(){
		JPanel global = new JPanel(new FlowLayout(FlowLayout.CENTER));
		

		JPanel principal = new JPanel();
		principal.setLayout(new GridLayout(1,5, 10, 10));

		//barra de menu
		JButton home = new JButton("Home");
		JButton news = new JButton("News");
		JButton problems = new JButton("Problems");
		JButton help = new JButton("Help");
		JButton submissions = new JButton("Submissions");


		//action listeners
		//
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				box.removeAll();

				HomeBody newContent = new HomeBody();

				JScrollPane scroll = new JScrollPane(newContent.getHomeBody(),
						JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

				box.add(scroll);
				box.revalidate();
			}
		});

		news.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//
				JOptionPane.showMessageDialog(null, "NEWS!");
			}
		});

		problems.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				box.removeAll();
				
				ListProblems lp = new ListProblems();

				JScrollPane scroll = new JScrollPane(lp.getListOfProblems(),
						JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

				box.add(scroll);
				box.revalidate();
			}
		});

		help.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//
				JOptionPane.showMessageDialog(null, "HELP!");
			}
		});

		submissions.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//
				JOptionPane.showMessageDialog(null, "SUBMISSIONS!");
			}
		});


		principal.add(home);
		principal.add(news);
		principal.add(problems);
		principal.add(help);
		principal.add(submissions);

		global.add(principal);
		//createBorders(global);

		return global;
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}
