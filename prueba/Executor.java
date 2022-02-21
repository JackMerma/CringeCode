/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 21/02/2022
 * @filename    : Executor
 */

import java.io.*;

class Executor {
	public static void main(String [] args){

		String command = "javac Prueba.java && java Prueba";

		ProcessBuilder pb = new ProcessBuilder();
		pb.command("bash", "-c", command);

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
				System.out.println("Success!");
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
}


