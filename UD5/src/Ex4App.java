import javax.swing.JOptionPane;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex4App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String radio = JOptionPane.showInputDialog("Introduce el radio del circulo:");
		final double pi = 3.14;
		
		//MOSTRAR RESULTADOS
		double radioD = Double.parseDouble(radio);
		JOptionPane.showMessageDialog(null, "El �rea del circulo �s: " + (pi * (Math.pow(radioD, 2))));
		

	}

}
