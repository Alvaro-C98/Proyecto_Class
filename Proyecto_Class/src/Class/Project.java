package Class;

public class Project {
	private String nombre;
	private String descripcion;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	public Project() { 
		this.nombre="Mk Ultra";
		this.descripcion="Control mental";
	}
	
	public Project(String name) { 
		this.nombre=name;
		this.descripcion="Arma biologica";
	}
	
	public Project(String name, String description) {
		this.nombre=name;
		this.descripcion=description;
	}
	
	
	
	public String elevatorPitch() {
		return getNombre()+" : "+getDescripcion();
	}
}
