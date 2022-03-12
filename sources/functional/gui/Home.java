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

	public JPanel content=new JPanel(), nav=new JPanel();

	public JPanel getHome(){
		JPanel global = new JPanel();
		global.setLayout(new BorderLayout());

		content = createContentPanel();
		nav = createNavigatorPanel(content);


		global.add(nav, BorderLayout.NORTH);
		global.add(content);


		return global;
	}

	private JPanel createNavigatorPanel(JPanel content){
		Nav nav = new Nav(content);
		return nav.getNavigatorPanel();
	}

	private JPanel createContentPanel(){
		content = new JPanel();
		content.setLayout(new BorderLayout());

		HomeBody hb = new HomeBody();
		content.add(hb.getHomeBody());

		return content;
	}
}

