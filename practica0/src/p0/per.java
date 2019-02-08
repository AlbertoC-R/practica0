package p0;

public class per {
	private int edad;
    private String nombre;
	
	public per(int edad, String string) {
		super();
		this.edad = edad;
		this.nombre = string;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "pers [edad=" + edad + ", nombre=" + nombre + "]";
	}

}
