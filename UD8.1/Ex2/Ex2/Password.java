package Ex2;

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
		this.contrase�a = Metodos.generarContrase�a (longitud);
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

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	//toString para mostrar el resultado
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}

}
