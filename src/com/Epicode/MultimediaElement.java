package com.Epicode;



public class MultimediaElement implements Modulabile{
	
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
	public void aumentaVal(int val) {
		val = val + 1;
	}
	@Override
	public void diminusiciVal(int val) {
		val = val - 1;
	}
	
	
}
