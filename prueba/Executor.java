/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 21/02/2022
 * @filename    : Executor
 */

import java.io.*;

class Executor {

	private ProcessBuilder pb;

	public void execute(String command){
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

	public static void main(String[] args){
		Executor exe = new Executor();
		exe.execute("javac Prueba.java && java Prueba < input.txt > output.txt");
	}
}


