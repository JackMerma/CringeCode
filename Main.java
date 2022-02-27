/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 26/02/2022
* @filename    : Main
* @description : _
*/

import sources.functional.process.*;
import sources.functional.gui.*;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Main{

	public static JFrame frame;

	public static void main(String[]args){
//		Problem pro1 = new Problem("NTN");//n times name
//		pro1.setInput("3\nBarbara\nBojack\nRubi\n");
//
//		Writer<Problem> wri = new Writer<Problem>("sources/files/problems");
//		wri.write(pro1, pro1.getCode());
//
//		Maker maker = new Maker();
//		maker.execute(pro1.getCode());
		
		generateFrame();
	}

	public static void generateFrame(){
		frame = new JFrame("CRINGEcode");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		generateContent();

		frame.setVisible(true);
	}

	public static void generateContent(){
		
		Home home = new Home();

		JPanel general = home.getHome();

		frame.add(general);

	}
}

