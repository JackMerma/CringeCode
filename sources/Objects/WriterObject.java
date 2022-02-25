/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 25/02/2022
 * @filename    : WriterObject
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class WriterObject {

	private String path = "../files/problems";

	public void writeObject(String code, Problem problem){

		String completePath = this.path += "/" + code; 

		try{
			FileOutputStream fo = new FileOutputStream(completePath);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(problem);
			oo.close();
			
			System.out.println(code + "saved");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}


