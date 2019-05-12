Practica 4 "Carro de Compras"

Precargar en la clase principal un catalogo (ArrayList <Producto>) Precargado con 10 productos,
con existencias aleatorias entre 5-20.
Ademas se debe tener 3 carros de compras.

Menu Principal
	1.- Administrador
	2.- Cliente
	3.- Salir

Submenu Administrador
	1.1 Dar de alta un Producto
	1.2 Dar de baja un Producto
	1.3 Seleccionar un Producto del Catalogo

Submenu Producto
	Info del producto
	1.3.1 Modificar
		1.3.1.1 Existencia
		1.3.1.2 Precio
		1.3.1.3 Regresar
	1.3.2 Regresar
	
Submeno Cliente
	Seleccionar carro
		2.1 -nombre carro 1- (Cantidas de Items)
		2.2 -nombre carro 2- (Cantidas de Items)
		2.3 -nombre carro 3- (Cantidas de Items)
		
Submeno del Carro
	2.X.1 Agregar Item
		*Mostras catalogo
		*Cantidad
	2.X.2 Seleccionar Item
		2.X.2.1 Quitar del Carro
		2.X.2.2 Cambiar Cantidad
			*Verificar Existencia
		2.X.2.3 Regresar
	2.X.3 Vaciar Carro
	2.X.4 Checout (no carros vacios) [Imprimir un ticket]
	2.X.5 Regresar
	
	
	
Clase Carro
	Nombre
	id
	Lista de Items (empieza en 0)
		Producto y cantidad que tiene el carro
	Acceso al catalogo
	
	| ^
	V |
Clase Item
	*catalogo
	Lista de Productos (IDs)
	Cantidades 
	Evaluamos existencia
	
	|
	V
Clase Producto
	Nombre
	ID
	Precio
	
Clase Ventana
	Joptionpane para todas las opciones
	 Erro ("que error");
	 int Optiones (Arreglo de Strings)
clase Main
	Menus
	todos los objetos
	Lista de Carritos (ID's)
	