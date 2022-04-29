package com.library;

public class LibraryJar {
	
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	public static void main(String[] args) {
		new LibraryJar();
	}
	
	public LibraryJar() {
		System.out.println(outpuHello("Hello LibraryJar!"));
	}
	
	public String outpuHello(String inputString) {
		String outputString = 
				" =========================================" + LINE_SEPARATOR +
				" " + inputString + LINE_SEPARATOR +
				" =========================================" + LINE_SEPARATOR
				;
		return outputString;
	}
}