package ejercicio_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ejercicio5 {

	public static void main(String[] args) {

		ArrayList<String> listDias = new ArrayList<String>();

		listDias.add("Lunes");
		listDias.add("Martes");
		listDias.add("Miércoles");
		listDias.add("Jueves");
		listDias.add("Viernes");
		listDias.add("Sábado");
		listDias.add("Domingo");

		// Inserta en la posición 4 el elemento "Juernes"
		listDias.add(4, "Juernes");

		// Copia esa lista a otra llamada listaDos.
		ArrayList<String> listaDos = (ArrayList<String>) listDias.clone();
		System.out.println("Print de la listaDos:");
		for (String str : listaDos) {
			System.out.println("\t" + str);
		}

		// Imprime posición 3 y 4
		System.out.println("\nPosiciones 3 y 4");
		System.out.println("\t" + listDias.get(3) + ", " + listDias.get(4) + "\n");

		// Muestra el primer elemento y el último.
		System.out.println("Primer y último elementos");
		System.out.println("\t" + listDias.get(0) + ", " + listDias.get(listDias.size() - 1) + "\n");

		// Elimina el elemento que contenga «Juernes» de la lista y comprueba si se
		// elimina algo o no.
		Iterator<String> i = listDias.iterator();
		i = listDias.iterator();
		int numElementos = listDias.size();
		System.out.println("Hay " + numElementos + " elementos en la lista antes de borrar\n");

		while (i.hasNext()) {
			String elementoB = i.next();
			if (elementoB.equals("Juernes"))
				i.remove();
		}
		System.out.println("\tBorramos 'Juernes'\n");

		numElementos = listDias.size();
		System.out.println("Hay " + numElementos + " elementos en la lista después de borrar\n");

		// Crea un iterador y muestra uno a uno los valores de la lista original.
		i = listDias.iterator();
		while (i.hasNext()) {
			String elementoA = i.next();
			System.out.print(elementoA + " / ");
		}
		System.out.println("");

		// Busca si existe en la lista un elemento que se denomine “Lunes” exactamente.
		System.out.println("\nSaber si existe el elemento 'Lunes'\n");
		if (listDias.contains("Lunes")) {
			System.out.println("\tExiste el elemento");
		} else
			System.out.println("\tNo existe el elemento");

		// Busca si existe en la lista un elemento que se denomine “Lunes”. No importa
		// si está en mayúsculas o minúsculas.
		System.out.println("\nSaber si existe el elemento 'Lunes' ignorando mayúsculas y minúsculas\n");
		if (containsIgnoreCase("lunes", listDias)) {
			System.out.println("\tExiste el elemento");
		} else
			System.out.println("\tNo existe el elemento");

		// Ordena la lista y muestra su contenido.
		System.out.println("\nLista ordenada alfabéticamente:\n");
		Collections.sort(listDias);
		for (String temp : listDias) {
			System.out.println("\t" + temp);
		}

		// Borra todos los elementos de la lista.
		listDias.clear();
		System.out.println("\nBorramos la lista y comprobamos que no queda nada");
		if (listDias.isEmpty()) {
			System.out.println("\tLa lista está vacía");
		} else
			System.out.println("\tLa lista no esta vacía");
	}

	// Método para ignorar mayúsculas y minúsculas
	public static boolean containsIgnoreCase(String str, ArrayList<String> list) {
		for (String i : list) {
			if (i.equalsIgnoreCase(str))
				return true;
		}
		return false;
	}

}
