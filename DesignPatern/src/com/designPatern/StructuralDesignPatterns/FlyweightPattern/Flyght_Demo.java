package com.designPatern.StructuralDesignPatterns.FlyweightPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.Function;

class User {
	private String fullName;

	public User(String fullName) {
		this.fullName = fullName;
	}
}

class User2 {
	static List<String> list = new ArrayList<>();
	private int names[];

	public User2(String fullName) {
		Function<String, Integer> getOrAdd = (String s) -> {
			int index = list.indexOf(s);
			if (index != -1) {
				return index;
			} else {
				list.add(s);
				return list.size() - 1;
			}
		};

		Arrays.stream(names).mapToObj(i -> list.get(i)).collect(Collectors.joining(","));
	}

}

public class Flyght_Demo {

	public static void main(String[] args) {
//		 save memory 
		User2 user = new User2("John Smith");
		User2 user2 = new User2("Jane Smith");
	}
}
