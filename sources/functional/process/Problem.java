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

	private String example;
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
		this.title = "<h2>" + title + "</h2>";
	}

	public void setDescription(String desc){
		while(desc != ""){
			if(desc.length()>150){
				this.description += desc.substring(0,150) + "<br>";
				desc = desc.substring(151, desc.length());
			}else{
				this.description += desc;
				desc = "";
			}
		}
		//this.description = "<p>" + this.description + "</p>";
	}

	public void setLimitations(String[] limitations){
		for(int i=0;i<limitations.length;i++){
			this.limitations += "<ul>" + limitations[i] + "</ul>";
		}
		this.limitations = "<ul>"+this.limitations+"</ul>";
	}

	public void setExample(String input, String output){
		this.example = "<h4>Input</h4>"
			+ "<p>" + input + "</p>"
			+ "<h4>Output</h4>"
			+ "<p>" + output + "</p>";
	}

	public void setExplanation(String exp){
		while(exp != ""){
			if(exp.length()>150){
				this.explanation += exp.substring(0,150) + "<br>";
				exp = exp.substring(151, exp.length());
			}else{
				this.explanation += exp;
				exp = "";
			}
		}
		this.explanation = "<p>" + this.explanation + "</p>";
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

	public String getExample(){
		return this.example;
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


