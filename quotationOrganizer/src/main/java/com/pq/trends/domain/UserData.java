package com.pq.trends.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserData {

	public UserData() {
		// TODO Auto-generated constructor stub
	}

	public UserData(List<Quotation> defaultQuotations,
			List<Quotation> favoritetQuotations, User user) {
		super();
		this.defaultQuotations = defaultQuotations;
		this.favoritetQuotations = favoritetQuotations;
		this.user = user;
	}

	private List<Quotation> defaultQuotations;
	private List<Quotation> favoritetQuotations;

	@Autowired
	private User user;

	public List<Quotation> getDefaultQuotations() {
		return defaultQuotations;
	}

	public void setDefaultQuotations(List<Quotation> defaultQuotations) {
		this.defaultQuotations = defaultQuotations;
	}

	public List<Quotation> getFavoritetQuotations() {
		return favoritetQuotations;
	}

	public void setFavoritetQuotations(List<Quotation> favoritetQuotations) {
		this.favoritetQuotations = favoritetQuotations;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
