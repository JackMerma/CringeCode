/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 25/02/2022
 * @filename    : WriterObject
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Writer<O>{

	private String path;

	public Writer(String path){
		this.path = path;
	}

	public void write(O object, String name){

		String completePath = this.path += "/" + name;

		try{
			FileOutputStream fo = new FileOutputStream(completePath);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(object);
			oo.close();
			
			System.out.println(name + " saved");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String []args){
		Problem p1 = new Problem("P2_2022");
		Writer<Problem> wo = new Writer<Problem>("../files/problems");

		wo.write(p1, p1.getCode());
	}

}
