package Ex5;

//Creamos una Superclase abstracta llamada Persona, clase padre de Estudiante y Profesor

abstract class Persona {
	//A�adimos sus Atributos: nombre, edad, sexo y asistencia
	protected String nombre;
	protected int edad;
	protected String sexo;
	public boolean asistencia;
	
	//A�adimos el Constructor con estos atributos
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
	//tambien a�adiremos la variable asistencia, que depende de un metodo
		this.asistencia = presenteEnClase();
	}
	
	
	//A�adimos los Getters y setters
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}
	
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public boolean getAsistencia() {
		return asistencia;
	}
	
	
	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	// Aqui invocamos al M�todo que identif�ca si una persona se ha presentado a la clase o no, este metodo depende
	//de otros valores en funcion de si su clase hija es "estudiante" o "profesor"
	// por eso decidimos hacer esta clase abstracta
	
	public abstract boolean presenteEnClase ();

}