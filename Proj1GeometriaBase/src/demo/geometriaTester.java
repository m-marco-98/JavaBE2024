package demo;

import java.util.Scanner;

import forme.Punto;
import forme.Quadrato;
import forme.Rettangolo;
import forme.Segmento;
import forme.Triangolo;

public class geometriaTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int xa = sc.nextInt();
		int xb = sc.nextInt();
		
		Punto a = new Punto(xa, xb);
		Punto b = new Punto(5, 3);
		Punto c = new Punto(4, 8);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);
		
//		Creo un triangolo
		Triangolo tr1 = new Triangolo(a, b, c);
		System.out.println(tr1.toString());
		System.out.println("Il perimetro del triangolo: " + tr1.getPerimetro());
		System.out.println("L'area vale: " +tr1.getArea());
		
		
		
//		Creo un rettangolo
		Rettangolo ret1 = new Rettangolo(ab, bc);
		System.out.println(ret1.getArea());
		System.out.println(ret1.getPerimetro());
		
		
		
		System.out.println(ab.calcolaLungSegmento());
		
// 		Creo un quadrato, per crearlo ho bisogno solo di 1 segmento
		Quadrato quad1 = new Quadrato(ab);
		System.out.println("L'area vale: " + quad1.getArea());
		System.out.println("Il perimetro vale: " + quad1.getPerimetro());
		System.out.println("Il lato vale: " + quad1.lato.lunghezza);
		System.out.println("Il lato ( base del Rettangolo) vale: " + quad1.base);
		System.out.println("Il lato ( altezza del Rettangolo) vale: " + quad1.altezza);
	}
}
