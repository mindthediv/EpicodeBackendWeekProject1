package com.Epicode;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.Epicode.MultimediaElement.mediaSet;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Ciao! Per iniziare importa 5 file su questo dispositivo.");
		System.out.println("");
		System.out.println("Per auto-importare i primi 5 file della cartella esegui -> import auto");
		System.out.println("Per importarli manualmente esegui -> import find");
		System.out.println("");
		init();
		System.out.println("");
		afterImport(multiMedia);
		System.out.println("");
	}
		
	// HANDLERS
	static public void init(){
		String inputCond =  input.nextLine() ;
		switch ( inputCond) {
			case "import find":
			System.out.println("Per importare un immagine esegui -> import image");
			System.out.println("Per importare un video esegui -> import video");
			System.out.println("Per importare un audio esegui -> import audio");
			System.out.println("");

			int i = 0;
			System.out.println("Importa il primo file");
			importFile(input.nextLine(), i); i++;
			System.out.println("Importa il secondo file");
			importFile(input.nextLine(), i); i++;
			System.out.println("Importa il terzo file");
			importFile(input.nextLine(), i); i++;
			System.out.println("Importa il quarto file");
			importFile(input.nextLine(), i); i++;
			System.out.println("Importa il quinto ed ultimo file");
			importFile(input.nextLine(), i); i++;  
			break;

			case "import auto":
			final Audio a1 = new Audio(mediaSet.AUDIO, "Freed from desire",(int) Math.floor(Math.random() * 5 + 1));
			final Video v1 = new Video(mediaSet.VIDEO, "festa da nino",(int) Math.floor(Math.random() * 5 + 1));
			final Audio a2 = new Audio(mediaSet.AUDIO, "Acqua e sale",(int) Math.floor(Math.random() * 5 + 1));
			final Video v2 = new Video(mediaSet.VIDEO, "fuochi d'artificio",(int) Math.floor(Math.random() * 5 + 1));
			final Image i1 = new Image(mediaSet.IMG, "kitten");
			multiMedia = new MultimediaElement[] {a1,v1,a2,v2,i1};
			break;	

			default:
			System.out.println("Attenzione - Errore di sintassi, riprova.");
			init();
		}
	}
	static public void afterImport(MultimediaElement[] multiMedia) {
		System.out.println("Bene! ecco i tuoi file:");
		showMultimedia(multiMedia);
		System.out.println("");
		System.out.println("Per eseguirne uno, digita il numero che lo identifica.");
		System.out.println("");
		System.out.println("Per alzare il volume di un audio o un video, digita il numero che lo identifica e subito dopo 01. Per abbassarlo 10.");
		System.out.println("Ad esempio, per abbassare il volume del primo file (audio/video) digita 110 ; per alzare quello del terzo 301.");
		System.out.println("");
		System.out.println("Per alzare la luminosità di un'immagine o un video, digita il numero che lo identifica e subito dopo 02. Per abbassarla 20.");
		System.out.println("Ad esempio, per abbassare la luminosità del terzo file (image/video) digita 320 ; per il quarto 420.");
		System.out.println("");
		System.out.println("Per visualizzare tutti i file e le relative impostazioni, digita 9");
		System.out.println("");
		System.out.println("Per uscire, digita 0");
		System.out.println("");
		
		try {
			int intSelected = input.nextInt();
			fileApplication(intSelected);
		} catch (InputMismatchException e) {
			System.out.println("Attenzione - Utilizza numeri da 0 a 5");
		}
	}	
	static public void showMultimedia(MultimediaElement[] multiMedia) {
		for(int k = 0 ; k < multiMedia.length; k++) {
			System.out.println("[" + (k+1) + "] " + multiMedia[k]);
		}
	}
	
	// PLAYER FUNCTIONS
	static public void fileApplication(int fileIndex){
		
		switch (fileIndex) {
			//ESEGUI
			case 1:
			fileDriver(1);
			fileApplication(input.nextInt());
			break;
			case 2:
			fileDriver(2);
			fileApplication(input.nextInt());
			break;
			case 3:
			fileDriver(3);
			fileApplication(input.nextInt());
			break;
			case 4:
			fileDriver(4);
			fileApplication(input.nextInt());
			break;
			case 5:
			fileDriver(5);
			fileApplication(input.nextInt());
			break;
			// ALZA-ABBASSA VOLUME
			case 101:
			volumeDriver(1,true);
			System.out.println(multiMedia[0]);
			fileApplication(input.nextInt());
			break;
			case 110:
			volumeDriver(1,false);
			System.out.println(multiMedia[0]);
			fileApplication(input.nextInt());
			break;

			case 201:
			volumeDriver(2,true);
			System.out.println(multiMedia[1]);
			fileApplication(input.nextInt());
			break;
			case 210:
			volumeDriver(2,false);
			System.out.println(multiMedia[1]);
			fileApplication(input.nextInt());
			break;
			case 301:
			volumeDriver(3,true);
			System.out.println(multiMedia[2]);
			fileApplication(input.nextInt());
			break;
			case 310:
			volumeDriver(3,false);
			System.out.println(multiMedia[2]);
			fileApplication(input.nextInt());
			break;

			case 401:
			volumeDriver(4,true);
			System.out.println(multiMedia[3]);
			fileApplication(input.nextInt());
			break;
			case 410:
			volumeDriver(4,false);
			System.out.println(multiMedia[3]);
			fileApplication(input.nextInt());
			break;

			case 501:
			volumeDriver(5,true);
			System.out.println(multiMedia[4]);
			fileApplication(input.nextInt());
			break;
			case 510:
			volumeDriver(5,false);
			System.out.println(multiMedia[4]);
			fileApplication(input.nextInt());
			break;

			// ALZA-ABBASSA LUMINOSITA'
			case 102:
			lumDriver(1,true);
			System.out.println(multiMedia[0]);
			fileApplication(input.nextInt());
			break;
			case 120:
			lumDriver(1,false);
			System.out.println(multiMedia[0]);
			fileApplication(input.nextInt());
			break;

			case 202:
			lumDriver(2,true);
			System.out.println(multiMedia[1]);
			fileApplication(input.nextInt());
			break;
			case 220:
			lumDriver(2,false);
			System.out.println(multiMedia[1]);
			fileApplication(input.nextInt());
			break;

			case 302:
			lumDriver(3,true);
			System.out.println(multiMedia[2]);
			fileApplication(input.nextInt());
			break;
			case 320:
			lumDriver(3,false);
			System.out.println(multiMedia[2]);
			fileApplication(input.nextInt());
			break;

			case 402:
			lumDriver(4,true);
			System.out.println(multiMedia[3]);
			fileApplication(input.nextInt());
			break;
			case 420:
			lumDriver(4,false);
			System.out.println(multiMedia[3]);
			fileApplication(input.nextInt());
			break;

			case 502:
			lumDriver(5,true);
			System.out.println(multiMedia[4]);
			fileApplication(input.nextInt());
			break;
			case 520:
			lumDriver(5,false);
			System.out.println(multiMedia[4]);
			fileApplication(input.nextInt());
			break;

			// TUTTI I FILE 
			case 9:
			showMultimedia(multiMedia);
			fileApplication(input.nextInt());
			break;

			//ESCI
			case 0:
			System.out.println("");
			System.out.println("Chiusura lettore multimediale");
			break;
			default:
			System.out.println("Attenzione - Errore di sintassi, riprova.");
			fileApplication(input.nextInt());
				break;
		}

	}
	static public  void fileDriver(int i) {
	if(multiMedia[i-1].mediaType == mediaSet.IMG ){
		Image img;
		img = (Image) multiMedia[i-1];
		img.show();
	} else if (multiMedia[i-1].mediaType == mediaSet.VIDEO ) {
		Video video;
		video = (Video) multiMedia[i-1];
		video.play();
	} else {
		Audio audio;
		audio = (Audio) multiMedia[i-1];
		audio.play();
	} 		
}
	static public void volumeDriver(int i, Boolean dir){
		
		if((dir == true && multiMedia[i-1].mediaType == mediaSet.AUDIO) || (dir == true && multiMedia[i-1].mediaType == mediaSet.VIDEO) ){
			ModVolume multi = (ModVolume) multiMedia[i-1];
			multi.alzaVolume();
		} else if((dir == false &&  multiMedia[i-1].mediaType == mediaSet.AUDIO) || (dir == false && multiMedia[i-1].mediaType == mediaSet.VIDEO)  ){
			ModVolume multi = (ModVolume) multiMedia[i-1];
			multi.abbassaVolume();
		}
		 else {
			System.out.println("Questo file non ha volume");
		}
	}	
	static public void lumDriver(int i, Boolean dir){
		
		if ((dir == true && multiMedia[i-1].mediaType == mediaSet.IMG) || (dir == true && multiMedia[i-1].mediaType == mediaSet.VIDEO) ) {
			ModLum multi = (ModLum) multiMedia[i-1];
			multi.alzaLum();
		} else if ((dir == false &&  multiMedia[i-1].mediaType == mediaSet.IMG) || (dir == false && multiMedia[i-1].mediaType == mediaSet.VIDEO)  ) {
			ModLum multi = (ModLum) multiMedia[i-1];
			multi.abbassaLum();
		}
		 else {
			System.out.println("Questo file non utilizza luminosità");
		}
	}	
