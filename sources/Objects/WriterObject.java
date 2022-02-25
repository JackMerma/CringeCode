/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 25/02/2022
 * @filename    : WriterObject
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class WriterObject {

	private String path = "../files/problems";

	public void writeObject(Problem problem){

		String completePath = this.path += "/" + problem.getCode(); 

		try{
			FileOutputStream fo = new FileOutputStream(completePath);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(problem);
			oo.close();
			
			System.out.println(problem.getCode() + " saved");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String []args){
		Problem p1 = new Problem("P12022");
		WriterObject wo = new WriterObject();

		wo.writeObject(p1);
	}

}
