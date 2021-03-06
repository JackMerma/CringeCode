/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 26/02/2022
* @filename    : Reader
* @description : _
*/

package sources.functional.process;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reader<O>{
	private String path;

	public Reader(String path){
		this.path = path;
	}

	public O read(String name){

		String completePath = this.path + "/" + name;

		try{
			FileInputStream fi = new FileInputStream(completePath);
			ObjectInputStream oi = new ObjectInputStream(fi);

			Object obj = oi.readObject();
			oi.close();

			System.out.println(name + " readed");

			return (O) obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

//	public static void main(String []args){
//		Reader<Problem> re = new Reader<Problem>("../files/problems");
//		Problem k = re.read("P2_2022");
//		System.out.println(k.getCode());
//	}
}

