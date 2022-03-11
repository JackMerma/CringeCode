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
				+ "<p><b>CringeCode</b> esta proyectada a ser una plataforma de programacion competitiva abierta (red social de programacion competitiva). En esta plataforma podra desarrollar retos que implica diferentes conocimientos de algoritmos,<br>"
				+ " estructura de datos, tecnicas de programacion, complejidad temporal y espacial en algoritmos, entre muchas cosas mas.</p>"

				+ "<h1>Como funciona?</h1>"
				+ "<p>En la seccion de <b>problemas</b>, usted podra encontrar los problemas disponibles donde ya se encuentra implementada y creada el exoesqueleto que conforma un problema:</p>"
				+ "<ul>"
				+ "<li>Titulo del problema</li>"
				+ "<li>Descripcion</li>"
				+ "<li>Limitaciones</li>"
				+ "<li>Ejemplos (si es necesario)</li>"
				+ "<li>Explicacion (de ejemplos)</li>"
				+ "</ul>"
				+ "<p>En la descripcion, se presentara una forma de <b>input</b>, donde siempre se da una cantidad de casos y dependiendo de esta, usted debera generar una salidad correspondiente.<br>"
				+ "Para desarrollar esta salida, usted debera generar un <b>archivo</b> de codigo, donde pueda darle solucion a dicho problema (debe generalizar su solucion para la entrada que requiere el problema)<br>"
				+ "</p>"

				+ "<h1>Limitaciones</h1>"

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

