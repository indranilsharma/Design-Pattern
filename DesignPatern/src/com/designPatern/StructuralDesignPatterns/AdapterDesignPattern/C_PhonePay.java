package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

interface C_PhonePay {

	public String getCustCardNo();

	public void setCustCardNo(String custCardNo);

	public String getCardOwnerName();

	public void setCardOwnerName(String cardOwnerName);

	public String getCardExpMonthDate();

	public void setCardExpMonthDate(String cardExpMonthDate);

	public Integer getCVVNo();

	public void setCVVNo(Integer cVVNo);

	public Double getTotalAmount();

	public void setTotalAmount(Double totalAmount);

}
