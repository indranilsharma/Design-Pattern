package com.designPatern.StructuralDesignPatterns.AdapterDesignPattern;

public class C_TestAdapterExample {

	public static void main(String[] args) {
		C_GPay gpay = new C_GPay_Impl();

		gpay.setCreditCardNo("4789565874102365");
		gpay.setCustomerName("Max Warner");
		gpay.setCardExpMonth("09");
		gpay.setCardExpYear("25");
		gpay.setCardCVVNo((short) 235);
		gpay.setAmount(2565.23);

		C_GPay_To_PhonePay_Adapter phonepay = new C_GPay_To_PhonePay_Adapter(gpay);
		testPayD(phonepay);
	}

	private static void testPayD(C_PhonePay phonepay) {

		System.out.println(phonepay.getCardOwnerName());
		System.out.println(phonepay.getCustCardNo());
		System.out.println(phonepay.getCardExpMonthDate());
		System.out.println(phonepay.getCVVNo());
		System.out.println(phonepay.getTotalAmount());
	}

}
