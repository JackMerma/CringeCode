/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 17/03/2022
 * @filename    : ProblemDescription
 */

package sources.functional.process;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProblemDescription {
	private JPanel box;
    private Problem pro;
    private final String endl = "\n";

    public ProblemDescription(JPanel content, Problem pro){
        this.box = content;
        this.pro = pro;
    }

    public  JPanel getProblemDescription(){
        JPanel content = new JPanel(new BorderLayout());
        

        content.add(problemDescription());
        content.add(submitContent(), BorderLayout.SOUTH);
        content.add(buttonToReturn(), BorderLayout.NORTH);
        //System.out.println("SI");
        return content;
    }

    private JPanel buttonToReturn(){
        JPanel content = new JPanel(new FlowLayout());
        JButton volver = new JButton("Back");

        content.add(volver);
        return content;
    }

    private JPanel problemDescription(){
        JPanel content = new JPanel();
        String body = "";

        body += this.pro.getTitleHtml()+this.pro.getDescriptionHtml()+"<br>";
        body += "<h3>Limitations</h3>"+this.pro.getLimitations()+"<br>";
        body += "<h3>Example</h3>"+this.pro.getExample();
        body += "<h3>Explanation</h3>"+this.pro.getExplanation();

        System.out.println(this.pro.getLimitations());

        JEditorPane htmlContent = new JEditorPane();
        htmlContent.setContentType("text/html;charset=UTF-8");
        htmlContent.setEditable(false);
        htmlContent.setText(body);
        //htmlContent.getDocument().putProperty("IgnoreCharsetDirective", Boolean.TRUE);

        content.add(htmlContent);

        return content;
    }

    private JPanel submitContent(){
        JPanel content = new JPanel(new BorderLayout());

        return content;
    }
}
