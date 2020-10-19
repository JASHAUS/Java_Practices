package com.main;

public class MemberShipCard extends Card {
	
	private Integer rating;

	
	 public MemberShipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	

	public Integer getRating() {
		return rating;
	}

//	public void setRating(Integer rating) {
//		this.rating = rating;
//	}

	
	

}
