package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

interface C_GPay {

	public String getCreditCardNo();

	public void setCreditCardNo(String creditCardNo);

	public String getCustomerName();

	public void setCustomerName(String customerName);

	public String getCardExpMonth();

	public void setCardExpMonth(String cardExpMonth);

	public String getCardExpYear();

	public void setCardExpYear(String cardExpYear);

	public Short getCardCVVNo();

	public void setCardCVVNo(Short cardCVVNo);

	public Double getAmount();

	public void setAmount(Double amount);

}
