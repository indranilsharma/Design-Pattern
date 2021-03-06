package com.designPatern.SOLID_Princliple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

enum Colour {
	RED, GREEN, BLUE, BLACK
}

enum Size {
	SMALL, MEDIUM, LARGE, EXTRA_LARGE
}

class Product {

	public String name;
	public Colour colour;
	public Size size;

	public Product(String name, Colour colour, Size size) {
		this.name = name;
		this.colour = colour;
		this.size = size;
	}
}

class ProductFilter {
	public Stream<Product> filterByColour(List<Product> products, Colour colour) {
		return products.stream().filter(p -> p.colour == colour);
	}

	public Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(p -> p.size == size);
	}

	public Stream<Product> filterByColourAndSize(List<Product> products, Colour colour, Size size) {
		return products.stream().filter(p -> p.colour == colour && p.size == size);
	}
}

interface Specification<T> {
	boolean isSatisfied(T item);
}

interface Filter<T> {
	Stream<T> filter(List<T> items, Specification<T> spec);
}

class ColourSpecification implements Specification<Product> {

	private Colour colour;

	public ColourSpecification(Colour colour) {
		this.colour = colour;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.colour == colour;
	}
}

class SizeSpecification implements Specification<Product> {

	private Size size;

	public SizeSpecification(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.size == size;
	}
}

class AndSpecification<T> implements Specification<T> {

	private Specification<T> first, second;

	public AndSpecification(Specification<T> first, Specification<T> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}
}

class BetterFiletr implements Filter<Product> {

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
		return items.stream().filter(p -> spec.isSatisfied(p));
	}

}

public class Open_Close_Principle {

	public static void main(String[] args) {
		Product pen = new Product("Pen", Colour.RED, Size.SMALL);
		Product brass = new Product("Brass", Colour.BLUE, Size.LARGE);
		Product car = new Product("Car", Colour.RED, Size.LARGE);
		Product kite = new Product("Kite", Colour.RED, Size.LARGE);

//		List<Product> products = List.of(pen, brass, car);
		List<Product> products = Arrays.asList(pen, brass, car, kite);
		System.out.println("Open And Close Rule violated");
		ProductFilter pf = new ProductFilter();
		pf.filterByColour(products, Colour.RED).forEach(p -> System.out.println(" " + p.name + " is Red"));
		System.out.println("Open And Close Rule Keep");
		BetterFiletr bf = new BetterFiletr();
		bf.filter(products, new ColourSpecification(Colour.RED))
				.forEach(p -> System.out.println(" " + p.name + " is Red"));
		System.out.println("Combine method are coming ");
		bf.filter(products,
				new AndSpecification<>(new ColourSpecification(Colour.RED), new SizeSpecification(Size.LARGE)))
				.forEach(p -> System.out.println(" " + p.name + " having Size Large and Colour Red"));
	}
}
