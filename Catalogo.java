import java.util.Random;

public class Catalogo{
	private static final int MAX=30;
	private static Producto[] Productos = new Producto[MAX];
	private Random rand;
	private int i;
	private int Total;
	private int[][] Lista;//[IDProducto--Cantidad]
	
	public Catalogo(){
		i=0;
		Total=0;
		Lista = new int[MAX][2];
		rand = new Random();
	}
	
	public Producto[] getProductos(){
		return Productos;
	}
	public int getTotal(){
		return Total;
	}
	
	public Boolean ActualizarCantidad(int ProdID,int Cant){
		for (int j=0;j<i;j++){
			if (Lista[j][0]==ProdID){
				Lista[j][1]+=Cant;
				Total+=Cant;
				return true;
			}
		}
		return false;
	}
	
	public Boolean RegistrarProducto (Producto Prod){
		int Cant = rand.nextInt(15)+5;
		if(i>=MAX)
			return false;
		Productos[i] = Prod;
		Lista[i][0] = Prod.getID();
		Lista[i][1] = Cant;
		Total+=Cant;
		i++;
		return true;
	}
	
	public Boolean Agregar (Producto Prod, int Cant, Catalogo Principal){
		int ProdID=Prod.getID();
		if(Cant>0 && Cant<=Principal.Existencia(ProdID)){
			for (int j=0;j<i;j++){
				if(Lista[j][0]==ProdID){
					Principal.ActualizarCantidad(ProdID,(-1)*Cant);
					this.ActualizarCantidad(ProdID,Cant);
					return true;
				}
			}
			Lista[i][0]=ProdID;
			Principal.ActualizarCantidad(ProdID,(-1)*Cant);
			Lista[i][1]=Cant;
			i++;
			return true;
		}
		return false;
	}
	
	public Boolean Quitar (Producto Prod, Catalogo Principal){
		int ProdID=Prod.getID();
		for(int j=0;j<i;j++){
			if(Lista[j][0]==ProdID){
				int Cant=this.Existencia(ProdID);
				this.ActualizarCantidad(ProdID,(-1)*Cant);
				Principal.ActualizarCantidad(ProdID,Cant);
				return true;
			}
		}
		return false;
	}
	
	public int Existencia (int ProdID){
		for (int j=0;j<i;j++){
			if (Lista[j][0]==ProdID){
				return Lista[j][1];
			}
		}
		return -1;
	}
	
	public Boolean Vaciar (Catalogo Principal){
		Boolean test = false;
		for (int j=0; j<i;j++){
			test=Principal.ActualizarCantidad(Lista[j][0],Lista[j][1]);
		}
		i=0;
		return test;
	}
	
	public String MostrarCatalogo (){
		String[] Nombres=new String[i];
		for (int j=0;j<i;j++){
			Nombres[j]=Productos[j].getNombre();// + "Ext:" + Lista[j][1];
		}
		return Ventana.LISTA("Productos Registrados","Catalogo",Nombres);
	}
	
	public void Eliminar (Producto Prod){
		int ProdID=Prod.getID();
		this.ActualizarCantidad(ProdID,(-1)*Existencia(ProdID));
	}
	
	public Producto LocProd (String Nombre){
		for(int j=0; j<i; j++){
			if (Nombre.equals(Productos[j].getNombre()))
				return Productos[j];
		}
		return null;
	}
}