import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */

public class Ex4App {
	
	public static void factorial (int num) {
		int producto = num;
		for (int i = num - 1; i >= 1; i--) {
			producto = producto * i;
		}
		
		JOptionPane.showMessageDialog(null, producto);
	}

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String numero = JOptionPane.showInputDialog("Introduce un n�mero:");
		int num = Integer.parseInt(numero);
		
		factorial (num);

	}

}
