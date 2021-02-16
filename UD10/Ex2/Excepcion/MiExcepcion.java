package Excepcion;

public class MiExcepcion extends Exception {
	//C�digo de la excepci�n.
	private int codigoException;
	
	//Constructores.
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
	}

	public MiExcepcion() {
		super();
	}

	//M�todo para mostrar el mensaje seg�n el c�digo que sea.
	public String getMessage() {
		
		String mensaje= "";
		
		switch (codigoException) {
		case 111: 
			mensaje = "Exception 111: Asigna valor al objeto.";
		break;
		case 112:
			mensaje = "Exception 112: Error en el c�digo.";
		break;
		case 024: 
			mensaje = "�s par.";
		break;
		case 135:
			mensaje = "�s impar.";
		break;
		}
		return mensaje;
	}
}
