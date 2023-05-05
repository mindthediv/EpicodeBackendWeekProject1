package com.Epicode;

public class Image extends MultimediaElement {
	public int luminosita = 5 ;
	
	public Image(mediaSet mediaType, String title) {
		super(mediaType, title);
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

}
