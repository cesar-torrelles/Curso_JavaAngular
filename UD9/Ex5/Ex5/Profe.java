package Ex5;

import java.util.Random;

public class Profe extends Persona{
	//Atributo
	private String materia;
	
	//Constantes
	public final String materia1 = "Matem�ticas";
	public final String materia2 = "Filosof�a";
	public final String materia3 = "F�sica";
	
	//Constructor
	public Profe(String materia, int i, char c, String string) {
		super();
		this.materia = materia;
	}

	//Getters & Setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	//M�todo para saber si el profe est�
	public boolean falta () {
		Random random = new Random();
		return random.nextBoolean();
	}
	
}
