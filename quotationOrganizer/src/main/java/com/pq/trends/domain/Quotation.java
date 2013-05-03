package com.pq.trends.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Quotation")
public class Quotation {

	public Quotation() {
		// TODO Auto-generated constructor stub
	}

	public Quotation(long id, String author, String quotation, int type,
			List<String> tags, List<String> category) {
		super();
		this.id = id;
		this.author = author;
		this.quotation = quotation;
		this.type = type;
		this.tags = tags;
		this.category = category;
	}

	@Id
	private long id;

	private String author;

	private String quotation;

	private int type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getQuotation() {
		return quotation;
	}

	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	private List<String> tags;

	// predefined categories
	private List<String> category;

}