// IMPORT FUNCTIONS
	static public MultimediaElement[] multiMedia = new MultimediaElement[5];
	private static void importFile(String inputCond, int i) {
		
		switch (inputCond) {
		case "import image": {
			final Image multi  = new Image(mediaSet.IMG);
			System.out.println("Inserisci il nome dell'immagine che vuoi importare");
			nameFile(multi, input.nextLine());
			multiMedia[i] = multi;
			
			break;
		}
		case "import video": {
			final Video multi  = new Video(mediaSet.VIDEO);
			System.out.println("Inserisci il nome del video che vuoi importare");
			nameFile(multi, input.nextLine());
			multi.setDuration( (int) Math.floor(Math.random() * 5 + 1));
			multiMedia[i] = multi;
			
			break;
		}
		case "import audio": {
			final Audio multi  = new Audio(mediaSet.AUDIO);
			System.out.println("Inserisci il nome dell'audio che vuoi importare");
			nameFile(multi, input.nextLine());
			multi.setDuration( (int) Math.floor(Math.random() * 5 + 1));
			multiMedia[i] = multi;
			
			break;
		}
		default:
			System.out.println("Attenzione - Errore di sintassi, riprova.");
			importLauncher(input ,i);
		}
	}
	private static void nameFile(MultimediaElement multi, String input) {
		multi.setTitle(input);
	}
	private static void importLauncher(Scanner input, int i) {
		importFile(input.nextLine(), i);
		}
	}

