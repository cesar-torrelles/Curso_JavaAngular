package Ex5;

public class Password {
	//Atributos
	protected int longitud;
	protected String contrase�a;
	
	//Constante
	private final int longitud_DEF = 8;

	//Constructores
	public Password() {
		this.longitud = longitud_DEF;
		this.contrase�a = "";
	}
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = Metodos.generarPassword(longitud);
	}

	//Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	//toString
	@Override
	public String toString() {
		return "Contrase�a=" + contrase�a;
	}
	
}
