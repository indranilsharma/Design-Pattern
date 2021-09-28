package com.designPatern.StructuralDesignPatterns.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

class FormattedText {
	private String plainText;
	private boolean[] capitalize;

//	 memory waste without flyweight
	public FormattedText(String plainText) {
		this.plainText = plainText;
//		 Memory waste 
		capitalize = new boolean[plainText.length()];
	}

	public void capitalize(int start, int end) {
		for (int i = start; i < end; i++) {
			capitalize[i] = true;
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			sb.append(capitalize[i] ? Character.toUpperCase(c) : c);
		}
		return sb.toString();
	}
}

// with memory optimization
class BetterFormattedText {

	private String plainText;
	private List<TextRange> formatting = new ArrayList<>();

	public BetterFormattedText(String plainText) {
		this.plainText = plainText;
	}

	class TextRange {
		public int start, end;
		public boolean capitalize, bold, italic;

		public TextRange(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public boolean covers(int position) {
			return position >= start && position <= end;
		}
	}

	public TextRange getRange(int start, int end) {
		TextRange range = new TextRange(start, end);
		formatting.add(range);
		return range;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < plainText.length(); ++i) {
			char c = plainText.charAt(i);
			for (TextRange range : formatting)
				if (range.covers(i) && range.capitalize)
					c = Character.toUpperCase(c);
			sb.append(c);
		}
		return sb.toString();
	}
}

public class Flyweight_Beter_formated_Text {
	public static void main(String[] args) {
		FormattedText ft = new FormattedText("India win at Oval after 50 years");
		ft.capitalize(13, 17);
		System.out.println(ft);

		BetterFormattedText bft = new BetterFormattedText("India win at Oval after 50 years");
//		 memory waste not happening
		bft.getRange(13, 17).capitalize = true;
		System.out.println(bft);
	}
}
