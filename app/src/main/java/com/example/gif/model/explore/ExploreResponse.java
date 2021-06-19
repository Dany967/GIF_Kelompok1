package com.example.gif.model.explore;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class ExploreResponse {



	@SerializedName("tags")
	private ArrayList<ExploreItem> tags;


	public void setTags(ArrayList<ExploreItem> tags){
		this.tags = tags;
	}

	public ArrayList<ExploreItem> getTags(){
		return tags;
	}
}