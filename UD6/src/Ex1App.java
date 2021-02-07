import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex1App {
	
	public static int cuadrado () {
		String l = JOptionPane.showInputDialog("�Cu�nto mide el lado del cuadrado?");
		int lado = Integer.parseInt(l);
		int area;
		
		//�rea cuadrado = lado * lado
		area = lado * lado;
		
		return (area);
	}
	
	public static int triangulo () {
		String b = JOptionPane.showInputDialog("�Cu�nto mide la base del triangulo?");
		String a = JOptionPane.showInputDialog("�Cu�nto mide la altura del triangulo?");
		int base = Integer.parseInt(b);
		int altura = Integer.parseInt(a);
		int area;
		
		//�rea triangulo = (base * altura) / 2
		area = ((base * altura) / 2);
		
		return (area);
	}
	
	public static double circulo () {
		String respuesta = JOptionPane.showInputDialog("�Cu�nto mide el radio del circulo?");
		double radio = Double.parseDouble(respuesta);
		final double pi = 3.14;
		double area;
		
		//�rea circulo = (radio^2)*PI
		area = ((Math.pow(radio, 2) * pi));
		
		return (area);
		
	}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES 
		String figura = JOptionPane.showInputDialog("�Circulo, cuadrado o triangulo?");
		double aCirculo, aTriangulo, aCuadrado;
		
		//Switch con el procedimiento que hay que hacer dependiendo de la respuesta anterior.
		switch (figura) {
		case "circulo": aCirculo = circulo ();
			  JOptionPane.showMessageDialog(null, "El �rea del circulo �s = " + aCirculo);
		break;
		case "triangulo": aTriangulo = triangulo ();
			  JOptionPane.showMessageDialog(null, "El �rea del triangulo �s = " + aTriangulo);
		break;
		case "cuadrado": aCuadrado = cuadrado ();
			  JOptionPane.showMessageDialog(null, "El �rea del cuadrado �s = " + aCuadrado);
		break;
		default: JOptionPane.showMessageDialog(null,"Introduce una respuesta v�lida");
		}

	}

}
