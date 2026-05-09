package com.fundmentconstructors;

public class Const7 {
	String director;
	String producer;
	String hero;
	String heroine;
	String moviename;
	double price; 
	Const7(){

	}
	//copy constructor
	Const7(String director,String producer){
    this.director=director;
    this.producer=producer;
	}
	Const7(Const7 c,String hero,String heroine){
this.director=c.director;
this.producer=c.producer;
this.hero=hero;
this.heroine=heroine;
	}
	//Const7(){

//	}
	public static void main(String[] args) {
Const7 c1=new Const7();
c1.show();
Const7 c2=new Const7("shankar","raju");
c2.show();
Const7 c3=new Const7(c2,"pawan kalyan","srileela");
c3.show();

	}
void show() {
	System.out.println("enter  the director:"+director);
	System.out.println("enter  the producer:"+producer);
	System.out.println("enter  the hero:"+hero);
	System.out.println("enter  the heroine:"+heroine);
	System.out.println("enter  the movie name:"+moviename);
	System.out.println("enter  the price:"+price);
}
}
