import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex5App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String numero = JOptionPane.showInputDialog("Introduce un n�mero: ");

		//MOSTRAR RESULTADOS
		int numeroI = Integer.parseInt(numero);
		
		if (numeroI % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El n�mero �s divisible por 2.");
		}
		else {
			JOptionPane.showMessageDialog(null, "El n�mero no �s divisible por 2.");
		}
	}

}
