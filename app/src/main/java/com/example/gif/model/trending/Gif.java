package com.example.gif.model.trending;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Gif{



	@SerializedName("url")
	private String url;

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}