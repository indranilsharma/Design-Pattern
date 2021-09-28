package com.designPatern.CreationalDesignPatterns.PrototypePattern;



import org.apache.commons.lang3.SerializationUtils;
import java.io.Serializable;

class Ipl implements Serializable{
	
	String name, city;

	public Ipl(String name, String city) {
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Ipl [name=" + name + ", city=" + city + "]";
	}
}

public class D_Serializable {
	public static void main(String[] args) {
		Ipl kolkata = new Ipl("KKR","Kolkata");
	
//		apcahe commons 
//		Ipl mumbai = SerializationUtils.roundtrip(kolkata);
//		mumbai.name = "Mumbai";
//		System.out.println(kolkata);
//		System.out.println(mumbai);
		
	}
}