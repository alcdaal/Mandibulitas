public class App{
	public static void main (String[]args){
		Catalogo Principal = new Catalogo();
		new Producto("Worms",1231,300f,Principal);
		new Producto("CoDMWIII",3231,1200f,Principal);
		new Producto("Civilization",7831,500f,Principal);
		new Producto("Camisa",4435,250f,Principal);
		new Producto("IronMan",7771,1000f,Principal);
		new Producto("Barbie",9070,400f,Principal);
		new Producto("HotWheels",3422,170f,Principal);
		new Producto("Torta",1212,15f,Principal);
		new Producto("Martillo",9901,70f,Principal);
		new Producto("StormBreaker",6745,3000f,Principal);
		Carro Car1 = new Carro("Pancho",10732,Principal);
		Carro Car2 = new Carro("Angy",10956,Principal);
		Carro Car3 = new Carro("Rugal",10097,Principal);
		
		int sel;
		do{
			sel=Ventana.INICIO();
			if(sel==0){ //Admin
				do{
					sel=Ventana.ADMIN();
					if(sel==0){ //Nuevo Producto
						String Nom;
						int ID;
						float Precio;
						Nom=Ventana.PROD_NOMBRE();
						if(Nom==null || Nom.isEmpty()){
							Ventana.ERROR("Entrada Incorrecta, Abortando");
							break;
						}
						ID = Ventana.PROD_ID();
						if (ID==-1){
							Ventana.ERROR("Entrada Incorrecta, Abortando");
							break;
						}
						Precio = Ventana.PROD_PRECIO();
						if (Precio == -1f){
							Ventana.ERROR("Entrada Incorrecta, Abortando");
							break;
						}
						new Producto(Nom,ID,Precio,Principal);
						Ventana.MENSAJE("Producto Agregado");
					}else if(sel==1){ //Editar Catalogo
						String nom = Principal.MostrarCatalogo();
						Producto Prod = Principal.LocProd(nom);
						do{
							sel=Ventana.PRODUCTO(Prod);
							if(sel==0){ //Cambiar Nombre
								Prod.setNombre(Ventana.PROD_NOMBRE());
								break;
							}else if(sel==1){ //Cambiar Precio
								float Precio = Ventana.PROD_PRECIO();
								if (Precio == -1f){
									Ventana.ERROR("Entrada Incorrecta, Abortando");
									break;
								}
								Prod.setPrecio(Precio);
							}
						}while(sel!=-1 && sel!=2);
					}
				}while(sel!=-1 && sel!=2);
			}else if(sel==1){ //Cliente
				
			}
		}while(sel!=-1);
	}
}