package com.Epicode;

import com.Epicode.MultimediaElement.mediaSet;

public class Audio extends MultimediaElement implements Riproducibile, ModVolume{
	public int luminosita = 5 ;
	public int duration;
	public int volume = 5 ;
	
	public Audio(mediaSet mediaType) {
		super(mediaType);
	}
	
	public Audio(mediaSet mediaType, String title, int duration) {
		super(mediaType, title + ".mp3");
		this.duration = duration ;
	} 
	
	public void setDuration(int newD) {
		this.duration = newD;
	};
	public int getDuration() {
		return this.duration;
				}
	
	@Override
	public void play() {
		for(int i=0;i<duration;i++) {
			System.out.print(title+" ");
			for(int k = 0; k<this.volume; k++) {
				System.out.print("!");
				}
			System.out.println("");
		}
	}

	@Override
	public void alzaVolume() {
		if(this.volume == 10){
			System.out.println("Volume al massimo");
		} else{
			this.volume = volume + 1;
		}
	}

	@Override
	public void abbassaVolume() {
		if(this.volume == 0){
			System.out.println("Volume al minimo");
		} else{
			this.volume = volume - 1;
		}
	}

	@Override
	public String toString() {
		return this.mediaType + " name: " + this.title + " volume: " + this.volume ;
	}


}
