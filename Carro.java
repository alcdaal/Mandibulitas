public class Carro {
	private String Nombre;
	private final int ID;
	private Catalogo Items,Principal;
	
	public Carro(String Nombre, int ID, Catalogo Principal){
		this.Nombre=Nombre;
		this.ID=ID;
		this.Principal=Principal;
	}
	
	public String getNombre(){
		return Nombre;
	}
	public int getID(){
		return ID;
	}
	public Catalogo getItems(){
		return Items;
	}
	
	
}