/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.camiones;

import java.util.Scanner;

/**
 *
 * @author Windows 7
 */
public class Camiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        int C;
        double XA,XB,YA,YB,CamionA,CamionB;
        System.out.println("Numero de colecciones");
        C=s.nextInt();
        for(int i=0;i<C;i++){
        do{    
            System.out.println("Digite la coordenada del camion A, X & Y respectivamente. Que no pasen de 20 y -20");
            XA=s.nextDouble();
            YA=s.nextDouble();
        }while(XA>20 || YA>20);
        do{
            System.out.println("Digite la coordenada del camion B, X & Y respectivamente. Que no pasen de 20 y -20");
            XB=s.nextDouble();
            YB=s.nextDouble();
        }while(XB>20 || YB>20);
            CamionA=(double)Math.sqrt(Math.pow((XA-0),2)+ Math.pow((YA-0),2));
            CamionB=(double)Math.sqrt(Math.pow((XB-0),2)+ Math.pow((YB-0),2));
            if(CamionA<CamionB){
                System.out.println("EL CAMION A ESTA MAS CERCA");
            }else{
		System.out.println("EL CAMION B ESTA MAS CERCA");
            }
        }
    }
    
}
