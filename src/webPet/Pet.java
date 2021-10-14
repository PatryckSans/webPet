package webPet;

import java.util.ArrayList;
import java.util.Scanner;

public class Pet {
	String nome;
	String cor;
	int idade;
	String especie;
	ArrayList<String> personalidades;

	public Pet(String n, String c, int i, String e, ArrayList<String> p) {
		System.out.println("VAMOS CRIAR SEU PET!!!");
		this.nome = n;
		this.cor = c;
		this.idade = i;
		this.especie = e;
		this.personalidades = p;
	}

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	public int getIdade() {
		return idade;
	}

	public String getEspecie() {
		return especie;
	}

	public String getBarulho() {
		if (getEspecie().equals("Gato")) {
			return "Purr... Purr... Purr...";
		}
		else {
			return "Woof... Woof... Woof...";
		}
	}
	
	public ArrayList<String> getPersonalidades() {
		return personalidades;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setPersonalidades(ArrayList<String> personalidades) {
		this.personalidades = personalidades;
	}

	public void apresentacaoDoPet() {
		if (getEspecie().equals("Gato")) {
			System.out.println("\n░░░░░░░░░░░░░░░░░░░░░▄▀░░▌\n" + 
					"░░░░░░░░░░░░░░░░░░░▄▀▐░░░▌\n" + 
					"░░░░░░░░░░░░░░░░▄▀▀▒▐▒░░░▌\n" + 
					"░░░░░▄▀▀▄░░░▄▄▀▀▒▒▒▒▌▒▒░░▌\n" + 
					"░░░░▐▒░░░▀▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒█\n" + 
					"░░░░▌▒░░░░▒▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄\n" + 
					"░░░░▐▒░░░░░▒▒▒▒▒▒▒▒▒▌▒▐▒▒▒▒▒▀▄\n" + 
					"░░░░▌▀▄░░▒▒▒▒▒▒▒▒▐▒▒▒▌▒▌▒▄▄▒▒▐\n" + 
					"░░░▌▌▒▒▀▒▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒█▄█▌▒▒▌\n" + 
					"░▄▀▒▐▒▒▒▒▒▒▒▒▒▒▒▄▀█▌▒▒▒▒▒▀▀▒▒▐░░░▄\n" + 
					"▀▒▒▒▒▌▒▒▒▒▒▒▒▄▒▐███▌▄▒▒▒▒▒▒▒▄▀▀▀▀\n" + 
					"▒▒▒▒▒▐▒▒▒▒▒▄▀▒▒▒▀▀▀▒▒▒▒▄█▀░░▒▌▀▀▄▄\n" + 
					"▒▒▒▒▒▒█▒▄▄▀▒▒▒▒▒▒▒▒▒▒▒░░▐▒▀▄▀▄░░░░▀\n" + 
					"▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▄▒▒▒▒▄▀▒▒▒▌░░▀▄\n" + 
					"▒▒▒▒▒▒▒▒▀▄▒▒▒▒▒▒▒▒▀▀▀▀▒▒▒▄▀");
		}

		
		
		else {
				System.out.println("\n░░░░░░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░░░░░░░░\n" + 
						"░░░░░▄▄▄▄█▀▀▀░░░░░░░░░░░░▀▀██░░░░░░░░░░\n" + 
						"░░▄███▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▄▄▄░░░░░░\n" + 
						"▄▀▀░█░░░░▀█▄▀▄▀██████░▀█▄▀▄▀████▀░░░░░░\n" + 
						"█░░░█░░░░░░▀█▄█▄███▀░░░░▀▀▀▀▀▀▀░▀▀▄░░░░\n" + 
						"█░░░█░▄▄▄░░░░░░░░░░░░░░░░░░░░░▀▀░░░█░░░\n" + 
						"█░░░▀█░░█░░░░▄░░░░▄░░░░░▀███▀░░░░░░░█░░\n" + 
						"█░░░░█░░▀▄░░░░░░▄░░░░░░░░░█░░░░░░░░█▀▄░\n" + 
						"░▀▄▄▀░░░░░▀▀▄▄▄░░░░░░░▄▄▄▀░▀▄▄▄▄▄▀▀░░█░\n" + 
						"░█▄░░░░░░░░░░░░▀▀▀▀▀▀▀░░░░░░░░░░░░░░█░░\n" + 
						"░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄██░░░\n" + 
						"░░▀█▄░░░░░░░░░░░░░░░░░░░░░░░░░▄▀▀░░░▀█░");
		}
		
		System.out.println( getBarulho() + "\nOiii! meu me chamo " + getNome() + " Prazer!!!"
				+ "\nEu sou um " + getEspecie() + " virtual mas eu ja tenho " + getIdade() + " aninhos"
				+ "\nMeus pelos são " + getCor() + " e são bem macios e fofinhos");
		
	}

}
