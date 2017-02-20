package agenda;

public class Personas {

	String id;
	String nombre;
	String correo;
	int edad;
	
	public void personas(){
		
	}
	
	@Override
	public String toString() {
		return "Personas [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + "]";
	}
	public Personas(String id, String nombre, String correo, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
		
}
