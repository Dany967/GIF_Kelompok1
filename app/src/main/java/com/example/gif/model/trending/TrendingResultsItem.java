package com.example.gif.model.trending;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TrendingResultsItem {


	@SerializedName("media")
	private ArrayList<MediaItem> media;

	@SerializedName("id")
	private String id;


	public void setMedia(ArrayList<MediaItem> media){
		this.media = media;
	}

	public ArrayList<MediaItem> getMedia(){
		return media;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}

