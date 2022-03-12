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

		JEditorPane htmlContent = new JEditorPane();
		htmlContent.setContentType("text/html;charset=UTF-8");
		htmlContent.setEditable(false);
		htmlContent.setText("<html>\n"
				+ "<head><meta charset='utf-8'></head>"
				+ "<body>"
				+ "<div>"
				+ "<div class='body'>"

				+ "<h1>Sobre el Software</h1>"
				+ "<p><b>CringeCode</b> esta proyectada a ser una plataforma cerrada de programacion competitiva (el usuario mide su rendimiento consigo mismo). En esta plataforma podra desarrollar retos que requiere de diferentes<br>"
				+ " conocimientos de programacion: algoritmos, estructura de datos, tecnicas de programacion, complejidad temporal y espacial en algoritmos, entre muchas cosas mas.</p>"

				+ "<h1>Como funciona?</h1>"
				+ "<p>En la seccion de <b>problemas</b>, usted podra encontrar los problemas disponibles donde ya se encuentra implementado y creado el exoesqueleto que conforma un problema:</p>"
				+ "<ul>"
				+ "<li>Titulo del problema</li>"
				+ "<li>Descripcion</li>"
				+ "<li>Limitaciones</li>"
				+ "<li>Ejemplos (si es necesario)</li>"
				+ "<li>Explicacion (de ejemplos)</li>"
				+ "</ul>"
				+ "<p>En la descripcion, se presentara una forma de <b>input</b>, donde siempre se da una cantidad de casos y dependiendo de esta, usted debera generar una salidad correspondiente.<br>"
				+ "Para desarrollar esta salida, usted debera generar un <b>archivo</b> de codigo, donde pueda darle solucion a dicho problema (debe generalizar su solucion para la entrada que requiere el problema)<br>"
				+ "Luego, el juez (bot) de la plataforma se encargara de analizar su salida mediante el archivo que haya proporcionado. Solamente si su salida coincide con la salida esperada por el bot, se tomara al problema como <br>"
				+ "resuelto</b>, ademas que se proporcionara mas detalles de su solucion (tiempo tomado y memoria consumida) de tal forma que pueda mejorar en otros intentos.</p>"

				+ "<h1>Limitaciones</h1>"
				+ "<ul>"
				+ "<li></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "</ul>"

				+ "<h2>Algunas indicaciones</h2>"
				+ "<ul>"
				+ "<li>Los Objetos y archivos que guardan los problemas y entradas estan resguardados (encriptados)</li>"
				+ "<li>Si no tiene experiencia con este tipo de plataformas, es recomendable que mínimo pueda visitar y resolver alguno de los problemas en <a href='https://codingbat.com/'>CodingBat</a></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "<li></li>"
				+ "</ul>"


				+ "<h2>Sobre el autor</h2>"
				+ "<p>Contacto: +51 999999999</p>"

				+ "</div>"
				+ "<div class='developer'>"
				+ "</div>"
				+ "</div>"
				+ "</body>"
				+ "</html>");

		htmlContent.getDocument().putProperty("IgnoreCharsetDirective", Boolean.TRUE);

		content.add(htmlContent);

		return content;
	}

	private void createBorders(JPanel panel){
		panel.add(new JLabel(""), BorderLayout.NORTH);
		panel.add(new JLabel(""), BorderLayout.SOUTH);
		panel.add(new JLabel("   "), BorderLayout.EAST);
		panel.add(new JLabel("   "), BorderLayout.WEST);
	}
}

