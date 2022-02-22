/**
 * @author      : Jackson Merma (mermaportocarreroj@gmail.com)
 * @created     : 21/02/2022
 * @filename    : Prueba
 */

import java.util.Scanner;

class Prueba {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i = 0;i < n;i++){
			String name = scan.next();
			System.out.println(name + " hey!");
		}
	}
}


