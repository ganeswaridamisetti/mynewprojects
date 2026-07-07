package com.oops.shallowdeep.copy;

class Author {
    String name;

    Author(String name) {
        this.name = name;
    }
}

class Book implements Cloneable {
    int bid;
    String bname;
    Author author;

    Book(int bid, String bname, Author author) {
        this.bid = bid;
        this.bname = bname;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow Copy
    }
}


public class shallowcopy2 {
    public static void main(String[] args) throws CloneNotSupportedException {
    	System.err.println("Details of books and Author...!!!");

    	Author a=new Author("ganeswari");
		Book emp1=new Book(1,"yourself",a);
		System.out.println("book id: "+emp1.bid);
		System.out.println("book name :"+emp1.bname);
		System.out.println("author name :"+emp1.author.name);
		System.err.println("***************************************");
		Book emp2 = (Book) emp1.clone();
		System.out.println("book id: "+emp2.bid);
		System.out.println("book name :"+emp2.bname);
		System.out.println("author name :"+emp2.author.name);
		System.err.println("***************************************");
		emp2.bname="live not lived";
		emp2.author.name="srikanth";
		System.out.println("book id: "+emp2.bid);
		System.out.println("book name :"+emp2.bname);
		System.out.println("author name :"+emp2.author.name);
		System.err.println("***************************************");
		System.out.println("book id: "+emp1.bid);
		System.out.println("book name :"+emp1.bname);
		System.out.println("author name :"+emp1.author.name);
		System.err.println("***************************************");

}
}