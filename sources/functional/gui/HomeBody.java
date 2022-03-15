/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 11/03/2022
* @filename    : HomeBody
* @description : _
*/
package sources.functional.gui;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeBody{
	public JPanel getHomeBody(){
		JPanel principal = new JPanel();
		principal.setLayout(new BorderLayout());
		createBorders(principal);

		principal.add(createContent());

		return principal;
	}

	private JPanel createContent(){
		JPanel content = new JPanel();

		JTextArea text = new JTextArea("Sobre el Software\n"
				+ "CringeCode esta proyectada a ser una plataforma cerrada de programacion competitiva (el usuario mide su rendimiento consigo mismo). En esta plataforma podra desarrollar retos que requiere de\n"
				+ "diferentes conocimientos de programacion: algoritmos, estructura de datos, tecnicas de programacion, complejidad temporal y espacial en algoritmos, entre muchas cosas mas.\n"

				+ "\n\nComo funciona?\n"
				+ "En la seccion de problemas, usted podra encontrar los problemas disponibles donde ya se encuentra implementado y creado el exoesqueleto que conforma un problema:\n\n"
				+ "+ Titulo del problema\n"
				+ "+ Descripcion\n"
				+ "+ Limitaciones\n"
				+ "+ Ejemplos (si es necesario)\n"
				+ "+ Explicacion (de ejemplos)\n\n"
				+ "En la descripcion, se presentara una forma de input, donde siempre se da una cantidad de casos y dependiendo de esta, usted debera generar una salidad correspondiente.\n"
				+ "Para desarrollar esta salida, usted debera generar un archivo de codigo, donde pueda darle solucion a dicho problema (debe generalizar su solucion para la entrada que requiere el problema)\n"
				+ "Luego, el juez (bot) de la plataforma se encargara de analizar su salida mediante el archivo que haya proporcionado. Solamente si su salida coincide con la salida esperada por el bot, se tomara al\n"
				+ "problema como resuelto, ademas que se proporcionara mas detalles de su solucion (tiempo tomado y memoria consumida) de tal forma que pueda mejorar en otros intentos.\n"

				+ "\n\nLimitaciones\n"
				+ "+ \n"
				+ "+ \n"
				+ "+ \n"

				+ "\n\nAlgunas indicaciones\n"
				+ "+ Los Objetos y archivos que guardan los problemas y entradas estan resguardados (encriptados)\n"
				+ "+ Si no tiene experiencia con este tipo de plataformas, es recomendable que mínimo pueda visitar y resolver alguno de los problemas en https://codingbat.com/\n"
				+ "+ \n"
				+ "+ \n"
				+ "+ \n"
				+ "+ \n"


				+ "\n\nSobre el autor\n"
				+ "Contacto: +51 999999999\n");

		content.add(text);
		return content;
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}

