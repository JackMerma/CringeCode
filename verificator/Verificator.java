/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 22/02/2022
 * @filename    : Verificator
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Verificator {
	public Verificator(){
		//
	}

	private int getCases(String code){
		//
		return 10;
	}

	private String getOutput(String code){
			
		code += ".txt";
		
		String output = "";

		try{
			File obj = new File(code);
			Scanner scan = new Scanner(obj);
			
			while(scan.hasNextLine()){
				output += scan.nextLine() + "\n";
			}

			scan.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

		return output;
	}

	public void verificate(String code){
		//
		// cantidad de casos mediante un archivo
		int cases = getCases(code);


		//	salidas de usuario y esperadas
		String outputBot, outputUser;

		outputBot = getOutput("outputBot");
		outputUser = getOutput("outputUser");

		System.out.println(outputUser);
		System.out.println(outputBot);
	}
	public static void main(String [] args){
		Verificator xx = new Verificator();
		xx.verificate("XLOSOS-1230");
	}
}


