package Evaluacion_Huallpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluacion_Huallpa {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		List<String> nombredeI = new ArrayList<>();
		List<String> apellido = new ArrayList<>();
		List<Integer> numLegajo = new ArrayList<>();

		System.out.println("¿Cuantos usuarion va a ingresar?");
		int CantUsuario = datos.nextInt();

		for (int i = 1; i <= CantUsuario; i++) {
			System.out.println("Nombre: ");
			String NombUsuario = datos.next();
			nombredeI.add(NombUsuario);

		}

		for (int i = 1; i <= CantUsuario; i++) {
			System.out.println("Apellidos: ");
			String AppeUsuario = datos.next();
			apellido.add(AppeUsuario);

		}

		for (int i = 1; i <= CantUsuario; i++) {
			System.out.println("Numero de legajo:");
			int IngreLegajo = datos.nextInt();

			while (IngreLegajo < 9999 || IngreLegajo > 100000) {

				System.out.println("El valor que ingreso no es un numero de legajo \n Porfavor ingrese el numero numero de legajo:");
				IngreLegajo = datos.nextInt();
			}
			numLegajo.add(IngreLegajo);
		}
		for (int i = 0; i < (numLegajo.size() - 1); i++) {

			for (int j = 0; j < (numLegajo.size() - i - 1); j++) {

				if (numLegajo.get(j) > numLegajo.get(j + 1)) {
					int temporal = numLegajo.get(j);
					numLegajo.set(j, numLegajo.get(j + 1));
					numLegajo.set(j + 1, temporal);

					String tempNombre = nombredeI.get(j);
					nombredeI.set(j, nombredeI.get(j + 1));
					nombredeI.set(j + 1, tempNombre);

					String tempApellido = apellido.get(j);
					apellido.set(j, apellido.get(j + 1));
					apellido.set(j + 1, tempApellido);

				}
			}
		}

		System.out.println("\nLiata ordenada:");
		for (int i = 0; i < nombredeI.size(); i++) {
			System.out.print("\n " + nombredeI.get(i) );
		}

		System.out.println("\nLiata ordenada:");
		for (int i = 0; i < nombredeI.size(); i++) {
			System.out.print("\n " + apellido.get(i) );
		}

		System.out.println("\nLiata ordenada:");
		for (int i = 0; i < nombredeI.size(); i++) {
			System.out.print("\n " + numLegajo.get(i) );
		}

			System.out.println("\n Ingrese un numero de legajo a buscar: ");
			int L_buscado = datos.nextInt();

			for (int i = 0; i < numLegajo.size(); i++) {
				if (L_buscado == numLegajo.get(i)) {
					System.out.println("El numero de legajo " + L_buscado + " pertenece a: " + nombredeI.get(i) + " " + apellido.get(i));
				}		
			   
				else  {
					System.out.println("El numero de legajo no existe");
				}
				}
			System.out.println("Programa finalizado");

	}
}
