package com.example.gif.model.trending;

import com.google.gson.annotations.SerializedName;

public class MediaItem{

	@SerializedName("gif")
	private Gif gif;


	public void setGif(Gif gif){
		this.gif = gif;
	}

	public Gif getGif(){
		return gif;
	}
}