package com.Epicode;
public class MultimediaElement {
	
	public mediaSet mediaType;
	public String title;
	
	public enum mediaSet {IMG,AUDIO,VIDEO};
	
	public MultimediaElement(mediaSet mediaType) {
		this.mediaType = mediaType;
	}
	public MultimediaElement(mediaSet mediaType, String title) {
		this.mediaType = mediaType;
		this.title = title;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	};
	public String getTitle() {
		return this.title;
				}
	
	@Override
	public String toString() {
		return this.mediaType + " name: " + this.title ;
	}
	
	
}
