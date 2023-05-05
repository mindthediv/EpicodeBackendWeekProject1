package com.Epicode;

import java.util.Scanner;

import com.Epicode.MultimediaElement.mediaSet;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ciao! Per iniziare importa 5 file su questo dispositivo.");
		System.out.println("Per importare un immagine esegui -> import image'");
		System.out.println("Per importare un video esegui -> import video'");
		System.out.println("Per importare un audio esegui -> import audio'");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Importa il primo file");
		importFile(input.nextLine());
		System.out.println("Importa il secondo file");
		importFile(input.nextLine());
		System.out.println("Importa il terzo file");
		importFile(input.nextLine());
		System.out.println("Importa il quarto file");
		importFile(input.nextLine());
		System.out.println("Importa il quinto ed ultimo file");
		importFile(input.nextLine()); 
		
		/*Hardcodato le cose funzionano, ma lo Scanner 
		 * è problematico e non mi permette di andare avanti, cioè dare all'utente
		 * il comando per eseguire poi i metodi show() e play(),
		 *  e le regolazioni di luminosità e volume. */
		
		}

	private static void importFile(String input) {
		switch (input) {
		case "import image": {
			final Image multi  = new Image(mediaSet.IMG);
			System.out.println("Adesso digita il nome dell'immagine che vuoi importare ed è fatta!");
			Scanner inputTitle = new Scanner(System.in);
			nameFile(multi, inputTitle.nextLine());
			inputTitle.close();
			break;
		}
		case "import video": {
			final Video multi  = new Video(mediaSet.VIDEO);
			System.out.println("Adesso digita il nome del video che vuoi importare ed è fatta!");
			Scanner inputTitle = new Scanner(System.in);
			nameFile(multi, inputTitle.nextLine());
			inputTitle.close();
			multi.setDuration( (int) Math.floor(Math.random() * 5));
			break;
		}
		case "import audio": {
			final Audio multi  = new Audio(mediaSet.AUDIO);
			System.out.println("Adesso digita il nome dell'audio che vuoi importare ed è fatta!");
			Scanner inputTitle = new Scanner(System.in);
			nameFile(multi, inputTitle.nextLine());
			inputTitle.close();
			
			break;
		}
		default:
			System.out.println("Attenzione - Errore di sintassi, riprova.");
			Scanner newScan = new Scanner(System.in);
			importLauncher(newScan);
		}
	}
	
	private static void nameFile(MultimediaElement multi, String input) {
		multi.setTitle(input);
	}
	private static void importLauncher(Scanner input) {
		while(input.hasNextLine()) {
		importFile(input.nextLine());}
		
	}
	

}
