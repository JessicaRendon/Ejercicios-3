/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ortografía;

import java.util.Scanner;

/**
 *
 * @author Windows 7
 */
public class Ortografía {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner s=new Scanner(System.in);

	int n=s.nextInt();
	while(n!=0){
		int aux=0;

		String k=s.nextLine();

		String kk=s.nextLine();
	
		
	for(int i=0;i<kk.length();i++){
		if(k.charAt(i)!=kk.charAt(i)){
			aux++;
		}
	}
	if(aux==0){
		System.out.println(kk+" Es correcta");
	}
		if(aux>0 && aux<2 ){
			System.out.println(kk+" Es casi correcta");
		}
		if(aux>=3){
			System.out.println(kk+" Es incorrecta");
		}
		n--;
		
	}
    }
    
}
