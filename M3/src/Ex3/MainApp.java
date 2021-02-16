package Ex3;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String vehiculo;
		String matricula;
		String marca;
		String color;
		String marcaRuedasDelanteras = null;
		double diametroRuedasDelanteras = 0;
		String marcaRuedasTraseras = null;
		double diametroRuedasTraseras = 0;		
		Scanner teclado = new Scanner (System.in);
		
		//ENTRADA DE DATOS
		Titular titular = new Titular ("Maite", "Garcia", "28/06/1973", "Carnet de conducir", true, true);
		System.out.println("�Qu� veh�culo quieres crear? coche, moto o cami�n?");
		vehiculo = teclado.next();
		System.out.println("Intoduce la matr�cula del veh�culo:");
		matricula = teclado.next();
		System.out.println("Introduce la marca del veh�culo:");
		marca = teclado.next();
		System.out.println("Introduce el color del veh�culo:");
		color = teclado.next();
		
		if (vehiculo.equalsIgnoreCase("Coche")) {
			Vehiculo coche;
			Metodos.introducirDatos(teclado, marcaRuedasDelanteras, diametroRuedasDelanteras, marcaRuedasTraseras, diametroRuedasTraseras);
			coche = new Coche (matricula, marca, color, marcaRuedasDelanteras, diametroRuedasDelanteras, marcaRuedasTraseras, diametroRuedasTraseras);
			System.out.println(coche.toString());
		}
		if (vehiculo.equalsIgnoreCase("Moto")) {
			Vehiculo moto;
			Metodos.introducirDatos(teclado, marcaRuedasDelanteras, diametroRuedasDelanteras, marcaRuedasTraseras, diametroRuedasTraseras);
			moto = new Moto (matricula, marca, color, marcaRuedasDelanteras, diametroRuedasDelanteras, marcaRuedasTraseras, diametroRuedasTraseras);
			System.out.println(moto.toString());
		}
		if (vehiculo.equalsIgnoreCase("Cami�n")) {
			Vehiculo camion;
			Metodos.introducirDatos(teclado, marcaRuedasDelanteras, diametroRuedasDelanteras, marcaRuedasTraseras, diametroRuedasTraseras);
			camion = new Camion (matricula, marca, color, marcaRuedasDelanteras, diametroRuedasDelanteras, marcaRuedasTraseras, diametroRuedasTraseras);
			System.out.println(camion.toString());
		}
		

	}

}
