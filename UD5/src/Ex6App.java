import javax.swing.JOptionPane;

/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex6App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String numero = JOptionPane.showInputDialog("Introduce el precio del producto: ");
		final double IVA = 0.21;
		
		//MOSTRAR RESULTADOS
		int precio = Integer.parseInt(numero);
		
		JOptionPane.showMessageDialog(null, "El precio total �s= " + ((precio * IVA) + precio) + "�");

	}

}
