// Desarrollar el código para lograr incrementar una variable desde el 1 hasta al 199 con lo visto en la clase anterior. 
// Durante cada ciclo, multiplicar el valor del índice por sí mismo e imprimir el resultado total en pantalla al finalizar. 
// Utilizar variables enteras.

package clase3.ej1;

//PUBLIC CLASS INCREMENTOVARIABLE: DEFINE UNA CLASE LLAMADA INCREMENTOVARIABLE. LAS CLASES EN JAVA SON BLOQUES DE CÓDIGO QUE PUEDEN CONTENER VARIABLES Y MÉTODOS.
public class IncrementoVariable {
	
	//PUBLIC STATIC VOID MAIN(STRING[] ARGS): MÉTODO PRINCIPAL QUE 	SE EJECUTA CUANDO EL PROGRAMA COMIENZA. EN JAVA, EL PROGRAMA 	COMIENZA A EJECUTARSE DESDE EL MÉTODO MAIN. PUBLIC STATIC VOID 	SIGNIFICA QUE ESTE MÉTODO ES PÚBLICO, ESTÁTICO (PERTENECIENTE A 	LA CLASE EN LUGAR DE A INSTANCIAS ESPECÍFICAS) Y NO DEVUELVE 	NINGÚN VALOR.
	public static void main(String[] args) {
		// INT RESULTADO = 0;: DECLARA UNA VARIABLE LLAMADA 		RESULTADO E INICIALIZA SU VALOR EN 0. ESTA VARIABLE SE 		UTILIZARÁ PARA ALMACENAR EL RESULTADO DEL CÁLCULO.
		int resultado=0;
		
		//FOR (INT I = 1; I < 200; I++): INICIA UN BUCLE FOR QUE 		COMIENZA CON I IGUAL A 1 Y CONTINÚA MIENTRAS I SEA MENOR 		QUE 200. EN CADA ITERACIÓN DEL BUCLE, I SE INCREMENTA EN 1.
		for (int i=1; i<200; i++) {
			//RESULTADO = I * I;: DENTRO DEL BUCLE, CALCULA EL 			CUADRADO DE I (MULTIPLICA I POR SÍ MISMO) Y ALMACENA EL 			RESULTADO EN LA VARIABLE RESULTADO. SIN EMBARGO, ESTE 			CÓDIGO SOBRESCRIBE EL VALOR DE RESULTADO EN CADA 			ITERACIÓN, POR LO QUE SOLO ALMACENARÁ EL CUADRADO DEL 			ÚLTIMO NÚMERO (199 * 199).
			resultado = i*i;
	    }
		//SYSTEM.OUT.PRINTLN(RESULTADO);: DESPUÉS DE QUE EL BUCLE 		TERMINA, IMPRIME EL VALOR FINAL DE RESULTADO (EL CUADRADO 		DEL ÚLTIMO NÚMERO) EN LA CONSOLA.
		System.out.println(resultado);
    }
}