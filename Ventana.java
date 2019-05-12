import javax.swing.JOptionPane;
public class Ventana{
	public static void MENSAJE(String Mensaje){
		JOptionPane.showMessageDialog(null, Mensaje,"Info", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void pnt (String print){
		System.out.println(print);
	}
	public static String LISTA (String Titulo, String Nombre, String[] items){
		return (String)JOptionPane.showInputDialog(null, Nombre, Titulo, JOptionPane.INFORMATION_MESSAGE,
									null, items, items[0]);
	}
	public static int INICIO (){ //0:Admin, 1:Cliente, -1:Salir
		String[] Usuarios = {"Administrador","Cliente"};
		return JOptionPane.showOptionDialog(null,"Bienvenido a Mandibulitas\nUsted es:","Bienvenido",
									 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
									 null, Usuarios, Usuarios[0]);
	}
	public static int ADMIN (){
		String[] Opciones = {"Nuevo Producto","Editar Catalogo","Regresar"};
		return JOptionPane.showOptionDialog(null,"Bienvenido Admin\n ¿Que desea hacer?","Administrador",
									 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
									 null, Opciones, Opciones[0]);
	}
	
	public static int PRODUCTO (Producto Prod){
		String Opciones[] = {"Nombre", "Precio","Regresar"};
		return JOptionPane.showOptionDialog(null,"Producto:  " + Prod.getNombre() + "\nID:  " + Prod.getID()
											+ "\nPrecio:  $" + Prod.getPrecio() + "\nModificar:",
											"Administrador",JOptionPane.YES_NO_CANCEL_OPTION,
											JOptionPane.PLAIN_MESSAGE, null, Opciones, Opciones[0]);
	}
	
	public static String PROD_NOMBRE (){
		return JOptionPane.showInputDialog("Escriba el Nombre:");
	}
	public static int PROD_ID (){
		String Num = JOptionPane.showInputDialog("Escriba el ID:");
		if(Num!=null && !Num.isEmpty()){
			try{
				Integer.parseInt(Num);
			}catch(NumberFormatException error){
				return -1;
			}
			return Integer.parseInt(Num);
		}else
			return -1;
	}
	public static float PROD_PRECIO(){
		String Num = JOptionPane.showInputDialog("Escriba el Precio:");
		if(Num!=null && !Num.isEmpty()){
			try{
				Float.parseFloat(Num);
			}catch(NumberFormatException error){
				return -1f;
			}
			return Float.parseFloat(Num);
		}else
			return -1f;
	}
	
	public static void ERROR (String Mensaje){
		JOptionPane.showMessageDialog(null, Mensaje,"Algo Fallo", JOptionPane.ERROR_MESSAGE);
	}
}

//int a = JOptionPane.showOptionDialog(null,
//			"1.-"+ A.getNombre()+"\n2.-"+B.getNombre()+"\n3.-"+C.getNombre(), "Seleccione un cliente",
//			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

//JOptionPane.showMessageDialog(null, "Error","Error", JOptionPane.WARNING_MESSAGE);

//JOptionPane.showMessageDialog(null,
//		"Nombre: "+A.getNombre() + "\nNumero de Cuenta: " + A.getNumero_Cuenta() +
//		"\nDireccion:" + A.getDireccion(),
//		"Cliente", JOptionPane.PLAIN_MESSAGE);