public class App{
	public static void main (String[]args){
		Catalogo Principal = new Catalogo();
		new Producto("Tenis",1231,300f,Principal);
		new Producto("Maleta",3231,1200f,Principal);
		new Producto("Chamarra",7831,500f,Principal);
		new Producto("Camisa",4435,250f,Principal);
		new Producto("GameBoy",7771,1000f,Principal);
		new Producto("Barbie",9070,400f,Principal);
		new Producto("HotWheels",3422,170f,Principal);
		new Producto("Torta",1212,15f,Principal);
		new Producto("Martillo",9901,70f,Principal);
		new Producto("Mini Carro",6745,3000f,Principal);
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
						Ventana.PRODUCTO(Prod);
					}
				}while(sel!=-1 && sel!=2);
			}else if(sel==1){ //Cliente
			
			Carro CarAux;
			sel = Ventana.CLIENTE(Car1, Car2, Car3);
			
			switch(sel){ //
				
				case 0:
				CarAux = Car1;
				break;
				
				case 1:
				CarAux = Car2;
				break;
				
				case 2:
				CarAux = Car3;
				break;	
			}
			
			if(sel!=3 && sel!=-1){				
				Catalogo CatAux = CarAux.getItems();
			    sel = Ventana.CARRO(CarAux);
				
				switch(sel){//Agregar ITEM
					case 0:
					String Cat = Principal.MostrarCatalogo();
				    Producto ProdAux = Principal.LocProd();
					int cantidad = Ventana.P_CANTIDAD();
					CatAux.Agregar(ProdAux, cantidad, Principal);
					break;
				}
			}
			}
		}while(sel!=-1);
	}
}
