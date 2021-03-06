package com.designPatern.StructuralDesignPatterns.DecoratorPattern;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

class MagicString {
	private String stirng;

	public MagicString(String stirng) {
		this.stirng = stirng;
	}

//	Addon method 
	public long getNumberOfVowels() {
		return stirng
				.chars()
					.mapToObj(c -> (char) c)
				     .filter(c -> "aeiou"
				        .contains(c.toString()))
				            .count();
	}
// return the decorated object 
	@Override
	public String toString() {
		return stirng;
	}

	public IntStream chars() {
		return stirng.chars();
	}

	public IntStream codePoints() {
		return stirng.codePoints();
	}

	public int length() {
		return stirng.length();
	}

	public boolean isEmpty() {
		return stirng.isEmpty();
	}

	public char charAt(int index) {
		return stirng.charAt(index);
	}

	public int codePointAt(int index) {
		return stirng.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return stirng.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return stirng.codePointCount(beginIndex, endIndex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return stirng.offsetByCodePoints(index, codePointOffset);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		stirng.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		stirng.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return stirng.getBytes(charsetName);
	}

	public byte[] getBytes(Charset charset) {
		return stirng.getBytes(charset);
	}

	public byte[] getBytes() {
		return stirng.getBytes();
	}

	public boolean contentEquals(StringBuffer sb) {
		return stirng.contentEquals(sb);
	}

	public boolean contentEquals(CharSequence cs) {
		return stirng.contentEquals(cs);
	}

	public boolean equalsIgnoreCase(String anotherString) {
		return stirng.equalsIgnoreCase(anotherString);
	}

	public int compareTo(String anotherString) {
		return stirng.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return stirng.compareToIgnoreCase(str);
	}

	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return stirng.regionMatches(toffset, other, ooffset, len);
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return stirng.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	public boolean startsWith(String prefix, int toffset) {
		return stirng.startsWith(prefix, toffset);
	}

	public boolean startsWith(String prefix) {
		return stirng.startsWith(prefix);
	}

	public boolean endsWith(String suffix) {
		return stirng.endsWith(suffix);
	}

	public int indexOf(int ch) {
		return stirng.indexOf(ch);
	}

	public int indexOf(int ch, int fromIndex) {
		return stirng.indexOf(ch, fromIndex);
	}

	public int lastIndexOf(int ch) {
		return stirng.lastIndexOf(ch);
	}

	public int lastIndexOf(int ch, int fromIndex) {
		return stirng.lastIndexOf(ch, fromIndex);
	}

	public int indexOf(String str) {
		return stirng.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return stirng.indexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return stirng.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return stirng.lastIndexOf(str, fromIndex);
	}

	public String substring(int beginIndex) {
		return stirng.substring(beginIndex);
	}

	public String substring(int beginIndex, int endIndex) {
		return stirng.substring(beginIndex, endIndex);
	}

	public CharSequence subSequence(int beginIndex, int endIndex) {
		return stirng.subSequence(beginIndex, endIndex);
	}

	public String concat(String str) {
		return stirng.concat(str);
	}

	public String replace(char oldChar, char newChar) {
		return stirng.replace(oldChar, newChar);
	}

	public boolean matches(String regex) {
		return stirng.matches(regex);
	}

	public boolean contains(CharSequence s) {
		return stirng.contains(s);
	}

	public String replaceFirst(String regex, String replacement) {
		return stirng.replaceFirst(regex, replacement);
	}

	public String replaceAll(String regex, String replacement) {
		return stirng.replaceAll(regex, replacement);
	}

	public String replace(CharSequence target, CharSequence replacement) {
		return stirng.replace(target, replacement);
	}

	public String[] split(String regex, int limit) {
		return stirng.split(regex, limit);
	}

	public String[] split(String regex) {
		return stirng.split(regex);
	}

	public String toLowerCase(Locale locale) {
		return stirng.toLowerCase(locale);
	}

	public String toLowerCase() {
		return stirng.toLowerCase();
	}

	public String toUpperCase(Locale locale) {
		return stirng.toUpperCase(locale);
	}

	public String toUpperCase() {
		return stirng.toUpperCase();
	}

	public String trim() {
		return stirng.trim();
	}

	public char[] toCharArray() {
		return stirng.toCharArray();
	}

	public String intern() {
		return stirng.intern();
	}
}

public class A_MagicString {
	public static void main(String[] args) {
		MagicString obj = new MagicString("India will conquar the world");
		System.out.println(obj + " has " + obj.getNumberOfVowels() + " vowel ");
	}
}
