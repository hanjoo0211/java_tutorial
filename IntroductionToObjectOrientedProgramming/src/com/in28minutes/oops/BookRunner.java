package com.in28minutes.oops;

public class BookRunner {

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book("The Art of Computer Programming");
        Book effectiveJava = new Book("Effective Java");
        Book cleanCode = new Book("Clean Code");

        artOfComputerProgramming.read();
        effectiveJava.read();
        cleanCode.read();

    }
}
