/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 27/02/2022
* @filename    : Home
* @description : _
*/

package sources.functional.gui;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Home{

	public JPanel getHome(){
		JPanel global = new JPanel();

		global.setLayout(new BorderLayout());

		JPanel nav = createNavigatorPanel();
		JPanel content = createContentPanel();


		global.add(nav, BorderLayout.NORTH);
		global.add(content);


		return global;
	}

	private JPanel createNavigatorPanel(){
		Nav nav = new Nav();
		return nav.getNavigatorPanel();
	}

	private JPanel createContentPanel(){
		JPanel content = new JPanel();
		

		return content;
	}
}

