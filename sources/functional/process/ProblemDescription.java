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
        return content;
    }
}


