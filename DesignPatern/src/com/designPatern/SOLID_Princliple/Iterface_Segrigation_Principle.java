package com.designPatern.SOLID_Princliple;

import java.io.IOException;

class Document {

}

interface Machine {
	void print(Document d) throws IOException;

	void scan(Document d) throws IOException;

	void fax(Document d) throws IOException;
}

interface Printer {
	void print(Document d) throws IOException;
}

interface IScanner {
	void scan(Document d) throws IOException;
}

interface MultiFunctionDevice extends Printer, IScanner {

}

class OldFashionedPrinter implements Machine {

	@Override
	public void print(Document d) throws IOException {
		System.out.println("OldFashionedPrinter working");
	}

	@Override
	public void scan(Document d) throws IOException {
		// will not work because functionality not present
	}

	@Override
	public void fax(Document d) throws IOException {
		// will not work because functionality not present
	}

}

class MultiFunctionPrinter implements Machine {

	@Override
	public void print(Document d) throws IOException {
		System.out.println("MultiFunctionPrinter -print");
	}

	@Override
	public void scan(Document d) throws IOException {
		System.out.println("MultiFunctionPrinter -scan");
	}

	@Override
	public void fax(Document d) throws IOException {
		System.out.println("MultiFunctionPrinter - fax");
	}
}

class OnlyPrint implements Printer {

	@Override
	public void print(Document d) throws IOException {
		System.out.println("OnlyPrint");
	}
}

class Photocopier implements Printer, IScanner {

	@Override
	public void scan(Document d) throws IOException {
		System.out.println("Photocopier-print");
	}

	@Override
	public void print(Document d) throws IOException {
     System.out.println("Photocopier--scan");
	}
}

class MultiFunctionMachine implements MultiFunctionDevice {

	private Printer printer;
	private IScanner scanner;

	public MultiFunctionMachine(Printer printer, IScanner scanner) {
		super();
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void print(Document d) throws IOException {
		printer.print(d);
	}

	@Override
	public void scan(Document d) throws IOException {
		scanner.scan(d);
	}

}

public class Iterface_Segrigation_Principle {

	public static void main(String[] args) throws IOException {
		Document d = new Document();
		
		MultiFunctionMachine m = new MultiFunctionMachine(new Printer() {
			
			@Override
			public void print(Document d) throws IOException {
				System.out.println("MultiFunctionMachine -Print");
			}
		}, new IScanner() {
			
			@Override
			public void scan(Document d) throws IOException {
				System.out.println("MultiFunctionMachine -scan");
			}
		});
		m.print(d);
		m.scan(d);
		
		OldFashionedPrinter o = new OldFashionedPrinter();
		o.print(d);
		o.fax(d);
		
		MultiFunctionPrinter mp = new MultiFunctionPrinter();
		mp.scan(d);
		mp.print(d);
		mp.fax(d);
		
		OnlyPrint op = new OnlyPrint();
		op.print(d);
		
		Photocopier pc = new Photocopier();
		pc.print(d);
		pc.scan(d);
	}

}
