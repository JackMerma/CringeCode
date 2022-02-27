/** 
* @author      : Jackson Fernando Merma Portocarrero (jmermap@unsa.edu.pe)
* @created     : 26/02/2022
* @filename    : Main
* @description : _
*/

import java.util.*;
import sources.Objects.*;

public class Main{
	public static void main(String[]args){
		Problem pro1 = new Problem("NTN");//n times name
		pro1.setInput("2\nJackson\nMerma\n");

		Writer<Problem> wri = new Writer<Problem>("sources/files/problems");
		wri.write(pro1, pro1.getCode());

		Maker maker = new Maker();
		maker.execute(pro1.getCode());
	}
}

