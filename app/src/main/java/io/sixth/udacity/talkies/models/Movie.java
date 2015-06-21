package io.sixth.udacity.talkies.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {

	@Expose
	private boolean adult;
	
	@SerializedName("backdrop_path")
	@Expose
	private String backdropPath;
	
	@SerializedName("genre_ids")
	@Expose
	private List<Integer> genreIds = new ArrayList<Integer>();
	@Expose
	private int id;
	
	@SerializedName("original_language")
	@Expose
	private String originalLanguage;
	
	@SerializedName("original_title")
	@Expose
	private String originalTitle;
	@Expose
	private String overview;
	
	@SerializedName("release_date")
	@Expose
	private String releaseDate;
	
	@SerializedName("poster_path")
	@Expose
	private String posterPath;
	@Expose
	private double popularity;
	@Expose
	private String title;
	@Expose
	private boolean video;
	
	@SerializedName("vote_average")
	@Expose
	private double voteAverage;
	
	@SerializedName("vote_count")
	@Expose
	private int voteCount;

	/**
	*
	* @return
	* The adult
	*/
	public boolean isAdult() {
		return adult;
	}

	/**
	*
	* @return
	* The backdropPath
	*/
	public String getBackdropPath() {
		return backdropPath;
	}

	/**
	*
	* @return
	* The genreIds
	*/
	public List<Integer> getGenreIds() {
		return genreIds;
	}

	/**
	*
	* @return
	* The id
	*/
	public int getId() {
		return id;
	}

	/**
	*
	* @return
	* The originalLanguage
	*/
	public String getOriginalLanguage() {
		return originalLanguage;
	}

	/**
	*
	* @return
	* The originalTitle
	*/
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	*
	* @return
	* The overview
	*/
	public String getOverview() {
		return overview;
	}

	/**
	*
	* @return
	* The releaseDate
	*/
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	*
	* @return
	* The posterPath
	*/
	public String getPosterPath() {
		return posterPath;
	}

	/**
	*
	* @return
	* The popularity
	*/
	public double getPopularity() {
		return popularity;
	}

	/**
	*
	* @return
	* The title
	*/
	public String getTitle() {
		return title;
	}

	/**
	*
	* @return
	* The video
	*/
	public boolean isVideo() {
		return video;
	}

	/**
	*
	* @return
	* The voteAverage
	*/
	public double getVoteAverage() {
		return voteAverage;
	}

	/**
	*
	* @return
	* The voteCount
	*/
	public int getVoteCount() {
		return voteCount;
	}
}
