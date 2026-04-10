package com.javaintro;
import java.math.BigInteger;
import java.math.BigDecimal;
class Dog{
	
}


public class Datatypes {
String s="sri";
int age=40;
Integer i1;
BigInteger i2;
BigDecimal bd;
BigDecimal b1=new BigDecimal(3445566.645);
BigInteger b2 =new BigInteger("10");
BigInteger b3 =new BigInteger("10");
 static void main(String[] args) {
	 System.out.println("main");
Datatypes dt=new Datatypes();
System.out.println(dt.s);
System.out.println(dt.age);
System.out.println(dt.b1);
System.out.println(dt.b2.add(dt.b3));
System.out.println(dt.b2.multiply(dt.b3));
}
}


