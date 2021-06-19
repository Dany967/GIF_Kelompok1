package com.example.gif.model.trending;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TrendingDiscoveryResponse{

	@SerializedName("results")
	private ArrayList<TrendingResultsItem> results;

	public void setResults(ArrayList<TrendingResultsItem> results){
		this.results = results;
	}

	public ArrayList<TrendingResultsItem> getResults(){
		return results;
	}
}