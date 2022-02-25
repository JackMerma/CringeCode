/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 25/02/2022
 * @filename    : Problem
 */
class Problem {

	//parte superficial y basica
	private String code;
	private String title;
	private String description;
	private String limitations;

	private String examples;
	private String explanation;
	
	//parte mecanica
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


	public static void main(String [] args){
		//code
	}
}


