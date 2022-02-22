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

		//process
		//
		String botLine, userLine;

		for(int i=0;i<cases && outputBot != "" && outputUser != "";i++){

			botLine = outputBot.substring(0, outputBot.indexOf("\n"));
			userLine = outputUser.substring(0, outputUser.indexOf("\n"));

			//System.out.println(botLine);
			//System.out.println(userLine);


			if(botLine.compareTo(userLine) == 0){
				if(botLine.indexOf("Case #") == -1){
					//respuesta correcta
					System.out.println("Caso "+(i+1)+" aceptado [user: "+userLine+" - bot: "+botLine+"]");
				}else{
					//cabecera
					i--;
				}
			}else{
				System.out.println("Case "+(i+1)+" no aceptado [user: "+userLine+" - bot: "+botLine+"]");
			}

			outputBot = outputBot.substring(outputBot.indexOf("\n")+1);
			outputUser = outputUser.substring(outputUser.indexOf("\n")+1);
		}
	}
	public static void main(String [] args){
		Verificator xx = new Verificator();
		xx.verificate("XLOSOS-1230");
	}
}


