/*Cargar un MATRIZ 12X12, cargar valores, sumar pares y restar impares. Usar POO, imprimir valor. */

package matrices;

import java.util.Random;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// Crear una matriz 12x12 y cargar valores aleatorios
		int[][] matriz = new int[12][12];
		cargarValoresAleatorios(matriz);

		// Realizar operaciones y mostrar el resultado
		System.out.println("Matriz original:");
		mostrarMatriz(matriz);

		operarMatriz(matriz);

		System.out.println("\nMatriz despues de operaciones:");
		mostrarMatriz(matriz);
	}

	// Método para cargar valores aleatorios en la matriz
	public static void cargarValoresAleatorios(int[][] matriz) {
		Random random = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(100); // Números aleatorios hasta 99
			}
		}
	}

	// Método para realizar operaciones en la matriz (sumar pares, restar impares)
	public static void operarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					// Sumar pares
					matriz[i][j] += 2;
				} else {
					// Restar impares
					matriz[i][j] -= 1;
				}
			}
		}
	}

	// Método para mostrar la matriz en la consola
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}