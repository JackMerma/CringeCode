/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 21/02/2022
 * @filename    : Executor
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Maker {

	private ProcessBuilder pb;

	public void execute(String code){

		generateInputFile(code);

		String command = "javac ../file/solutions/solution_"+code+".java && ../file/solutions/solution_"+code+" < ../file/process/input.txt > ../file/process/output.txt";
		//"javac Prueba.java && java Prueba < input.txt > output.txt"


		pb = new ProcessBuilder();
		takeWayToRun(command);

		try{
			Process process = pb.start();
			StringBuilder output =  new StringBuilder();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(process.getInputStream()));

			String line;
			while((line = reader.readLine()) != null){
				output.append(line + "\n");
			}


			int exitValue = process.waitFor();
			if(exitValue == 0){
				System.out.println("---------------Success!----------------");
				System.out.println(output);
				System.exit(0);
			}else{
				System.out.println("Anormal...");
			}
		}catch (IOException e){
			e.printStackTrace();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}

	private void takeWayToRun(String command){
		String os = getOs();
		if(os.indexOf("linux") != -1){
			pb.command("bash", "-c", command);
		}else if(os.indexOf("windows") != -1){
			pb.command("cmd.exe", "/c", command);
		}else{
			//others
		}
	}

	private String getOs(){
		return System.getProperty("os.name").toLowerCase();
	}


	private void generateInputFile(String code){
		Reader<Problem> re = new Reader<Problem>("../files/problems");
		Problem pro = re.read(code);
		
		String input = pro.getInput();

		//genera el input en un archivo
		writeInInput(input);
	}

	private void writeInInput(String input){
		try{
			FileWriter wri = new FileWriter("../file/process/input.txt");
			wri.write(input);
			wri.close();
			System.out.println("Writed input");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}


