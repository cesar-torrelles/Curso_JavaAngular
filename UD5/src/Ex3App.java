import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex3App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		//MOSTRAR RESULTADOS
		JOptionPane.showMessageDialog(null, "Bienvenid@ " + nombre);

	}

}
