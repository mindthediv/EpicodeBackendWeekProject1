package com.Epicode;

import com.Epicode.MultimediaElement.mediaSet;

public class Audio extends MultimediaElement implements Riproducibile{
	public int luminosita = 5 ;
	public int duration;
	public int volume = 5 ;
	
	public Audio(mediaSet mediaType) {
		super(mediaType);
	}
	
	public Audio(mediaSet mediaType, String title, int duration) {
		super(mediaType, title);
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


}
