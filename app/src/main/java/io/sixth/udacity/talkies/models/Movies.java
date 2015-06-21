package io.sixth.udacity.talkies.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movies {

	@Expose
	private int page;
	
	@Expose
	private List<Movie> results = new ArrayList<Movie>();
	
	@SerializedName("total_pages")
	@Expose
	private int totalPages;
	
	@SerializedName("total_results")
	@Expose
	private int totalResults;

	/**
	*
	* @return
	* The page
	*/
	public int getPage() {
		return page;
	}

	/**
	*
	* @return
	* The results
	*/
	public List<Movie> getResults() {
		return results;
	}

	/**
	*
	* @return
	* The totalPages
	*/
	public int getTotalPages() {
		return totalPages;
	}

	/**
	*
	* @return
	* The totalResults
	*/
	public int getTotalResults() {
		return totalResults;
	}
}
