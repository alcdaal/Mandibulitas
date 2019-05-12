public class Producto{
	private String Nombre;
	private int ID;
	private float Precio;
	
	public Producto (String Nombre, int ID, float Precio, Catalogo Principal){
		this.Nombre=Nombre;
		this.ID=ID;
		this.Precio=Precio;
		Principal.RegistrarProducto(this);
	}
	
	public String getNombre(){
		return Nombre;
	}
	public int getID(){
		return ID;
	}
	public float getPrecio(){
		return Precio;
	}
	
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public void setPrecio(float Precio){
		this.Precio=Precio;
	}
	
}