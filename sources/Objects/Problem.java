/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 25/02/2022
 * @filename    : Problem
 */

import java.io.Serializable;

class Problem implements Serializable{

	private static final long serialVersionUID = 1L;

	//parte superficial y basica
	private String code;
	private String title;
	private String description;
	private String limitations;

	private String examples;
	private String explanation;
	
	//parte mecanica
	private int cases;
	private String input;
	private String output;

	
	public Problem(String code){
		this.code = code;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setLimitations(String[] limitations){
		for(int i=0;i<limitations.length;i++){
			this.limitations += "* " + limitations[i] + "\n";
		}
	}

	public void setExamples(String[] examples){
		for(int i=0;i<examples.length;i++){
			this.examples += "Example " + (i+1) + "\n" + examples[i] + "\n";
		}
	}

	public void setExplanation(String explanation){
		this.explanation = explanation;
	}

	public void setCases(int cases){
		this.cases = cases;
	}

	public void setInput(String input){
		this.input = input;
	}

	public void setOutput(String output){
		this.output = output;
	}
}


