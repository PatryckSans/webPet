package webPet;

import java.util.ArrayList;
import java.util.Scanner;

import webPet.Pet;

public class runPet {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> personalidades1 = new ArrayList<String>();

		Pet pet1 = new Pet("Molde", "Preto", 1, "Gato", personalidades1);

		System.out.println("\nQual sera o nome do seu Pet?: ");
		pet1.setNome(ler.next());

		System.out.println("\nSeu Pet sera um Gato ou um Cachorro?: ");
		pet1.setEspecie(ler.next());

		System.out.println("\nQual sera a cor de seu Pet?: ");
		pet1.setCor(ler.next());

		System.out.println("\nQual sera a idade de seu Pet?: ");
		pet1.setIdade(ler.nextInt());

	pet1.apresentacaoDoPet();
	
	}
}
