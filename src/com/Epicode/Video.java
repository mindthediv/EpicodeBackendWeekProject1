package com.Epicode;

import com.Epicode.MultimediaElement.mediaSet;

public class Video extends MultimediaElement implements Riproducibile{
	public int luminosita = 5 ;
	public int volume = 5;
	public int duration = 0;
	
	public Video(mediaSet mediaType) {
		super(mediaType);
	}
	
	public Video(mediaSet mediaType, String title, int duration) {
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
			System.out.print(" ");
			for(int k = 0; k<this.luminosita; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
