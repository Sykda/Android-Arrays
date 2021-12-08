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
		listDias.add("Mi�rcoles");
		listDias.add("Jueves");
		listDias.add("Viernes");
		listDias.add("S�bado");
		listDias.add("Domingo");

		// Inserta en la posici�n 4 el elemento "Juernes"
		listDias.add(4, "Juernes");

		// Copia esa lista a otra llamada listaDos.
		ArrayList<String> listaDos = (ArrayList<String>) listDias.clone();
		System.out.println("Print de la listaDos:");
		for (String str : listaDos) {
			System.out.println("\t" + str);
		}

		// Imprime posici�n 3 y 4
		System.out.println("\nPosiciones 3 y 4");
		System.out.println("\t" + listDias.get(3) + ", " + listDias.get(4) + "\n");

		// Muestra el primer elemento y el �ltimo.
		System.out.println("Primer y �ltimo elementos");
		System.out.println("\t" + listDias.get(0) + ", " + listDias.get(listDias.size() - 1) + "\n");

		// Elimina el elemento que contenga �Juernes� de la lista y comprueba si se
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
		System.out.println("Hay " + numElementos + " elementos en la lista despu�s de borrar\n");

		// Crea un iterador y muestra uno a uno los valores de la lista original.
		i = listDias.iterator();
		while (i.hasNext()) {
			String elementoA = i.next();
			System.out.print(elementoA + " / ");
		}
		System.out.println("");

		// Busca si existe en la lista un elemento que se denomine �Lunes� exactamente.
		System.out.println("\nSaber si existe el elemento 'Lunes'\n");
		if (listDias.contains("Lunes")) {
			System.out.println("\tExiste el elemento");
		} else
			System.out.println("\tNo existe el elemento");

		// Busca si existe en la lista un elemento que se denomine �Lunes�. No importa
		// si est� en may�sculas o min�sculas.
		System.out.println("\nSaber si existe el elemento 'Lunes' ignorando may�sculas y min�sculas\n");
		if (containsIgnoreCase("lunes", listDias)) {
			System.out.println("\tExiste el elemento");
		} else
			System.out.println("\tNo existe el elemento");

		// Ordena la lista y muestra su contenido.
		System.out.println("\nLista ordenada alfab�ticamente:\n");
		Collections.sort(listDias);
		for (String temp : listDias) {
			System.out.println("\t" + temp);
		}

		// Borra todos los elementos de la lista.
		listDias.clear();
		System.out.println("\nBorramos la lista y comprobamos que no queda nada");
		if (listDias.isEmpty()) {
			System.out.println("\tLa lista est� vac�a");
		} else
			System.out.println("\tLa lista no esta vac�a");
	}

	// M�todo para ignorar may�sculas y min�sculas
	public static boolean containsIgnoreCase(String str, ArrayList<String> list) {
		for (String i : list) {
			if (i.equalsIgnoreCase(str))
				return true;
		}
		return false;
	}

}
