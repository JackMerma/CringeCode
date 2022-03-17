/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 25/02/2022
 * @filename    : Problem
 */

package sources.functional.process;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Problem implements Serializable{

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

	public Problem(){
		this.code = "xxxxxxxx";
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


	public static Problem read(String path){
		try{
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream oi = new ObjectInputStream(fi);

			Object obj = oi.readObject();
			oi.close();

			System.out.println(path + " readed");

			return (Problem) obj;
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println("No se puede abrir");
			return null;
		}
	}


	public static void write(Problem pro, String path){
		try{
			FileOutputStream fo = new FileOutputStream(path);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(pro);
			oo.close();
			
			System.out.println(path + " saved");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//getters

	public String getCode(){
		return this.code;
	}

	public String getTitle(){
		return this.title;
	}

	public String getDescription(){
		return this.description;
	}

	public String getLimitations(){
		return this.limitations;
	}

	public String getExamples(){
		return this.examples;
	}

	public String getExplanation(){
		return this.explanation;
	}

	public int getCases(){
		return this.cases;
	}

	public String getInput(){
		return this.input;
	}

	public String getOutput(){
		return this.output;
	}
}


