/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 27/02/2022
* @filename    : Nav
* @description : _
*/

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Nav{
	
	public JPanel getNavigatorPanel(){
		JPanel global = new JPanel();
		global.setLayout(new BorderLayout());

		JPanel content = getContent();

		global.add(content);
		//bordes...

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

	}

	private JPanel getUpperPanel(){

	}
}

