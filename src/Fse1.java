/*FASE1
 Creeu una variable int per cada un dels bitllets que existeixen des de 5 a 500, haureu de crear un altre
variable per guardar el preu total del menjar. (1 punt)
 Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada
plat. (1 punt)*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Fse1 {

	public static void main(String[] args) {
		 
	
		
		int cash1=5;
		int cash2=10;
		int cash3=20;
		int cash4=50;
		int cash5=100;
		int cash6=200;
		int cash7=500;
		
		int totalPrice=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primer valor");
		double plate1 = sc.nextInt ();
		
		System.out.println("Segundo valor");
		double plate2 = sc.nextInt();
		
		
		double resultado=plate1+plate2;
		
		System.out.println("El Precio total es:" + plate1 + " + " + plate2 + " = " + resultado);

 
	String stringArray []= new String [5];
	String sArray []= {"Macarrones", "PatatasAsadas", "Garbanzos", "Dorada", "Hamburguesa"};
	 for(String i : sArray) {
		 System.out.println(i);
	 }

	int intArray [] = new int [5];
	int Array []= { 9,5,11,8,9 };
       for(int j : Array) {
    	   System.out.println(j);
       }
	}
}
       
	 
	
	
	
	
