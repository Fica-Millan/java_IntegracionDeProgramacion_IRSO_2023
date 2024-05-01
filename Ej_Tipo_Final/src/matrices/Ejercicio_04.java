/*Crear matriz en POO. Almacenar artículos de ferretería cuyos campos son: código, tipo, cantidad, costo, peso. Usar encapsulamiento para la carga de datos. Estandarizar.*/

package matrices;

import java.util.Scanner;

public class Ejercicio_04 {

	private int codigo;
	private String tipo;
	private int cantidad;
	private double costo;
	private double peso;

	// Constructor para inicializar un artiulo de ferreteria
	public Ejercicio_04(int codigo, String tipo, int cantidad, double costo, double peso) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.costo = costo;
		this.peso = peso;
	}

	// Método para mostrar la información del artículo
	public void mostrarInformacion() {
		System.out.println("Codigo: " + codigo);
		System.out.println("Tipo: " + tipo);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Costo: " + costo);
		System.out.println("Peso: " + peso);
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		// Crear una matriz para almacenar artículos de ferreteria
		Ejercicio_04[][] inventario = new Ejercicio_04[2][2];

		// Cargar datos utilizando encapsulamiento
		cargarDatos(inventario);

		// Mostrar la información de los articulos
		mostrarInventario(inventario);
	}

	// Método para cargar datos en la matriz utilizando encapsulamiento
	public static void cargarDatos(Ejercicio_04[][] inventario) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < inventario.length; i++) {
			for (int j = 0; j < inventario[i].length; j++) {
				System.out.println("Ingrese datos p/el art en posicion [" + i + "][" + j + "]");
				System.out.print("Codigo: ");
				int codigo = scanner.nextInt();
				scanner.nextLine(); // Consumir el salto de línea después de nextInt()

				System.out.print("Tipo: ");
				String tipo = scanner.nextLine();

				System.out.print("Cantidad: ");
				int cantidad = scanner.nextInt();
				scanner.nextLine(); // Consumir el salto de línea después de nextInt()

				System.out.print("Costo: ");
				double costo = scanner.nextDouble();
				scanner.nextLine(); // Consumir el salto de línea después de nextDouble()

				System.out.print("Peso: ");
				double peso = scanner.nextDouble();
				scanner.nextLine(); // Consumir el salto de línea después de nextDouble()

				// Crear el objeto Ejercicio_04 y almacenarlo en la matriz
				inventario[i][j] = new Ejercicio_04(codigo, tipo, cantidad, costo, peso);
			}
		}

		// Cerrar el scanner al finalizar la entrada de datos
		scanner.close();
	}

	// Método para mostrar la informacion de los articulos en la matriz
	public static void mostrarInventario(Ejercicio_04[][] inventario) {
		System.out.println("\nInventario de Ferreteria:\n");
		for (int i = 0; i < inventario.length; i++) {
			for (int j = 0; j < inventario[i].length; j++) {
				inventario[i][j].mostrarInformacion();
			}
		}
	}
}

