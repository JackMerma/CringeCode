/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 26/02/2022
* @filename    : Main
* @description : _
*/

import sources.functional.process.*;

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
//
/*
		Problem other = new Problem("OTHER");
		other.setTitle("Rufus Lufus");
		other.setDescription("Juan es un vicionario de la medicina,"
				+ " el quiere determinar cuantas moleculas de agua se extienden"
				+ " a lo largo de todo el filtro de agua que pasa por una tubería"
				+ " en la ciudad de mexico. Ayuda a juan a que ..."
				+ "texto texto texto texto texto textotexto texto textotexto texto texto"
				+ "texto texto texto texto texto textotexto texto textotexto texto texto"
				+ "texto texto texto texto texto textotexto texto textotexto texto texto"
				+ "texto texto texto texto texto textotexto texto textotexto texto texto"
				);
		String limitations[] = {"aaaaaaa", "bbbbb", "ccccccc", "dddddddd"};
		other.setLimitations(limitations);

		other.setExample("1<br>2<br>3", "5");
		other.setExplanation("asddsd"
				+"dadsadsddddddddddddddddddddddd"
				+"dadsadsddddddddddddddddddddddd"
				+"dadsadsddddddddddddddddddddddd"
				+"dadsadsddddddddddddddddddddddd"
				+"dadsadsddddddddddddddddddddddd"
				+"dadsadsddddddddddddddddddddddd"
				+"dadsadsddddddddddddddddddddddd"
				);
		Problem other2 = new Problem("OTHER-2");
		other2.setTitle("Suma polaca");
		other2.setDescription("Jhon siempre fue un chico listo, este a los 3"
				+ " años aprendio a realizar y crear metodos para sumar mas"
				+ " mas facilmente las operaciones; a este se le propone"
				+ " determinar el resultado de una suma polaca.");

		Problem.write(other2, "sources/files/problems/OTHER-2");
*/		
	//	Problem.write(other, "sources/files/problems/OTHER");
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

