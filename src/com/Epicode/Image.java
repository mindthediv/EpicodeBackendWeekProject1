package com.Epicode;

public class Image extends MultimediaElement implements ModLum {
	public int luminosita = 5 ;
	
	public Image(mediaSet mediaType, String title) {
		super(mediaType, title + ".jpg");
	}
	public Image(mediaSet mediaType) {
		super(mediaType);
	}
	public void show(){
		System.out.print(this.title + " ");
		for(int k = 0; k<this.luminosita; k++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	@Override
	public void alzaLum() {
		if(this.luminosita == 10){
			System.out.println("Luminosità al massimo");
		} else{
			this.luminosita = luminosita + 1;
		}
	}

	@Override
	public void abbassaLum() {
		if(this.luminosita == 0){
			System.out.println("Luminosità al minimo");
		} else{
			this.luminosita = luminosita - 1;
		}
	}

	@Override
	public String toString() {
		return this.mediaType + " name: " + this.title + " brightness: " + this.luminosita ;
	}

}
