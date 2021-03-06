package com.designPatern.SOLID_Princliple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {
	private final List<String> entries = new ArrayList<>();
	private static int count = 0;

	public void addEntry(String text) {
		entries.add("" + (++count) + ":" + text);
	}

	public void removeEntry(int indext) {
		entries.remove(indext);
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	
//	 here we break Single responsibility  
	public void saveToThefileName(Journal j, String fileName, Boolean override) throws FileNotFoundException {
		if (override || new File(fileName).exists()) {
			@SuppressWarnings("resource")
			PrintStream p = new PrintStream(fileName);
			p.println(j.toString());
		}
	}

	public void load(Journal j, String fileName) {
	}

	public void load(Journal j, URL url) {
	}
}

class Persists {
	public void saveToThefileName(Journal j, String fileName, Boolean override) throws FileNotFoundException {
		if (override || new File(fileName).exists()) {
			@SuppressWarnings("resource")
			PrintStream p = new PrintStream(fileName);
			p.println(j.toString());
		}
	}

	public void load(Journal j, String fileName) {
	}

	public void load(Journal j, URL url) {
	}
}

public class Single_Responsibility_Principle_Demo {

	public static void main(String[] args) throws IOException {
		Journal j = new Journal();
		j.addEntry("Solid principle");
		j.addEntry("java.lang.package");
		j.addEntry("Design pattern");
		System.out.println(j);

		Persists p = new Persists();
		String fileName = "E:\\codeBaseAll\\CoreJava\\Disign-Patern-WS\\DesignPatern\\src\\com\\designPatern\\SOLID_Princliple\\Journal.txt";
		p.saveToThefileName(j, fileName, true);

//		 it will open a Notepad file in java
	    Runtime.getRuntime().exec("Notepad.exe " + fileName);

		

	}

}
