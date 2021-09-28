package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class C_GPay_To_PhonePay_Adapter implements C_PhonePay {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;

	private final C_GPay GPAY;

	public C_GPay_To_PhonePay_Adapter(C_GPay GPAY) {
		this.GPAY = GPAY;
		setProp();
	}

	private void setProp() {
		setCardOwnerName(this.GPAY.getCustomerName());
		setCustCardNo(this.GPAY.getCreditCardNo());
//		here we combine two method of GPAY ..because PhonePay interface mismatch 
		setCardExpMonthDate(this.GPAY.getCardExpMonth() + "/" + this.GPAY.getCardExpYear());
		setCVVNo(this.GPAY.getCardCVVNo().intValue());
		setTotalAmount(this.GPAY.getAmount());
	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
