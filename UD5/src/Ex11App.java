import javax.swing.JOptionPane;
/**
 * 
 * @author Ingrid Dominguez
 *
 */
public class Ex11App {

	public static void main(String[] args) {
		//DECLARACI�N DE VARIABLES
		String dia = JOptionPane.showInputDialog("Introduce un d�a de la semana: ");
		
		//MOSTRAR RESULTADOS
		switch (dia) {
		case "Lunes": JOptionPane.showMessageDialog(null, "�s un d�a laborable");
		break;
		case "Martes": JOptionPane.showMessageDialog(null, "�s un d�a laborable");
		break;
		case "Mi�rcoles": JOptionPane.showMessageDialog(null, "�s un d�a laborable");
		break;
		case "Jueves": JOptionPane.showMessageDialog(null, "�s un d�a laborable");
		break;
		case "Viernes": JOptionPane.showMessageDialog(null, "�s un d�a laborable");
		break;
		case "S�bado": JOptionPane.showMessageDialog(null, "�s un d�a laborable");
		break;
		case "Domingo": JOptionPane.showMessageDialog(null, "NO �s un d�a laborable");
		break;
		default: JOptionPane.showMessageDialog(null, "ERROR! INTRODUCE UNA RESPUESTA V�LIDA");
		}
	}

}
